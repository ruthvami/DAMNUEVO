/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a3.rectangle;

/**
 *
 * @author rutvac
 */
public class A3Rectangle {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Rectangle rec1=new Rectangle();
        Rectangle rec2=new Rectangle();
        rec1.x1=0;
        rec1.y1=0;
        rec1.x2=5;
        rec1.y2=5;
        
        rec2.x1=7;
        rec2.y1=9;
        rec2.x2=2;
        rec2.y2=3;
        
        int per=2*(rec1.x2-rec1.x1)+2*(rec1.y2-rec1.y1);
        int area=(rec1.x1-rec1.x2)*(rec1.y1-rec1.y2);
        System.out.println("Las coordenadas del primero son: ("+rec1.x1+","+ rec1.y1+") ("+rec1.x2+","+ rec1.y2+")");
        
        System.out.print("Perimetro 1: ");
        System.out.println(per);
        System.out.print("Area 1: ");
        System.out.println(area);
        
        int per2=2*(rec2.x2-rec2.x1)+2*(rec2.y2-rec2.y1);
        int area2=(rec2.x1-rec2.x2)*(rec2.y1-rec2.y2);
        System.out.println("Las coordenadas del segundo son: ("+rec2.x1+","+ rec2.y1+") ("+rec2.x2+","+ rec2.y2+")");
        System.out.print("Perimetro 2: ");
        System.out.println(Math.abs(per2));
        System.out.print("Area 2: ");
        System.out.println(Math.abs(area2));
    }
    
}
