/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Submarinos extends Aquaticos {
    private double profundidad;
     public Submarinos(String matricula,String modelo,double eslora,double profundidad){
        super(matricula,modelo,eslora);
        this.profundidad=profundidad;
    }

    @Override
    public void mostrar() {
         super.mostrar(); 
         System.out.println("La profundidad maxima es de "+this.profundidad);
    }
}
