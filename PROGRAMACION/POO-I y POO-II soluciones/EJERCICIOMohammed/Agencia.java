package reservas;

import java.util.ArrayList;

public class Agencia {

    private final String NOMBRE;
    private final String DIRECCION;
    private String TEL;
    private String ACC_MANAGER;
    private final String GRUPO;
    private ArrayList<Cliente> clientes;
    private ArrayList<Reserva> reservas;

    public Agencia(String nombre, String direccion, String tel, String acc_manager, String grupo) {
        this.NOMBRE = nombre;
        this.DIRECCION = direccion;
        this.TEL = tel;
        this.ACC_MANAGER = acc_manager;
        this.GRUPO = grupo;
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void AnadirReserva(Reserva R) {
        this.getReserva().add(R);
    }

    public void EliminarReserva(Reserva R) {
        this.getReserva().remove(R);
    }

    public void AnadirClientes(Cliente C) {
        this.getClientes().add(C);
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.getNOMBRE() + "\n"
                + "Dirección: " + this.getDIRECCION() + "\n"
                + "Número de teléfono: " + this.getTEL() + "\n"
                + "Account Manager: " + this.getACC_MANAGER() + "\n"
                + "Grupo: " + this.getGRUPO() + "\n"
                + "Reservas: ");
        for (int i = 0; i < this.getReserva().size(); i++) {
            System.out.print((i + 1) + ". ");
            System.out.println(this.getReserva().get(i).getID());
        }
        System.out.println("Clientes finales: ");
        for (int i = 0; i < this.getClientes().size(); i++) {
            System.out.print((i + 1) + ". "+this.getClientes().get(i).getDNI());
        }
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public String getACC_MANAGER() {
        return ACC_MANAGER;
    }

    public void setACC_MANAGER(String ACC_MANAGER) {
        this.ACC_MANAGER = ACC_MANAGER;
    }

    public String getGRUPO() {
        return GRUPO;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Reserva> getReserva() {
        return getReservas();
    }

    public void setReserva(ArrayList<Reserva> reservas) {
        this.setReservas(reservas);
    }

    public ArrayList<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

}
