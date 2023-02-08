
package ejemplo3;

/**
 *
 * @author rutvac
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cliente c = new Cliente("30435624X", "Juan", "Perez");
        Vehiculo v = new Vehiculo("4050 ABJ", "SEAT", "ARONA", "Gris", 12000);
        VehiculoAlquilado alq = new VehiculoAlquilado(c, v, 3, 5, 2, 3);
        System.out.println("Vehiculo Alquilado");
        System.out.println("Cliente: " + alq.getCliente().getDni() + " " + alq.getCliente().getNombre() + " " + alq.getCliente().getApellidos());
        System.out.println("Vehiculo: " + alq.getVehiculo().getMatricula());
    }

}
