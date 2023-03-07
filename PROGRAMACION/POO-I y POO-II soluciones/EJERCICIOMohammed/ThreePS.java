package reservas;

public class ThreePS extends Proveedor {

    private String grupo;

    public ThreePS(String nombre, String direccion, String tel, String grupo) {
        super(nombre, direccion, tel);
        this.grupo = grupo;
    }

    @Override
    public void anadirhotel(Hotel h) {
        this.getHoteles().add(h);
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Grupo: "+this.getGrupo());
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

}
