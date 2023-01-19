/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiocirculo;
import java.util.Scanner;
/**
 *
 * @author rutvac
 */
public class RadioCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un radio de un circulo :");
        double radio= entrada.nextDouble();
        double area = Math.PI*Math.pow(radio, 2);
        double circumferencia=2*Math.PI*radio;
        System.out.println("Su area es "+ area +" y su circumferencia es " +circumferencia);
            
    }
    
}
