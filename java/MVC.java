// Model : gère les données
class ModelUtilisateur {
    private String nom;
    private int age;

    public ModelUtilisateur(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// View : gère uniquement l'affichage
class VueUtilisateur {
    public void afficher(String nom, int age) {
        System.out.println("Utilisateur : " + nom + ", " + age + " ans");
    }
}

// Controller : fait le lien entre Model et View
class ControllerUtilisateur {
    private ModelUtilisateur model;
    private VueUtilisateur vue;

    public ControllerUtilisateur(ModelUtilisateur model, VueUtilisateur vue) {
        this.model = model;
        this.vue = vue;
    }

    public void mettreAJourAge(int nouvelAge) {
        model.setAge(nouvelAge);
    }

    public void afficherUtilisateur() {
        vue.afficher(model.getNom(), model.getAge());
    }
}

public class MVC {
    public static void main(String[] args) {
        ModelUtilisateur model = new ModelUtilisateur("Yoda", 25);
        VueUtilisateur vue = new VueUtilisateur();
        ControllerUtilisateur controller = new ControllerUtilisateur(model, vue);

        controller.afficherUtilisateur();
        controller.mettreAJourAge(26);
        controller.afficherUtilisateur();
    }
}