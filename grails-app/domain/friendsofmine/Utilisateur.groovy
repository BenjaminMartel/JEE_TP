package friendsofmine

class Utilisateur {
    String nom,prenom,email,sexe
    Date dateNaissance

    static hasMany = [
            activites: Activite
    ]

    static constraints = {
        nom blank: false, nullable: false
        prenom blank: false, nullable: false
        email nullable: false, email:true
                // matches: "[a-z]+@[a-z]+.[a-z]+"
        sexe nullable: false, inList: ["M","F"]
        dateNaissance nullable: true
    }
}
