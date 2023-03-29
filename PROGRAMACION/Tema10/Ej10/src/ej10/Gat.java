/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

import java.util.Date;

/**
 *
 * @author rutvac
 */
public class Gat extends Mascotas {
    private String color;
    private boolean pel_Llarg;
    
    public Gat(String nom,int edat,String estat,String dataNaixement,String color,boolean pel_Llarg) throws Exception{
        super(nom,edat,estat,dataNaixement);        
        this.color = color;
        this.pel_Llarg = pel_Llarg;        
    }
    
    @Override
    public void mostrar(){       
        System.out.println("Nom             : " + this.getNom());
        System.out.println("Estat           : " + this.getEstat());
        System.out.println("DataNaix        : " + this.getDataNaixement());
        System.out.println("Edat            : " + this.getEdat());
        System.out.println("Color           : " + this.getColor());
        System.out.println("Té pel llarg?   : " + this.getPel_Llarg());
    }
    @Override
    public void parla(){
        System.out.println("MIAO MIAO!!!!");
    }

    public String getColor() {
        return color;
    }

    public boolean getPel_Llarg() {
        return pel_Llarg;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPel_Llarg(boolean pel_Llarg) {
        this.pel_Llarg = pel_Llarg;
    }
    
}