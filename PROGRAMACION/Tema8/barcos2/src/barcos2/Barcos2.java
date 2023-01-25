/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package barcos2;

import java.util.Scanner;
/**
 *
 * @author rutvac
 */
public class Barcos2 {

    public static void crear_tauler(String[][] matriu) {
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
        crear_tauler(matriu);
        random(matriu);
    }

//    public static boolean dispara_tret(String[][] matriu) {
////            inserir_vaixell(matriu);
//            
//    }
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
        System.out.println("-------------------------");
        random(matriu);
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
        char c;
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 9);
            int y = (int) (Math.random() * 9);

            if (matriu[x][y] != null) {
                i--;
            } else {
                matriu[x][y] = "L";
            }
        }
        for (int i = 0; i < 3; i++) {
            int x = (int) (Math.random() * 7);
            int y = (int) (Math.random() * 7);

            if (matriu[x][y] != null || matriu[x][y + 1] != null || matriu[x][y + 2] != null) {
                i--;
            } else {
                matriu[x][y] = "B";
                matriu[x][y + 1] = "B";
                matriu[x][y + 2] = "B";
            }
        }
        for (int i = 0; i < 1; i++) {
            int x = (int) (Math.random() * 6);
            int y = (int) (Math.random() * 6);

            if (matriu[x][y] != null || matriu[x][y + 1] != null || matriu[x][y + 2] != null || matriu[x][y + 3] != null) {
                i--;
            } else {
                matriu[x][y] = "Z";
                matriu[x][y + 1] = "Z";
                matriu[x][y + 2] = "Z";
                matriu[x][y + 3] = "Z";
            }
        }
        for (int i = 0; i < 1; i++) {
            int x = (int) (Math.random() * 5);
            int y = (int) (Math.random() * 5);

            if (matriu[x][y] != null || matriu[x][y] != null || matriu[x + 1][y] != null || matriu[x + 2][y] != null || matriu[x + 3][y] != null || matriu[x + 4][y] != null) {
                i--;
            } else {
                matriu[x][y] = "P";
                matriu[x + 1][y] = "P";
                matriu[x + 2][y] = "P";
                matriu[x + 3][y] = "P";
                matriu[x + 4][y] = "P";
            }
        }
        for (c = 'A'; c <= 'J'; c++) {
            int i=0;
            System.out.print(c);
            for (int j = 0; j < matriu.length; j++) {
                
                if (matriu[i][j] != null) {
                } else {
                    matriu[i][j] = "-";
                }
                System.out.print(matriu[i][j] + " ");

            }
            System.out.println(" ");
            i++;
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

//        crear_tauler(tauler);
        mostrar_tauler(tauler);
    }

}
