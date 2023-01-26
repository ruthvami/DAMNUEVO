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

    public static void mostrar_tauler(String[][] matriu) {
        int x = 0, y = 0;
        disparar_tiro(matriu, x, y);
        char[] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 0; i < matriu.length; i++) {

            System.out.print(letra[i] + " ");
            for (int j = 0; j < matriu.length; j++) {
                if (matriu[i][j] == null) {
                    matriu[i][j] = "-";
                }
                System.out.print(matriu[i][j] + " ");

            }
            System.out.println(" ");
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
    public static void crear_tauler(String[][] matriu) {

        char[] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 0; i < matriu.length; i++) {

            System.out.print(letra[i] + " ");
            for (int j = 0; j < matriu.length; j++) {
                if (matriu[i][j] == null) {
                    matriu[i][j] = "-";
                }
                System.out.print(matriu[i][j] + " ");

            }
            System.out.println(" ");
        }

    }

    public static void menu(int a) {
        int intents = 0, vaixell = 0;

        switch (a) {
            case 1:
                vaixell = 10;
                intents = 50;

                break;
            case 2:
                vaixell = 5;
                intents = 30;

                break;
            case 3:
                vaixell = 2;
                intents = 10;
                break;
        }

    }

    public static void random(String[][] matriu) {

        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);

            if (matriu[x][y] != null) {
                i--;
            } else {
                matriu[x][y] = "L";
            }
        }
        for (int i = 0; i < 3; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 8);

            if (matriu[x][y] != null || matriu[x][y + 1] != null || matriu[x][y + 2] != null) {
                i--;
            } else {
                matriu[x][y] = "B";
                matriu[x][y + 1] = "B";
                matriu[x][y + 2] = "B";
            }
        }
        for (int i = 0; i < 1; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 7);

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
            int x = (int) (Math.random() * 6);
            int y = (int) (Math.random() * 10);

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

    }
    

    public static boolean preguntar(String[][] matriu) {
        String fila;
        int columna;
        random(matriu);
        Scanner sc = new Scanner(System.in);
        System.out.println("Donde quieres disparar? ");

        for (int i = 0; i < 50; i++) {
//            
            do {
                System.out.print("Ingresa una fila (A-J): ");
                fila = sc.nextLine().toUpperCase();
                if (!(fila.matches("[A-J]"))) {
                    System.out.println("Error: la fila debe ser entre A y J");
                }
            } while (!(fila.matches("[A-J]")));
            do {
                System.out.print("Ingresa una columna (0-9): ");
                columna = sc.nextInt();
                if (columna < 0 || columna > 9) {
                    System.out.println("Error: la columna debe ser entre 0 y 9");
                }
            } while (columna < 0 || columna > 9);
            sc.nextLine();
            crear_tauler(matriu);
        }
        return true;

    }

    public static boolean disparar_tiro(String[][] matriu, int x, int y) {
        if (matriu[x][y] != "-") {
            matriu[x][y] = "X";
            return true;
        } else {
            matriu[x][y] = "A";
            return false;
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
//        int nivel;

        String tauler[][] = new String[10][10];
        String ocult[][] = new String[10][10];
        
        preguntar(ocult);
//       

//        mostrar_tauler(tauler);
//        crear_tauler(tauler);
//        menu(nivel);
    }

}
