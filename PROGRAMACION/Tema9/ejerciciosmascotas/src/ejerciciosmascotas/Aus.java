package ejerciciosmascotas;

import java.util.Date;

/**
 *
 * @author rutvac
 */
public class Aus extends Mascotas{
    private String bec;
    private boolean vola;
    
    public Aus(String nom,int edat,String estat,String data,String bec,boolean vola){
        super(nom, edat, estat, data);
        this.bec=bec;
        this.vola=vola;
    }
    public void mostrar() {
        super.mostrar();
        System.out.print("Bec:" + this.bec);
        if (this.vola) {
            System.out.println("Si vola");
        }else{
            System.out.println("No vola");
        }
    }
    @Override
    public void parla(){
        System.out.println("PIOO");
    }
    public void volar(boolean elejir){
       
        setVola(elejir);
    
    }

    public void setVola(boolean vola) {
        this.vola = vola;
    }
}
