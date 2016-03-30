package friendsofmine

import grails.transaction.Transactional

@Transactional
class ActiviteService {

    def insertOrUpdateActiviteForResponsable(Activite activite, Utilisateur responsable) {
        responsable.addToActivites(activite)
        responsable.save(flush: true)
        return activite
    }

    def deleteActivite(Activite activite) {
        activite.responsable.removeFromActivites(activite)
        activite.delete()
    }

}
