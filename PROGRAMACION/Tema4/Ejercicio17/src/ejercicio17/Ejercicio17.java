/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int horas, minutos, segundos;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir la hora :");
        horas= sc.nextInt();
        
        Scanner sc1= new Scanner(System.in);
        System.out.println("Introducir los minutos:");
        minutos= sc1.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Introducir los segundos:");
        segundos= sc2.nextInt();
        
        if(segundos==59){
                  segundos=0;
                  if(minutos==59){
                      minutos=0;
                      if(horas==23){
                                horas=0;
                      }else{
                            horas=horas+1;
                        }
                  }else{
                  minutos=minutos+1;}
        }else{
            segundos = segundos+1;
        }
        System.out.println("Son las "+ horas+":"+ minutos +":"+ segundos);
    }
    
}
