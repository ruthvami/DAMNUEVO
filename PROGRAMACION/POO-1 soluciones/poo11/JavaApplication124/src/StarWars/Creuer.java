package StarWars;

/**
 *
 * @author rutvac
 */
public class Creuer extends Nau {

    private double pesomax;

    public Creuer(String nombretri, int id, String Perfil, String nombrenau, String matricula, double ALTITUDMAX, double pesomax) {
        super(nombretri, id, Perfil, nombrenau, matricula, ALTITUDMAX);
        this.pesomax = pesomax;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Peso maximo que puede transportar: " + this.pesomax);
    }
}
