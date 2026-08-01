class StrategiePaiement:
    def payer(self, montant):
        raise NotImplementedError


class PaiementCarte(StrategiePaiement):
    def payer(self, montant):
        print(f"Paiement de {montant}€ par carte bancaire")


class PaiementPaypal(StrategiePaiement):
    def payer(self, montant):
        print(f"Paiement de {montant}€ via PayPal")


class Panier:
    def __init__(self, strategie: StrategiePaiement):
        self.strategie = strategie

    def changer_strategie(self, strategie: StrategiePaiement):
        self.strategie = strategie

    def payer(self, montant):
        self.strategie.payer(montant)


if __name__ == "__main__":
    panier = Panier(PaiementCarte())
    panier.payer(50)

    panier.changer_strategie(PaiementPaypal())
    panier.payer(30)