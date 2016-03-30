package friendsofmine

import grails.transaction.Transactional

@Transactional
class InscriptionService {

    def insertOrUpdateInscription(Inscription uneInscription) {
        uneInscription.dateInscription = new Date()
        uneInscription.save(flush: true)
        return uneInscription
    }

    def deleteInscription(Inscription uneInscription) {
        uneInscription.delete(flush: true)
    }

    def searchInscriptions(String titre, String responsableNomPrenom, String personneNomPrenom) {

        def criteria = Inscription.createCriteria()
        def results = criteria.list {
            if(titre) {
                activite {
                    like('titre', "%${titre}%")
                }
            }
            if(responsableNomPrenom) {
                activite {
                    responsable {
                        or {
                            like('nom',"%${responsableNomPrenom}%")
                            like('prenom',"%${responsableNomPrenom}%")
                        }
                    }
                }
            }
            if(personneNomPrenom) {
                utilisateur {
                    or {
                        like('nom', "%${personneNomPrenom}%")
                        like('prenom', "%${personneNomPrenom}%")
                    }
                }
                activite {
                    order('titre', "asc")
                }
            }
            if(!titre && !responsableNomPrenom && !personneNomPrenom) {
                activite {
                    order('titre', "asc")
                }
            }
            join 'activite.responsable'
        }
        return results
    }
}
