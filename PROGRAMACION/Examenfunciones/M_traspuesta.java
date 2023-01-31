/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m_traspuesta;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author raquel
 */
public class M_traspuesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int filas, columnas;
        
        do{
            System.out.print("Introduce el número de filas de la matriz: ");
            filas = in.nextInt();
        }while(filas < 1);
             
        do{
            System.out.print("Introduce el número de columnas de la matriz: ");
            columnas = in.nextInt();
        }while(columnas < 1);
        
        int matriz[][] = new int[filas][columnas];
        int matrizT[][] = new int[columnas][filas];
       
        //llenarMatriz(matriz); //Si quiero introducir los datos manualmente por teclado
        llenarMatrizAleatoria(matriz); //Si quiero introducir los datos aleatoriamente
        visualizaMatriz(matriz);
        matrizT=transpuesta(matriz);
        visualizaMatriz(matrizT);
        
    }
    
    /**
     * 
     * Función que pide los elementos de una matriz
     * Entradas: Matriz de enteros (m)
     * Valor devuelto: Ninguno
     */
    public static void llenarMatriz(int[][] m){
        Scanner in = new Scanner(System.in);
        int i, j;
        
        for(i = 0; i < m.length; i++){
            for(j = 0; j <  m[0].length; j++){
                System.out.print("Introduce la posicion " + "[" + i + "," + j + "]: ");
                m[i][j] = in.nextInt();
            }
        }
    }
    
    /**
     * 
     * Función que rellena la matriz con números enteros aleatorios
     * Para ello utilizará la clase java.util.Random usando el método nextInt(int n),
     * que devuelve un valor entre 0 y n, excluido n 
     * Entradas: Matriz de enteros (m)
     * Valor devuelto: Ninguno
     * 
     */
    public static void llenarMatrizAleatoria(int[][] m){
        Scanner in = new Scanner(System.in);
        int i, j;
        Random r = new Random();
        
        for(i = 0; i < m.length; i++){
            for(j = 0; j <  m[0].length; j++){
                m[i][j] = r.nextInt(10); //generará números enteros entre 0 y 9
            }
        }
    }
    
    /**
     * 
     * Función que calcula la matriz transpuesta
     * Entradas: Matriz de enteros (m)
     * Valor devuelto: Matriz de enteros
     */
       
    
    public static int[][] transpuesta(int[][] m){
        int i, j;
        int t[][]=new int[m[0].length][m.length];
        
        for(i = 0; i < m[0].length; i++){
            for(j = 0; j <  m.length; j++){
                t[i][j] = m[j][i];
            }
        }
    return t;
    }
    
    
    public static void visualizaMatriz(int[][] m){
        int i, j;
                
        for(i = 0; i < m.length; i++){
            for(j = 0; j <  m[0].length; j++){
                System.out.print(m[i][j] + " ");                
            }
            System.out.println("");
        }
        System.out.println("");
    }
}