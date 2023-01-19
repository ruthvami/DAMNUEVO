/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizsumatorios;

/**
 *
 * @author rutvac
 */
public class MatrizSumatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, sum = 0, total = 0, sum2 = 0;
        int matri[][] = new int[4][5];

        for (int i = 0; i < matri.length; i++) {                //bucle para imprimer fila por fila
            for (int j = 0; j < matri[i].length; j++) {
                num = (int) (Math.random() * 900) + 100;            //Es un numero random entre 100 y 1000
                matri[i][j] = num;
                System.out.printf("%6d" ,matri[i][j]);              // Se imprime 6 dijitos para crear espacios
                sum += matri[i][j];

            }
            System.out.printf("%2s","|");                       //  Se imprime 2 dijitos para crear espacios
            System.out.print (" " + sum);
            System.out.print("\n");
            total += sum;
            sum = 0;

        }
        System.out.println(" " + "--------------------------------------");
        for (int i = 0; i <= matri.length; i++) {           //  bucle para imprimir la ultima fila
            for (int j = 0; j < matri.length; j++) {
                sum2 += matri[j][i];

            }
            System.out.printf("%6d" ,sum2);
            sum2 = 0;
        }
        System.out.println(" | " + total);                  //suma de todas las sumas de las columnas

    }

}
