package ejercicio1pooii;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rutvac
 */
public class Ejercicio1POOII {

    /**
     * @param args the command line arguments
     */
    public static void iter(ArrayList frutas) {
        Iterator iter = frutas.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Aliment a1 = new Aliment("Naranjas", 3);
        Aliment a2 = new Aliment("Platanos", 7);
        Aliment a3 = new Aliment("Melocotones", 8);
        Aliment a4 = new Aliment("Mandarinas", 1);
        Aliment a5 = new Aliment("Peras", 6);

        ArrayList frutas = new ArrayList();

        frutas.add(a1);
        frutas.add(a2);
        frutas.add(a3);
        frutas.add(a4);
        frutas.add(a5);

        iter(frutas);

        frutas.remove(a4);
        frutas.remove(a2);

        frutas.add(1, new Aliment("Manzanas", 2));

        System.out.println("------------------------------");
        iter(frutas);

        frutas.clear();
        if (frutas.isEmpty()) {
            System.out.println("ArrayList vacio");
        } else {
            System.out.println("ArrayList no vacio");
        }

    }
}
