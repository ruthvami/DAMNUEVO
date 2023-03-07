/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3rectangle;

/**
 *
 * @author AiA
 */
public class E3Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(1,11,22,55);
        System.out.println("Rectangle 1:");
        R1.imprimeix();
        
              
        System.out.println("/////////////////////");
        R1.setX2(150);
        R1.setY1(5);  
        R1.setY1(-10);       
        
        System.out.println("### Rectangle Aleatori: ###");
        Rectangle RR = Rectangle.RectangleAleatori();
        RR.imprimeix();
        
    }
    
}