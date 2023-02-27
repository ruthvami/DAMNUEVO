/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventari;

import java.util.Date;

/**
 *
 * @author rutvac
 */
public class Gat extends Mascotas{
    private String color;
    private boolean pelllarg;
    
    public Gat(String nom,int edat,String estat,String data,String color,boolean pelllarg){
        super(nom, edat, estat, data);
        this.color=color;
        this.pelllarg=pelllarg;
    }
    public void mostrar() {
        super.mostrar();
        System.out.print("Color:" + this.color);
        if (this.pelllarg) {
            System.out.println("Te el pel llarg");
        }else{
            System.out.println("Te el pel curt");
        }
    }
    @Override
    public void parla(){
        System.out.println("MIAU");
    }
}
