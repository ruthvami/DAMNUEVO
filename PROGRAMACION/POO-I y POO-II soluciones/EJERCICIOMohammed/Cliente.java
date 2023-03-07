package reservas;

public class Cliente {

    private final String NOMBRE;
    private final String APELLIDOS;
    private final String DNI;
    private final String TEL;
    private final String CORREO;
    private final int EDAD;

    public Cliente(String nombre, String apellidos, String dni, String tel, String correo, int edad) {
        this.NOMBRE = nombre;
        this.APELLIDOS = apellidos;
        this.DNI = dni;
        this.TEL = tel;
        this.CORREO = correo;
        this.EDAD = edad;
    }

    public void mostrar() {
        System.out.println("Nombre y Apellidos: " + this.getNOMBRE() + " " + this.getAPELLIDOS() + "\n"
                + "DNI: " + this.getDNI() + "\n"
                + "Número de telefono: " + this.getTEL() + "\n"
                + "Correo electronico: " + this.getCORREO() + "\n"
                + "Edad: " + this.getEDAD());
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public String getDNI() {
        return DNI;
    }

    public String getTEL() {
        return TEL;
    }

    public String getCORREO() {
        return CORREO;
    }

    public int getEDAD() {
        return EDAD;
    }
}
