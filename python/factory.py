class Notification:
    def envoyer(self, message):
        raise NotImplementedError


class NotificationEmail(Notification):
    def envoyer(self, message):
        print(f"[Email] Envoi du message : {message}")


class NotificationSMS(Notification):
    def envoyer(self, message):
        print(f"[SMS] Envoi du message : {message}")


class NotificationFactory:
    @staticmethod
    def creer(type_notification):
        if type_notification == "email":
            return NotificationEmail()
        elif type_notification == "sms":
            return NotificationSMS()
        else:
            raise ValueError(f"Type de notification inconnu : {type_notification}")


if __name__ == "__main__":
    notif1 = NotificationFactory.creer("email")
    notif1.envoyer("Bienvenue !")

    notif2 = NotificationFactory.creer("sms")
    notif2.envoyer("Votre code est 1234")