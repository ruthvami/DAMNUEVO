/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b1.punt;

/**
 *
 * @author rutvac
 */
public class B1Punt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Punt A = new Punt(5, 0);
        Punt B = new Punt(10, 10);
        Punt C = new Punt(-3, 7);

        System.out.println("Las coordenadas son (" + A.x + "," + A.y + ")");
        System.out.println("Las coordenadas son (" + B.x + "," + B.y + ")");
        System.out.println("Las coordenadas son (" + C.x + "," + C.y + ")");

        A.x *= B.x;
        B.y = C.y + A.x;
        C.x -= C.y;

        System.out.println(" ");

        System.out.println("Las coordenadas son (" + A.x + "," + A.y + ")");
        System.out.println("Las coordenadas son (" + B.x + "," + B.y + ")");
        System.out.println("Las coordenadas son (" + C.x + "," + C.y + ")");
    }

}
