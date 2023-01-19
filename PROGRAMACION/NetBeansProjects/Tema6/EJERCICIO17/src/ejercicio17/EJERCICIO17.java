/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Arrays;

/**
 *
 * @author rutvac
 */
public class EJERCICIO17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int array[] = new int[30];
        for (int i = 0; i < array.length; i++) {
            double num = Math.random()*9+1;
            array[i] = (int) num;
            
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }

}
