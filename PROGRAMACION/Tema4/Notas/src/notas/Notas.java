/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una nota :");
        double nota= entrada.nextDouble();
        if(nota>=0 && nota <3){
            System.out.println("Muy deficiente");
        }else if(nota>=3 && nota<5){
            System.out.println("Insuficiente");
        }else if(nota>=5 && nota<6){
            System.out.println("Bien");
        }else if(nota>=6 && nota <9){
            System.out.println("Notable");
        }else if(nota>=9 && nota<=10){
            System.out.println("Sobresaliente");
        }else{
            System.err.println("ERROR");
        }
        
    }
    }
    

