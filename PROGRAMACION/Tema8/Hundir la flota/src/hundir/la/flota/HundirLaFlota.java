package hundir.la.flota;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class HundirLaFlota {

    public static void mostrar_tauler(String[][] oculto) {
        int x, y;
        char[] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.print(" ");
        for (int i = 0; i < oculto.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 0; i < oculto.length; i++) {

            System.out.print(letra[i] + " ");
            for (int j = 0; j < oculto.length; j++) {
                if (oculto[i][j] == null) {
                    oculto[i][j] = "-";
                }
                System.out.print(oculto[i][j] + " ");

            }
            System.out.println(" ");
        }

    }

    public static void crear_tauler(String[][] oculto) {

        char[] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.print(" ");
        for (int i = 0; i < oculto.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 0; i < oculto.length; i++) {

            System.out.print(letra[i] + " ");
            for (int j = 0; j < oculto.length; j++) {
                if (oculto[i][j] == null) {
                    oculto[i][j] = "-";
                }
                System.out.print(oculto[i][j] + " ");

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

    public static void random(String[][] oculto) {

        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);

            if (oculto[x][y] != null) {
                i--;
            } else {
                oculto[x][y] = "L";
            }
        }
        for (int i = 0; i < 3; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 8);

            if (oculto[x][y] != null || oculto[x][y + 1] != null || oculto[x][y + 2] != null) {
                i--;
            } else {
                oculto[x][y] = "B";
                oculto[x][y + 1] = "B";
                oculto[x][y + 2] = "B";
            }
        }
        for (int i = 0; i < 1; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 7);

            if (oculto[x][y] != null || oculto[x][y + 1] != null || oculto[x][y + 2] != null|| oculto[x][y + 3] != null) {
                i--;
            } else {
                oculto[x][y] = "Z";
                oculto[x][y + 1] = "Z";
                oculto[x][y + 2] = "Z";
                oculto[x][y + 3] = "Z";
            }
        }
        for (int i = 0; i < 1; i++) {
            int x = (int) (Math.random() * 6);
            int y = (int) (Math.random() * 10);

            if (oculto[x][y] != null || oculto[x][y] != null || oculto[x + 1][y] != null || oculto[x + 2][y] != null|| oculto[x + 3][y] != null || oculto[x + 4][y] != null) {
                i--;
            } else {
                oculto[x][y] = "P";
                oculto[x + 1][y] = "P";
                oculto[x + 2][y] = "P";
                oculto[x + 3][y] = "P";
                oculto[x + 4][y] = "P";
            }
        }

    }

    public static boolean preguntar(String[][] oculto, String[][] persona) {
        int fila;
        int columna;
        random(oculto);
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
       
        for (int i = 0; i < 50; i++) {
            crear_tauler(persona);     
            crear_tauler(oculto);
            System.out.println("Donde quieres disparar? ");
            do {
                System.out.print("Ingresa una fila (A-J): ");
                fila = sc.nextLine().toUpperCase().charAt(0) - 'A';
                if (fila < 0 || fila > 9) {
                    System.out.println("Error: la fila debe ser entre A y J");
                }
            } while (fila < 0 || fila > 9);
            do {
                System.out.print("Ingresa una columna (0-9): ");
                columna = sc.nextInt();
                if (columna < 0 || columna > 9) {
                    System.out.println("Error: la columna debe ser entre 0 y 9");
                }
            } while (columna < 0 || columna > 9);
            sc.nextLine();
            disparar_tiro(oculto, fila, columna,persona);
        }
        return false;

    }

    public static void disparar_tiro(String[][] oculto, int x, int y,String[][] persona) {
        if (oculto [x][y] != "-") {
            persona[x][y] = "X";
                 
        } else {
            persona[x][y] = "A";
            
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
//        int nivel;
        String persona[][] = new String[10][10];
        String oculto[][] = new String[10][10];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Niveles: ");
//        System.out.println("1-Para facil\n2-Para medio\n3-Para dificil");
//        System.out.println("Elige un nivel: ");
//        nivel=sc.nextInt();
        preguntar(oculto, persona);
//        menu(nivel);
    }
}