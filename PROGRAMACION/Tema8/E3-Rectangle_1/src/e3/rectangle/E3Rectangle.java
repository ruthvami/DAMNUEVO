/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e3.rectangle;

/**
 *
 * @author rutvac
 */
public class E3Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangle rec1 = new Rectangle(0, 0, 5, 5);
        Rectangle rec2 = new Rectangle(7, 9, 8, 10);
 
        rec1.imprimeix();
        rec2.imprimeix();
        rec1.setX1Y1(3, 6);
        rec2.setX2Y2(5, 23);
        rec1.imprimeix();
        rec2.imprimeix();
        rec1.setAll(2, 3, 5, 9);
        rec1.imprimeix();
    }

}
