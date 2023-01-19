/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author rutvac
 */
public class EJERCICIO10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int array[] = new int[100];
        System.out.print("El vector 1 es = ");
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
        System.out.print("\nEl vector 2 es = ");
        int array1[]=new int[100];
        for (int i = 0; i < array1.length; i++) {
            array1[i]= array[99-i];
            System.out.print(array1[i] +" ");
        }
        
    }

}
