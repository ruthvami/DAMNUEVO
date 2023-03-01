/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Vaixells extends Aquaticos{
    private boolean motor;
     public Vaixells(String matricula,String modelo,double eslora,boolean motor){
        super(matricula,modelo,eslora);
        this.motor=motor;
    }

    @Override
    public void mostrar() {
         super.mostrar(); 
         System.out.println("Tiene motor?"+((this.motor)?("Si"):("No")));
    }
}
