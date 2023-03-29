/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author rutvac
 */
public class Lloro extends Aus {
    private String origen;
    private boolean parla;
    
    public Lloro(String nom,int edat,String estat,String dataNaixement,String bec,boolean vola,String origen,boolean parla) throws Exception{
        super(nom,edat,estat,dataNaixement,bec,vola);
        this.origen = origen;
        this.parla = parla;
    }
    
    @Override
    public void mostrar(){    
        System.out.println("Nom             : " + this.getNom());
        System.out.println("Estat           : " + this.getEstat());
        System.out.println("DataNaix        : " + this.getDataNaixement());
        System.out.println("Edat            : " + this.getEdat());
        System.out.println("Vola?           : " + this.getVola());
        System.out.println("Tipus de bec    : " + this.getBec());
        System.out.println("Origen          : " + this.getOrigen());
        System.out.println("Parla?          : " + this.getParla());
        
    }
    @Override
    public void volar(){
        this.setVola(true);
    }
    @Override
    public void parla(){
        System.out.println("HOLA QUE ASES !!");
    }

    public String getOrigen() {
        return origen;
    }

    public boolean getParla() {
        return parla;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setParla(boolean parla) {
        this.parla = parla;
    }
    
}
