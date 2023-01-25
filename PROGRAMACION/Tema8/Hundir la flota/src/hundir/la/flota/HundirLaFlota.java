/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundir.la.flota;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class HundirLaFlota {

    public static void crear_tauler(String[][] matriu, int vaixell) {
        char c;
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        {
            for (c = 'A'; c <= 'J'; c++) {
                System.out.print(c);
                for (int i = 0; i < matriu.length; i++) {
                    System.out.print(" ");
                    System.out.print("-");

                }
                System.out.println(" ");
            }
        }
    }

    public static void inserir_vaixell(String[][] matriu) {

    }

    public static void dispara_tret(String[][] matriu) {

    }

    public static void mostrar_tauler(String[][] matriu) {
        char c;
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        {
            for (c = 'A'; c <= 'J'; ++c) {
                System.out.print(c);
                for (int i = 0; i < matriu.length; i++) {
                    System.out.print(" ");
                    System.out.print("-");
                }
                System.out.println(" ");
            }
        }
    }

    public static int menu(int a) {
        int vaixell = 0;
        switch (a) {
            case 1:
                vaixell = 10;
//                intents=50;
                break;
            case 2:
                vaixell = 5;
//                intents=30;
                break;
            case 3:
                vaixell = 2;
//                intents=10;
                break;
        }
        return vaixell;
    }

    public static void random(String[][] matriu) {
        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() + 9);
            int y = (int) (Math.random() + 9);

            if (matriu[x][y] != "-") {
                i--;
            } else {
                matriu[x][y]="L";
            }
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int nivel;
        String tauler[][] = new String[10][10];
        String ocult[][] = new String[10][10];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Niveles: ");
//        System.out.println("1-Para facil\n2-Para medio\n3-Para dificil");
//        System.out.println("Elige un nivel: ");
//        nivel=sc.nextInt();

        crear_tauler(tauler);
        mostrar_tauler(ocult);
    }

}
