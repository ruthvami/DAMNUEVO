/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiniela;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Quiniela {

    /**
     * @param args the command line arguments
     */
    public static void Partido(String[] equipos, int[][] resultados) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= resultados.length; i++) {

            System.out.println("Partido " + i);
            System.out.println("Introduce el nombre del equipo local : ");
            equipos[i] = sc.nextLine();

            System.out.println("Introduce el nombre del equipo visitante : ");
            equipos[i] = sc.nextLine();

            System.out.println("Introduce los goles del equipo local: ");
            resultados[i][0] = sc.nextInt();

            System.out.println("Introduce los goles del equipo visitante: ");
            resultados[0][i] = sc.nextInt();

            sc.nextLine();

        }
        for (int i = 0; i < resultados.length; i++) {
            for (int j = 0; j < resultados.length; j++) {
                System.out.println(resultados[i][j]);

            }

        }
    }

    public static void imprimir(String[] equipos, int[][] resultados) {
        String quiniela[] = new String[equipos.length];

        for (int i = 0; i < resultados.length; i++) {

            if (resultados[i][0] > resultados[i][1]) {
                quiniela[i] = "1";
            } else if (resultados[i][0] < resultados[i][1]) {
                quiniela[i] = "2";
            } else {
                quiniela[i] = "X";
            }

        }
        System.out.println("### QUINIELA DE LA JORNADA ###");
        System.out.printf("%20s", "-");
        for (int i = 0; i < equipos.length; i++) {
            System.out.printf("%10s", equipos[i]);
            System.out.printf("%10s", " - " + equipos[i + 1]);
            System.out.println(" : " + quiniela[i]);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int partidos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos partidos hay ?");
        partidos = sc.nextInt();

        String equipos[] = new String[partidos * 2];
        int resultados[][] = new int[partidos * 2][2];
        Partido(equipos, resultados);
        imprimir(equipos, resultados);
    }

}
