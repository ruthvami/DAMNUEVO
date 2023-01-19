/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

/**
 *
 * @author rutvac
 */
public class EJERCICIO15 {

    /**
     * @param args the command line arguments
     */
    public static int suma_vector(int[] v) {
        int suma = 0;
        for (int i = 0; i < v.length; i++) {
            suma += v[i];
        }
        return suma;
    }

    public static double media_vector(int[] v) {
        return (double)suma_vector(v) / (double)v.length;
    }

    public static void main(String[] args) {
        int array[] = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println("Suma: " + suma_vector(array));
        System.out.println("Media: " + media_vector(array));
    }
}