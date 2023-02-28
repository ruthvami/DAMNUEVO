/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmascotas;

/**
 *
 * @author rutvac
 */
public class Canari extends Aus {
    private String color;
    private boolean canta;
    
    public Canari(String nom,int edat,String estat,String data,String bec,boolean vola,String color,boolean canta){
        super(nom, edat, estat, data,bec,vola);
        this.canta=canta;
        this.color=color;
    }
    
    public void mostrar() {
        super.mostrar();
        System.out.print("Color:" + this.color);
        if (this.canta) {
            System.out.println("Si canta");
        }else{
            System.out.println("No canta");
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
