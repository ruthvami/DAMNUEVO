/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer10_mascotes;

/**
 *
 * @author angel
 */
public abstract class Aus extends Mascota {
    String bec; // Larg, curt, recte ...
    boolean vola;
    
    public Aus(String nom,int edat,String estat,String dataNaixement,String bec,
            boolean vola) throws ExceptionNomBuit, ExceptionEdatNegativa{
        super(nom,edat,estat,dataNaixement);        
        this.bec = bec;
        this.vola = vola;        
    }
    
    @Override
    public abstract void mostrar();    
    @Override
    public abstract void parla();
    public abstract void volar();

    public String getBec() {
        return this.bec;
    }

    public boolean getVola() {
        return this.vola;
    }

    public void setBec(String bec) {
        this.bec = bec;
    }

    public void setVola(boolean vola) {
        this.vola = vola;
    }
    
    
}