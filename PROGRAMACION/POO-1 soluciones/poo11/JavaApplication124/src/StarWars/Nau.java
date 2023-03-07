package StarWars;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Nau extends Tripulant {

    private String nombrenau;
    private String matricula;
    private double altitud;
    private final double ALTITUDMAX;
    private ArrayList tripulacion = new ArrayList();

    public Nau(String nombretri, int id, String Perfil, String nombrenau, String matricula, double altitudmax) {
        super(nombretri, id, Perfil);
        this.nombrenau = nombrenau;
        this.matricula = matricula;
        this.ALTITUDMAX = altitudmax;
        this.altitud = 0;
    }

    public void aterrizar() {
        if (this.altitud != 0) {
            this.altitud = 0;
            System.out.println("Altitud cambiada a 0, ahora la nave esta aterrizada");
        }

    }

    public void alevarnave(double altnueva) {
        if (altnueva < this.ALTITUDMAX) {
            this.altitud = altnueva;
        } else {
            System.out.println("La altitud "
                    + altnueva + " es mayor que la altitud maxima permitida");
        }

    }

    public void añadirtripulantes(Tripulant trip) {
        tripulacion.add(trip);
    }

    public void eliminarpasajeros() {
        for (int i = 0; i < tripulacion.size(); i++) {
            if (this.getPerfil() != "Piloto" && this.getPerfil() != "Copiloto") {
                tripulacion.remove(i);
            }

        }
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.nombrenau + "\nTipo de nave: " + this.getClass().getSimpleName());
        System.out.println("Matricula: " + this.matricula + "\nAltitud maxima: " + this.ALTITUDMAX);
        System.out.println("Nº tripulantes: " + tripulacion.size());
    }
}
