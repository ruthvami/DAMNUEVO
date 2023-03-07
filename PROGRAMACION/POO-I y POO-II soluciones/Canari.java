/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e3_mascotes;

/**
 *
 * @author angel
 */
public class Canari extends Aus {
    private String color;
    private boolean canta;
    
    public Canari(String nom,int edat,String estat,String dataNaixement,String bec,boolean vola,String color,boolean canta){
        super(nom,edat,estat,dataNaixement,bec,vola);
        this.color = color;
        this.canta = canta;
    }
    
    @Override
    public void mostrar(){    
        System.out.println("Nom             : " + this.getNom());
        System.out.println("Estat           : " + this.getEstat());
        System.out.println("DataNaix        : " + this.getDataNaixement());
        System.out.println("Edat            : " + this.getEdat());
        System.out.println("Vola?           : " + this.getVola());
        System.out.println("Tipus de bec    : " + this.getBec());
        System.out.println("Color           : " + this.getColor());
        System.out.println("Canta?          : " + this.getCanta());
        
    }
    @Override
    public void volar(){
        this.setVola(true);
    }
    @Override
    public void parla(){
        System.out.println("PIO PIO !!!!");
    }

    public String getColor() {
        return color;
    }

    public boolean getCanta() {
        return canta;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }
    
}