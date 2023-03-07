package StarWars;

/**
 *
 * @author rutvac
 */
public class Tripulant {

    private String nombretri;
    private int id;
    private String perfil;

    public Tripulant(String nombretri, int id, String Perfil) {
        this.nombretri = nombretri;
        if (this.id < 0) {
            this.id = 0;
            System.out.println("El id introducido es negativo,se le ha asignado por defecto 0");
        } else {
            this.id = id;
        }
        if (this.perfil == "Piloto" || this.perfil == "Copiloto" || this.perfil == "Pasajero") {
            this.perfil = perfil;
        } else {
            this.perfil = "Pasajero";
        }
    }

    public void mostrar() {
        System.out.println("El " + this.perfil + " con nombre " + this.nombretri + " tiene el siguiente id " + this.id);
    }

    public String getNombre() {
        return nombretri;
    }

    public void setNombre(String nombre) {
        this.nombretri = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

}
