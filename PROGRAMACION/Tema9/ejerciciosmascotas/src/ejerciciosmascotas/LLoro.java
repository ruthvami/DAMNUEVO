/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmascotas;

/**
 *
 * @author rutvac
 */
public class LLoro extends Aus {
    private String origen;
    private boolean parla;
    
    public LLoro(String nom,int edat,String estat,String data,String bec,boolean vola,String origen, boolean parla){
        super(nom, edat, estat, data,bec,vola);
        this.origen=origen;
        this.parla=parla;
    }
    public void mostrar() {
        super.mostrar();
        System.out.print("Origen:" + this.origen);
        if (this.parla) {
            System.out.println("Si parla");
        }else{
            System.out.println("No parla");
        }
    }
    @Override
    public void parla(){
        super.parla();
    }
    public void volar(boolean elejir){
       
        setVola(elejir);
    
    }
}
