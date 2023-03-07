package reservas;

public class DMC extends Proveedor {

    private String contacto;
    private String delegacion;

    public DMC(String nombre, String direccion, String tel, String contacto, String delegacion) {
        super(nombre, direccion, tel);
        this.contacto = contacto;
        this.delegacion = delegacion;
    }

    @Override
    public void anadirhotel(Hotel h) {
        if (h.isDisponibilidad()) {
            this.getHoteles().add(h);
        } else {
            System.out.println("El hotel no tiene disponibilidad");
        }
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Grupo: " + this.getContacto() + "\n"
                + "Delegacion: " + this.getDelegacion());
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDelegacion() {
        return delegacion;
    }

    public void setDelegacion(String delegacion) {
        this.delegacion = delegacion;
    }

}
