/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cincoc;


import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class CINCOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N = 0, genero = 0, h = 0, m = 0, salario = 0, muj = 0, hom = 0, mediah = 0, mediam = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas personas van a introducir sus datos?");
        N = sc.nextInt();

        int datos[][] = new int[2][N];


            for (int j = 0; j < N; j++) {
                System.out.println("Introduce un 0 si eres hombre y un 1 si eres mujer");
                genero = sc.nextInt();

                System.out.println("Introduce  salario");
                salario = sc.nextInt();
               
                if (genero == 0) {
                    h++;
                    hom+=salario; 
                    datos[0][j] = salario;

                }
                if (genero == 1) {
                    m++;
                    muj+=salario;
                    datos[1][j] = salario;
                }
                
        }
        
        System.out.println("El salario medio de hombres es " + hom / h + "\nEl salario medio de mujeres es " +muj / m );
    }

}
