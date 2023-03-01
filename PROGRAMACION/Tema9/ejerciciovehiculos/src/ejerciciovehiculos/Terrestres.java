/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public  class Terrestres extends Vehiculos{
    private final int rodes; 
    public Terrestres(String matricula,String modelo,int rodes){
        super(matricula,modelo);
        this.rodes=rodes;
    }
    public void  mostrar(){
        System.out.println( "El modelo "+this.getModelo()+" con matricula "+this.getMatricula()+" tiene "+this.rodes+" ruedas"); 
    }
}
