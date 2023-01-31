/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodigitos;

import java.util.Scanner;

public class EjemploDigitos {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, n_dig, suma;
        
        System.out.print("Introduce un número: ");
        num = in.nextInt();
        
        n_dig = numDigitos(num);
        
        suma = sumaDigitos(num);
        
        System.out.println("El número de digitos es " + n_dig + " y su suma es " + suma);
        
    }
    
    /**
     * Función que calcula el número de digitos de un número entero
     * Entrada: un número entero (n)
     * Salida: un número entero (n_dig)
     */
    public static int numDigitos(int n){
        int n_dig = 1;
        
        while(n/10 != 0){
            n_dig++;
            n = n/10;
        }
        
        return n_dig;
    }
    
    /**
     * Función que calcula la suma de los dígitos de un número entero
     * Entrada: un número entero (n)
     * Salida: un número entero (suma)
     */
    public static int sumaDigitos(int n){
        int suma = 0;
        
        while(n != 0){
            suma = suma + (n % 10);            
            n = n / 10;
        }
        
        return suma;
    }
}