package reservas;

import java.util.ArrayList;

public class Hotel {

    private final String NOMBRE;
    private final String DIRECCION;
    private final int CATEGORIA;
    private ArrayList<Cliente> clientes;
    private final String DELEGACION;
    private boolean disponibilidad;
    private double precio;
    private ArrayList<String> notas;
    private Proveedor proveedores;

    public Hotel(String nombre, String direccion, int categoria, String delegacion, boolean disponibilidad, double precio, Proveedor proveedores) {
        this.NOMBRE = nombre;
        this.DIRECCION = direccion;
        this.CATEGORIA = categoria;
        this.DELEGACION = delegacion;
        this.disponibilidad = disponibilidad;
        this.precio = precio;
        this.proveedores = proveedores;
        this.notas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public void Bloquear() {
        this.setDisponibilidad(false);
    }

    public void AnadirClientes(Cliente c) {
        this.getClientes().add(c);
    }

    public void AnadirNotas(String n) {
        this.getNotas().add(n);
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.getNOMBRE() + "\n"
                + "Dirección: " + this.getDIRECCION() + "\n"
                + "Categoría: " + this.getCATEGORIA() + " estrellas \n"
                + "Delegación: " + this.getDELEGACION() + "\n"
                + "Disponibilidad: " + this.isDisponibilidad() + "\n"
                + "Proveedor: " + this.getProveedores().getNOMBRE() + "\n"
                + "Precio por noche: " + this.getPrecio() + "€" + "\n"
                + "Clientes: ");
        for (int i = 0; i < this.getClientes().size(); i++) {
            System.out.println((i + 1) + " ." + this.getClientes().get(i).getDNI());
        }
        System.out.println("Notas: ");
        for (int i = 0; i < this.getNotas().size(); i++) {
            System.out.println((i + 1) + " ." + this.getNotas().get(i));
        }

    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public int getCATEGORIA() {
        return CATEGORIA;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getDELEGACION() {
        return DELEGACION;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public ArrayList<String> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<String> notas) {
        this.notas = notas;
    }

    public Proveedor getProveedores() {
        return proveedores;
    }

    public void setProveedores(Proveedor proveedores) {
        this.proveedores = proveedores;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
