package barcos2;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Barcos2 {

    public static void mostrar_tauler(String[][] matriu) {

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

    public static boolean preguntar(String[][] matriu, String[][] dos) {
        int fila = 0, columna = 0;
        boolean r = true;
        random(matriu);
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            end(dos);
            if (end(dos) == 1) {
               return true;
            }

            crear_tauler(dos);
            crear_tauler(matriu);
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
            disparar_tiro(matriu, fila, columna, dos);
            
            r = false;
        }

        return r;
    }

    public static void disparar_tiro(String[][] matriu, int x, int y, String[][] dos) {
        if (matriu[x][y] != "-") {
            dos[x][y] = "X";

        } else {
            dos[x][y] = "A";

        }
    }

    public static int end(String[][] dos) {
        int compr = 0;
        for (int i = 0; i < dos.length; i++) {
            for (int j = 0; j < dos.length; j++) {
                if (dos[i][j] == "X") {
                    compr++;
                }

            }
        }
        return compr;

    }

    public static void main(String[] args) {
        // TODO code application logic here
//        int nivel;
        String tauler[][] = new String[10][10];
        String ocult[][] = new String[10][10];
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Niveles: ");
//        System.out.println("1-Para facil\n2-Para medio\n3-Para dificil");
//        System.out.println("Elige un nivel: ");
//        nivel=sc.nextInt();
//        menu(nivel);
        if (preguntar(ocult, tauler)) {
            System.out.println("Has ganado!!");
        } else {
            System.out.println("Has perdido :(");
        }

    }
}
