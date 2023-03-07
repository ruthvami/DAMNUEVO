package biblioteques;

public class Usuari {
    
    private String nom, ciutat;
    private static int num=0;

    public Usuari(String nom, String ciutat) {
        this.nom = nom;
        this.ciutat = ciutat;
        num++;
    }

    public String getNom() {
        return nom;
    }
    
    public static String numUsuaris() {
        return "Hi ha "+num+" usuaris registrats.";
    }
    
}
    //Marc Martínez Sanchis