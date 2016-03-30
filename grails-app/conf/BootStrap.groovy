
import friendsofmine.JeuTestService
import friendsofmine.Utilisateur

class BootStrap {

    JeuTestService jeuTestService

    def init = { servletContext ->

        jeuTestService.createJeuTestForUtilisateurs()
        jeuTestService.createJeuTestFoActivite()
        jeuTestService.createJeuTestForInscription()

    }
    def destroy = {
    }
}

/*import friendsofmine.JeuTestService
import friendsofmine.Utilisateur
class BootStrap {

    JeuTestService jeuTestService

    def init = { servletContext ->
        //création et insertion d'utilisateurs
        try {
            new Utilisateur(nom: "MARTEL", prenom: "Benjamin", email: "benjaminmartel31@gmail.com", sexe: "M", dateNaissance: new Date(1993, 4, 21)).save()
            new Utilisateur(nom: "PATALA", prenom: "Pat", email: "patpatala@gmail.com", sexe: "M", dateNaissance: null).save()
            //RuntimeException()
            new Utilisateur(nom: "EMINEM", prenom: "Marshall", email: "eminem@gmail.com", sexe: "M", dateNaissance: null).save()
            new Utilisateur(nom: "RHYMES", prenom: "Busta", email: "bustarhymes@gmail.com", sexe: "M", dateNaissance: null).save()
            new Utilisateur(nom: "RAIKONNEN", prenom: "Kimi", email: "kimiraikonnen@gmail.com", sexe: "M", dateNaissance: null).save()
        } catch (all) {
            println("ERROR: Erreur dans le catch de création et d'insertion de 5 utilisateurs !\n")
        }
        try {
            jeuTestService.createJeuTestFoActivite()
        } catch (all) {
            println("ERROR: Erreur dans le catch de d'insertion de 3 activités !\n")
        }
    }
    def destroy = {
    }
}*/
