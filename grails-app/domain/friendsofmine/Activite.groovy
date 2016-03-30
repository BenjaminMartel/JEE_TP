package friendsofmine

class Activite {
    String titre
    String descriptif
    Utilisateur responsable

    static constraints = {
        titre blank: false, nullable: false
        descriptif nullable: true
        responsable nullable: false

        /*titre blank: false, nullable: false
        descriptif blank: true, nullable: true*/
    }

    String toString() {
        return "Le titre est : " + this.titre + " et le descriptif est :" + this.descriptif
    }

}
