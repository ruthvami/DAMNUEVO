package StarWars;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Xwing extends Nau {

    private String nombrerobot;
    private ArrayList armamiento;

    public Xwing(String nombretri, int id, String Perfil, String nombrenau, String matricula, double ALTITUDMAX, String nombrerobot, ArrayList armamiento) {
        super(nombretri, id, Perfil, nombrenau, matricula, ALTITUDMAX);
        this.nombrerobot = nombrerobot;
        this.armamiento = armamiento;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Nombre del robot: " + this.nombrerobot);
        System.out.println("Lista de armamento:");
        for (int i = 0; i < armamiento.size(); i++) {
            System.out.println(this.armamiento.get(i));

        }
    }
}
