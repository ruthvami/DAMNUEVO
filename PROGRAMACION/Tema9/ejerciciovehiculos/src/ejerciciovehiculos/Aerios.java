/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Aerios extends Vehiculos{
     private final int asientos;
    public Aerios(String matricula,String modelo, int asientos){
        super(matricula,modelo);
        this.asientos=asientos;
    }
    public void  mostrar(){
        System.out.println("El modelo "+this.getModelo()+" con matricula "+this.getMatricula()+" tiene "+this.asientos+" asientos"); 
    }
}
