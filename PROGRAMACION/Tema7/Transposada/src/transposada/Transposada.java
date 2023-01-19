/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transposada;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class Transposada {

    public static void omplirMatriu(int[][] m){
        int num;
        for (int i = 0; i < m.length; i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Introduce un numero para rellenar la matriz : ");
            num=sc.nextInt();
            for (int j = 0; j < m.length; j++) {
                 [i][j]=num;
                
            }
        }
        
    }
    public static void omplirMatriuAleatoria (int [ ][ ] m){
    
    }
    public static int [ ][ ] transposada (int [ ][ ] m) {
    
    }
    public static void visualitzaMatriu (int [ ][ ] m){
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int N,M;
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la anchura de la matriz: ");
        N=sc.nextInt();
        System.out.println("Introduce la altura de la matriz: ");
        M=sc.nextInt();
        int matriz[][]=new int[N][M];
        
    }
    
}
