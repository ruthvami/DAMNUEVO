/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c1.punt;

/**
 *
 * @author rutvac
 */
public class C1Punt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punt A = new Punt(5, 0);
        Punt B = new Punt(10, 10);
        Punt C = new Punt(-3, 7);

        System.out.println("Las coordenadas son (" + A.getX() + "," + A.getY() + ")");
        System.out.println("Las coordenadas son (" + B.getX()+ "," + B.getY() + ")");
        System.out.println("Las coordenadas son (" + C.getX()+ "," + C.getY()+ ")");

//        A.x *= B.x;
//        B.y = C.y + A.x;
//        C.x -= C.y;

        System.out.println(" ");
        A.setX(88); A.setY(C.getX()+B.getX());
        B.setX(45);B.setY(C.getY()*99);
        C.setX(010);C.setY(B.getY()/30);
        
        System.out.println("Las coordenadas son (" + A.getX() + "," + A.getY() + ")");
        System.out.println("Las coordenadas son (" + B.getX() + "," + B.getY() + ")");
        System.out.println("Las coordenadas son (" + C.getX() + "," + C.getY()+ ")");
    }

}
