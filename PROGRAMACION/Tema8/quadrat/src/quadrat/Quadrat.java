/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadrat;

/**
 *
 * @author rutvac
 */
public class Quadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle a=new Rectangle();
        Rectangle b=new Rectangle();
        a.x=0;
        a.y=0;
        a.x2=5;
        a.y2=5;
        
        b.x=7;
        b.y=9;
        b.x2=2;
        b.y2=3;
        
        System.out.println("Diagonal1:"+a.diagonal());
        System.out.println("Area:"+a.area(a.diagonal(),0));
        System.out.println("Perimetro:"+a.perimetre());
        System.out.println(" ");
        System.out.println("Diagonal1:"+b.diagonal());
        System.out.println("Area:"+b.area(b.diagonal(),0));
        System.out.println("Perimetro:"+b.perimetre());

    }
    
}
