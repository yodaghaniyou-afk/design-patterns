class Observateur:
    def notifier(self, evenement):
        raise NotImplementedError


class ObservateurEmail(Observateur):
    def notifier(self, evenement):
        print(f"[Email] Nouvel événement reçu : {evenement}")


class ObservateurLog(Observateur):
    def notifier(self, evenement):
        print(f"[Log] Événement enregistré : {evenement}")


class Sujet:
    def __init__(self):
        self.observateurs = []

    def ajouter_observateur(self, observateur):
        self.observateurs.append(observateur)

    def notifier_tous(self, evenement):
        for observateur in self.observateurs:
            observateur.notifier(evenement)


if __name__ == "__main__":
    sujet = Sujet()
    sujet.ajouter_observateur(ObservateurEmail())
    sujet.ajouter_observateur(ObservateurLog())

    sujet.notifier_tous("Nouvelle commande passée")