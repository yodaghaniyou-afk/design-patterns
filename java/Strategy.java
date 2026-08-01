interface StrategiePaiement {
    void payer(int montant);
}

class PaiementCarte implements StrategiePaiement {
    @Override
    public void payer(int montant) {
        System.out.println("Paiement de " + montant + "€ par carte bancaire");
    }
}

class PaiementPaypal implements StrategiePaiement {
    @Override
    public void payer(int montant) {
        System.out.println("Paiement de " + montant + "€ via PayPal");
    }
}

class Panier {
    private StrategiePaiement strategie;

    public Panier(StrategiePaiement strategie) {
        this.strategie = strategie;
    }

    public void changerStrategie(StrategiePaiement strategie) {
        this.strategie = strategie;
    }

    public void payer(int montant) {
        strategie.payer(montant);
    }
}

public class Strategy {
    public static void main(String[] args) {
        Panier panier = new Panier(new PaiementCarte());
        panier.payer(50);

        panier.changerStrategie(new PaiementPaypal());
        panier.payer(30);
    }
}