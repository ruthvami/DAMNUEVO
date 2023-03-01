/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciovehiculos;

/**
 *
 * @author rutvac
 */
public class Cotxe extends Terrestres{
   private boolean aire;
   public Cotxe(String matricula,String modelo,int rodes,boolean aire){
        super(matricula,modelo,rodes);
        this.aire=aire;
    }

    @Override
    public void mostrar() {
         super.mostrar(); 
         System.out.println("Tiene aire?"+((this.aire)?("Si"):("No")));
    }

}
