import java.util.ArrayList;
import java.util.List;

interface Observateur {
    void notifier(String evenement);
}

class ObservateurEmail implements Observateur {
    @Override
    public void notifier(String evenement) {
        System.out.println("[Email] Nouvel événement reçu : " + evenement);
    }
}

class ObservateurLog implements Observateur {
    @Override
    public void notifier(String evenement) {
        System.out.println("[Log] Événement enregistré : " + evenement);
    }
}

class Sujet {
    private List<Observateur> observateurs = new ArrayList<>();

    public void ajouterObservateur(Observateur observateur) {
        observateurs.add(observateur);
    }

    public void notifierTous(String evenement) {
        for (Observateur o : observateurs) {
            o.notifier(evenement);
        }
    }
}

public class Observer {
    public static void main(String[] args) {
        Sujet sujet = new Sujet();
        sujet.ajouterObservateur(new ObservateurEmail());
        sujet.ajouterObservateur(new ObservateurLog());

        sujet.notifierTous("Nouvelle commande passée");
    }
}