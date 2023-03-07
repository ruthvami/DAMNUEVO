package reservas;

import java.util.ArrayList;

public abstract class Proveedor {

    private String NOMBRE;
    private String DIRECCION;
    private String TEL;
    private ArrayList<Hotel> hoteles;

    public Proveedor(String nombre, String direccion, String tel) {
        this.NOMBRE = nombre;
        this.DIRECCION = direccion;
        this.TEL = tel;
        this.hoteles = new ArrayList<>();
    }

    public abstract void anadirhotel(Hotel h);

    public void eliminarhotel(Hotel h) {
        this.getHoteles().add(h);
    }

    public void mostrar() {
        System.out.println("Nombre: " + this.getNOMBRE() + "\n"
                + "Dirección: " + this.getDIRECCION() + "\n"
                + "Numero de telefono: " + this.getTEL());
        for (int i = 0; i < this.getHoteles().size(); i++) {
            System.out.println((i + 1) + ". " + this.getHoteles().get(i).getNOMBRE());
        }
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTEL() {
        return TEL;
    }

    public void setTEL(String TEL) {
        this.TEL = TEL;
    }

    public ArrayList<Hotel> getHoteles() {
        return hoteles;
    }

    public void setHoteles(ArrayList<Hotel> hoteles) {
        this.hoteles = hoteles;
    }
}
