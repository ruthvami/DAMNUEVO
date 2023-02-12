/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c3rectangle;

/**
 *
 * @author AiA
 */
public class C3Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(0,5,0,5);
        Rectangle R2 = new Rectangle(7,2,9,3);
        int area1,area2,per1,per2;        
               
        System.out.println("Rectangle 1 (" + R1.getX1() + "," + R1.getY1() + "),(" + R1.getX2() + "," + R1.getY2() + ")");
        per1=Math.abs(R1.getX1()-R1.getX2())*2 + Math.abs(R1.getY1()-R1.getY2())*2;
        System.out.println("Perímetre 1: " + per1);
        area1=Math.abs(R1.getX1()-R1.getX2()) * Math.abs(R1.getY1()-R1.getY2());
        System.out.println("Àrea 1: " + area1);
        
        System.out.println("Rectangle 2 (" + R2.getX1() + "," + R2.getY1() + "),(" + R2.getX2() + "," + R2.getY2() + ")");
        per2=Math.abs(R2.getX1()-R2.getX2())*2 + Math.abs(R2.getY1()-R2.getY2())*2;
        System.out.println("Perímetre 2: " + per2);       
        area2=Math.abs(R2.getX1()-R2.getX2()) * Math.abs(R2.getY1()-R2.getY2());
        System.out.println("Àrea 2: " + area2);
                
        R1.setX1(7);
        R1.setY1(0);
        R1.setX2(5);
        R1.setY2(10);
        
        System.out.println("Rectangle 1 (" + R1.getX1() + "," + R1.getY1() + "),(" + R1.getX2() + "," + R1.getY2() + ")");
        per1=Math.abs(R1.getX1()-R1.getX2())*2 + Math.abs(R1.getY1()-R1.getY2())*2;
        System.out.println("Perímetre 1: " + per1);
        area1=Math.abs(R1.getX1()-R1.getX2()) * Math.abs(R1.getY1()-R1.getY2());
        System.out.println("Àrea 1: " + area1);
        
        R2.setX2(14);
        R2.setY2(44);
        R2.setX1(7);
        R2.setY1(33);
        
        System.out.println("Rectangle 2 (" + R2.getX1() + "," + R2.getY1() + "),(" + R2.getX2() + "," + R2.getY2() + ")");
        per2=Math.abs(R2.getX1()-R2.getX2())*2 + Math.abs(R2.getY1()-R2.getY2())*2;
        System.out.println("Perímetre 2: " + per2);       
        area2=Math.abs(R2.getX1()-R2.getX2()) * Math.abs(R2.getY1()-R2.getY2());
        System.out.println("Àrea 2: " + area2);
    }
    
}