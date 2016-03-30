package friendsofmine

class Inscription {
    Utilisateur utilisateur
    Activite activite
    Date dateInscription

    static constraints = {
        dateInscription nullable: false
    }

    static mapping = {
        utilisateur fetch: 'join'
    }
}
