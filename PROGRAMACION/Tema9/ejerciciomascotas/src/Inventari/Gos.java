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
public class Gos extends Mascotas {

    private String raza;
    private boolean pulgas;

    public Gos(String nom, int edat, String estat, String data, String raza, boolean pulgas) {
        super(nom, edat, estat, data);
        this.pulgas = pulgas;
        this.raza = raza;
    }

    public void mostrar() {
        super.mostrar();
        System.out.print("Raça:" + this.raza);
        if (this.pulgas) {
            System.out.println("Te puses");
        }else{
            System.out.println("No te puses");
        }
    }
    @Override
    public void parla(){
        System.out.println("GUAU");
    }
}
