package StarWars;

/**
 *
 * @author rutvac
 */
public class Passatgers extends Creuer {

    private double nummaxpassajeros;

    public Passatgers(String nombretri, int id, String Perfil, String nombrenau, String matricula, double ALTITUDMAX, double pesomax, double nummaxpassajeros) {
        super(nombretri, id, Perfil, nombrenau, matricula, ALTITUDMAX, pesomax);
        this.nummaxpassajeros = nummaxpassajeros;
    }

    public void mostrar() {
        super.mostrar();
        System.out.println("Nº maximo de passajeros: " + this.nummaxpassajeros);
    }
}
