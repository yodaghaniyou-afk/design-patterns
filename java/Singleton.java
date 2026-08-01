import java.util.HashMap;
import java.util.Map;

public class Singleton {
    private static Singleton instance;
    private Map<String, String> parametres;

    private Singleton() {
        parametres = new HashMap<>();
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void definir(String cle, String valeur) {
        parametres.put(cle, valeur);
    }

    public String obtenir(String cle) {
        return parametres.get(cle);
    }

    public static void main(String[] args) {
        Singleton config1 = Singleton.getInstance();
        config1.definir("langue", "fr");

        Singleton config2 = Singleton.getInstance();
        System.out.println(config2.obtenir("langue"));
        System.out.println("Même instance : " + (config1 == config2));
    }
}