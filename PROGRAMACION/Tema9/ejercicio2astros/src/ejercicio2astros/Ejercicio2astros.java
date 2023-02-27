/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2astros;

/**
 *
 * @author rutvac
 */
public class Ejercicio2astros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Planeta p1=new Planeta("TEE",23.4,23,2.3,23,6,100,120,222,23,"te tres");
        p1.mostrar();
        Satellit s1=new Satellit("wee",23,45,34,34,4,34,234);
        s1.mostrar();
        Planeta p2=new Planeta("TRESS",26.4,23,2.3,2,65,10,120,22,283," ");
        p2.mostrar();
    }
    
}
