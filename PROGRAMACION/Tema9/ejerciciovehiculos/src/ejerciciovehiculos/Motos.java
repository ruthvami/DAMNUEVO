/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Motos extends Terrestres{
    private String color;
   public Motos(String matricula,String modelo,int rodes,String color){
        super(matricula,modelo,rodes);
        this.color=color;
    }

    @Override
    public void mostrar() {
         super.mostrar(); 
         System.out.println("Tiene color "+this.color);
    }
}
