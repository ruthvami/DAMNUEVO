package StarWars;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Carrega extends Creuer {

    private double carga;

    public Carrega(String nombretri, int id, String Perfil, String nombrenau, String matricula, double ALTITUDMAX, double pesomax, double carga) {
        super(nombretri, id, Perfil, nombrenau, matricula, ALTITUDMAX, pesomax);
        this.carga = carga;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Kilos de carga:" + this.carga);//son los kilos que tiene la nave de carga

    }

    public void añadirtrip(ArrayList trip) {
        if (trip.size() <= 4) {
            for (int i = 0; i < trip.size(); i++) {
                this.añadirtrip(trip);

            }
        }
    }
}
