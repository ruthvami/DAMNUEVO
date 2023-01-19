/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06_extra;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ruth
 */
public class UF06_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int punt = 0;

        Integer array[] = new Integer [8];

        for (int i = 0; i < array.length; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce las puntuaciones de los jugadores :");
            punt = sc.nextInt();                                   //se introducen los numeros añadidos dentro del array
            array[i] = punt;
            
        }

         Arrays.sort(array, Collections.reverseOrder());             //para ordenar descendentemente se añade el revereOrder, 
         System.out.println(Arrays.toString(array));                 //ya que el sort lo hace ascendentemente
    }

}
