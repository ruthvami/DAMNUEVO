/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3rectangle;

/**
 *
 * @author AiA
 */
public class D3Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(1,1,22,55);
        System.out.println("Rectangle 1:");
        R1.imprimeix();
        
        Rectangle R2 = new Rectangle(3,2,1,33);
        System.out.println("Rectangle 2:");
        R2.imprimeix();
        
        System.out.println("/////////////////////");
        R1.setX1(7);
        R1.setY1(1);
        R1.setX2(77);
        R1.setY2(11);
        
        System.out.println("Rectangle 1:");
        R1.imprimeix();
        
        System.out.println("*********************");
        R2.setX2(14);
        R2.setY2(44);
        R2.setX1(7);
        R2.setY1(33);
        
        System.out.println("Rectangle 2:");
        R2.imprimeix();
        
        System.out.println("#########################");
        System.out.println("R1: ");
        R1.imprimeix();
        
        System.out.println("Setting R1 - X1Y1 a 11,2");
        R1.setX1Y1(11,2);
        System.out.println("Setting R1 - X2Y2 a 33,44");
        R1.setX2Y2(33,44);
        
        System.out.println("R1: ");
        R1.imprimeix();
        
        System.out.println("++++++++++++++++++++++");
        System.out.println("Setting R1 - X1Y1X2Y2 a 3,44,33,33");
        
        R1.setAll(3,44,33,33);
        R1.imprimeix();
        
    }
    
}