/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c3.rectangle;

/**
 *
 * @author rutvac
 */
public class C3Rectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Rectangle rec1 = new Rectangle(0, 0, 5, 5);
        Rectangle rec2 = new Rectangle(7, 9, 8, 10);

        System.out.println("Las coordenadas del primero son: (" + rec1.getX1() + "," + rec1.getY1() + ") (" + rec1.getX2() + "," + rec1.getY2() + ")");
        System.out.println("Las coordenadas del segundo son: (" + rec2.getX1() + "," + rec2.getY1() + ") (" + rec2.getX2() + "," + rec2.getY2() + ")");
        rec2.setX1(1);
        rec1.setY1(140);
        rec2.setX2(32);
        int per = 2 * (rec1.getX2() - rec1.getX1()) + 2 * (rec1.getY2() - rec1.getY1());
        int area = (rec1.getX1() - rec1.getX2()) * (rec1.getY1() - rec1.getY2());
        System.out.println("Las coordenadas del primero son: (" + rec1.getX1() + "," + rec1.getY1() + ") (" + rec1.getX2() + "," + rec1.getY2() + ")");

        System.out.print("Perimetro 1: ");
        System.out.println(per);
        System.out.print("Area 1: ");
        System.out.println(area);

        int per2 = 2 * (rec2.getX2() - rec2.getX1()) + 2 * (rec2.getY2() - rec2.getY1());
        int area2 = (rec2.getX1() - rec2.getX2()) * (rec2.getY1() - rec2.getY2());
        System.out.println("Las coordenadas del segundo son: (" + rec2.getX1() + "," + rec2.getY1() + ") (" + rec2.getX2() + "," + rec2.getY2() + ")");
        System.out.print("Perimetro 2: ");
        System.out.println(Math.abs(per2));
        System.out.print("Area 2: ");
        System.out.println(Math.abs(area2));
    }

}
