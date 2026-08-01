# Model : gère les données
class ModelUtilisateur:
    def __init__(self, nom, age):
        self.nom = nom
        self.age = age


# View : gère uniquement l'affichage
class VueUtilisateur:
    def afficher(self, nom, age):
        print(f"Utilisateur : {nom}, {age} ans")


# Controller : fait le lien entre Model et View
class ControllerUtilisateur:
    def __init__(self, model, vue):
        self.model = model
        self.vue = vue

    def mettre_a_jour_age(self, nouvel_age):
        self.model.age = nouvel_age

    def afficher_utilisateur(self):
        self.vue.afficher(self.model.nom, self.model.age)


if __name__ == "__main__":
    model = ModelUtilisateur("Yoda", 25)
    vue = VueUtilisateur()
    controller = ControllerUtilisateur(model, vue)

    controller.afficher_utilisateur()
    controller.mettre_a_jour_age(26)
    controller.afficher_utilisateur()