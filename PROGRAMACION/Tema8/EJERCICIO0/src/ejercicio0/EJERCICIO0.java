package ejercicio0;

/**
 *
 * @author rutvac
 */
public class EJERCICIO0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Thomas = new Persona();
        Thomas.edat = 84;
        int edat = Thomas.edat;
        Thomas.nom = "Thomas Alva Edison";
        System.out.println(Thomas.nom + " va morir a l'edat de " + edat + " anys");
        if (Thomas.esMajorEdat()) {
            System.out.println(Thomas.nom + " es mayor de edat");
        } else {
            System.out.println(Thomas.nom + " no es mayor de edat");
        }
    }

}
