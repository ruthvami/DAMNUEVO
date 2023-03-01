/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Helicoptero extends Aerios{
    private int helices;
     public Helicoptero(String matricula,String modelo,int asientos,int helices){
        super(matricula,modelo,asientos);
        this.helices=helices;
    }

    @Override
    public void mostrar() {
         super.mostrar(); 
         System.out.println("Tiene "+this.helices+" helices");
    }
}
