/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Aquaticos extends Vehiculos{
    private final double eslora;
    public Aquaticos(String matricula,String modelo, double eslora){
        super(matricula,modelo);
        this.eslora=eslora;
        comprovarMatricula();
    }
    public void  mostrar(){
        System.out.println( "El modelo "+this.getModelo()+" con matricula "+this.getMatricula()+" tiene "+this.eslora+" metros de eslora"); 
    }
    public void comprovarMatricula(){
        if(!getMatricula().matches("^\\d{3}[A-Z]{3,10}$")){
            System.out.println("Error al introducir la matricula del vehiculo "+this.getClass().getSimpleName());
        }
    }
}