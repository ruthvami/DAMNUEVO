package StarWars;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class StarWars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList arm = new ArrayList();
        Tripulant trip = new Tripulant("Ricardo", 12, "Pasajero");
        Nau nau = new Nau("Manuel", 133, "Piloto", "Xprime", "12334", 100);
        Xwing wing = new Xwing("Risto", 13, "Copiloto", "Xprime", "12334", 100, "p2", arm);
        Creuer creu = new Creuer("Paolo", 56, "NADA", "Creus", "7789", 10, 23);
        Carrega carr = new Carrega("Paolo", 56, "NADA", "Creus", "7789", 10, 23, 15);
        Passatgers pass = new Passatgers("Paolo", 56, "NADA", "Creus", "7789", 10, 23, 5);

        nau.mostrar();
        nau.añadirtripulantes(creu);
        System.out.println("---------------------------");
        nau.mostrar();
        System.out.println("---------------------------");
        nau.alevarnave(150);
        nau.alevarnave(90);
        System.out.println("---------------------------");
        nau.aterrizar();
        nau.eliminarpasajeros();
        System.out.println("---------------------------");
        nau.mostrar();

        System.out.println("---------------------------");
        trip.mostrar();

        System.out.println("---------------------------");
        wing.mostrar();

        System.out.println("---------------------------");
        creu.mostrar();

        System.out.println("---------------------------");
        carr.mostrar();
        carr.añadirtrip(arm);
        System.out.println("---------------------------");
        pass.mostrar();

    }

}
