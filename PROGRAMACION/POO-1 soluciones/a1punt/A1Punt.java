/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a1punt;

/**
 *
 * @author AiA
 */
public class A1Punt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punt p1 = new Punt();
        Punt p2 = new Punt();
        Punt p3 = new Punt();
        
        p1.x = 5;
        p1.y = 0;
        p2.x = 10;
        p2.y = 10;
        p3.x = -3;
        p3.y = 7;
        
        System.out.println("coordenades p1 (" + p1.x + "," + p1.y + ")");
        System.out.println("coordenades p2 (" + p2.x + "," + p2.y + ")");
        System.out.println("coordenades p3 (" + p3.x + "," + p3.y + ")");
        
        p1.x = p1.x *2;
        p1.y +=7;
        p2.x = p1.x-20;
        p3.y -= p2.y;

        System.out.println("coordenades p1 (" + p1.x + "," + p1.y + ")");
        System.out.println("coordenades p2 (" + p2.x + "," + p2.y + ")");
        System.out.println("coordenades p3 (" + p3.x + "," + p3.y + ")");
    }
    
}