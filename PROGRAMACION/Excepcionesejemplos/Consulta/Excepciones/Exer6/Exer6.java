/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer6;

/**
 *
 * @author AiA
 */
public class Exer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Gat g1 = new Gat("Misu",3);
            g1.imprimir();
//            Gat g2 = new Gat("Rocky",-2);  
            Gat g2 = new Gat("Rocky",2); 
            g2.imprimir();
//            Gat g3 = new Gat("Pi",12);  
            Gat g3 = new Gat("Pitiminí",5);
            g3.imprimir();
            
            g1.setEdat(22);
            g1.imprimir();
//            g2.setEdat(-8);
//            g2.imprimir();
            
            g3.setNom("Piti 2n");
            g3.imprimir();
        }
        catch(Exception e){
                System.out.println(e);            
        } 
        
        System.out.println("FINAL");
    }
}
