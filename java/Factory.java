interface Notification {
    void envoyer(String message);
}

class NotificationEmail implements Notification {
    @Override
    public void envoyer(String message) {
        System.out.println("[Email] Envoi du message : " + message);
    }
}

class NotificationSMS implements Notification {
    @Override
    public void envoyer(String message) {
        System.out.println("[SMS] Envoi du message : " + message);
    }
}

class NotificationFactory {
    public static Notification creer(String type) {
        switch (type) {
            case "email":
                return new NotificationEmail();
            case "sms":
                return new NotificationSMS();
            default:
                throw new IllegalArgumentException("Type de notification inconnu : " + type);
        }
    }
}

public class Factory {
    public static void main(String[] args) {
        Notification notif1 = NotificationFactory.creer("email");
        notif1.envoyer("Bienvenue !");

        Notification notif2 = NotificationFactory.creer("sms");
        notif2.envoyer("Votre code est 1234");
    }
}