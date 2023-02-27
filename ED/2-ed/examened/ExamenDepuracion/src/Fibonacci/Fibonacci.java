package Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    
    private static Scanner sc;
    
    public static void main(String[] args) {

        sc = new Scanner(System.in);
        int num, fib1, fib2, i;
        do{
            System.out.print("Introdueix número major que 1: ");
            num = sc.nextInt();
        }while(num<=1);
        System.out.println("Els "+ num+" primers termes de la sèrie de Fibonacci son: ");
    
        fib1=1;
        fib2=1;
        
        System.out.print(fib1 + " ");
        for(i=2;i<=num;i++){
            System.out.print(fib2 + " ");
            
            fib2 = fib1 + fib2;
            fib1 = fib2 - fib1;
        }
        System.out.println();
    }
    
}
