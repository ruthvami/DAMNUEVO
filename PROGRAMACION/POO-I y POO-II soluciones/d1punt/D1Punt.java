/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d1punt;

/**
 *
 * @author AiA
 */
public class D1Punt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punt p1 = new Punt(5,0);
        Punt p2 = new Punt(10,10);
        Punt p3 = new Punt(-3,7);       
        
        System.out.println("coordenades p1 (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("coordenades p2 (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("coordenades p3 (" + p3.getX() + "," + p3.getY() + ")");
        
        p1.setX(p1.getX()*2);
        p1.setY(p1.getY()+7);
        p2.setX(p1.getX()-20);
        p3.setY(p2.getY()*3);

        System.out.println("coordenades p1 (" + p1.getX() + "," + p1.getY() + ")");
        System.out.println("coordenades p2 (" + p2.getX() + "," + p2.getY() + ")");
        System.out.println("coordenades p3 (" + p3.getX() + "," + p3.getY() + ")");
        
        System.out.println("ARA AMB MÈTODES");
        p1.setXY(22, 33);
        System.out.print("Posició inicial: ");
        p1.imprimeix();
        p1.desplaça(3, 5);
        System.out.print("\nPosició desplaçada: ");
        p1.imprimeix();
        
        System.out.println("");        
        System.out.print("Distancia entre ");
        p1.imprimeix();
        p3.imprimeix();
        System.out.println(" es: " + p1.distancia(p3));
    }    
}