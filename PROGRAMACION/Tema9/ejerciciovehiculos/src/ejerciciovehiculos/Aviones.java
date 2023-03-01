/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Aviones extends Aerios{
    private int tiempomax;
     public Aviones(String matricula,String modelo,int asientos,int tiempomax){
        super(matricula,modelo,asientos);
        this.tiempomax=tiempomax;
    }

    @Override
    public void mostrar() {
         super.mostrar(); 
         System.out.println("El tiempo maximo es de "+this.tiempomax);
    }
}
