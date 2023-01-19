/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diassemana;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Diassemana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una num del 1 al 7 :");
        int num= entrada.nextInt();
        switch(num){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
            case 7:
                System.out.println("Domingo");
            default:
                System.out.println("Hay que introducir un numero del 1 al 7, no un "+num );
        }
           
    }
    
}
