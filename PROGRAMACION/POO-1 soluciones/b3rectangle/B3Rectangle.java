/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3rectangle;

/**
 *
 * @author AiA
 */
public class B3Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle(0,5,0,5);
        Rectangle R2 = new Rectangle(7,2,9,3);
        int area1,area2,per1,per2;        
               
        System.out.println("Rectangle 1 (" + R1.x1 + "," + R1.y1 + "),(" + R1.x2 + "," + R1.y2 + ")");
        per1=Math.abs(R1.x1-R1.x2)*2 + Math.abs(R1.y1-R1.y2)*2;
        System.out.println("Perímetre 1: " + per1);
        area1=Math.abs(R1.x1-R1.x2) * Math.abs(R1.y1-R1.y2);
        System.out.println("Àrea 1: " + area1);
        
        System.out.println("Rectangle 2 (" + R2.x1 + "," + R2.y1 + "),(" + R2.x2 + "," + R2.y2 + ")");
        per2=Math.abs(R2.x1-R2.x2)*2 + Math.abs(R2.y1-R2.y2)*2;
        System.out.println("Perímetre 2: " + per2);       
        area2=Math.abs(R2.x1-R2.x2) * Math.abs(R2.y1-R2.y2);
        System.out.println("Àrea 2: " + area2);
                
        R1.x1 = 7;
        R1.y1 = 0;
        R1.x2 = 5;
        R1.y2 = 10;
        
        System.out.println("Rectangle 1 (" + R1.x1 + "," + R1.y1 + "),(" + R1.x2 + "," + R1.y2 + ")");
        per1=Math.abs(R1.x1-R1.x2)*2 + Math.abs(R1.y1-R1.y2)*2;
        System.out.println("Perímetre 1: " + per1);
        area1=Math.abs(R1.x1-R1.x2) * Math.abs(R1.y1-R1.y2);
        System.out.println("Àrea 1: " + area1);
    }
    
}