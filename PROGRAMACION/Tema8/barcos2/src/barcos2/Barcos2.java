package barcos2;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Barcos2 {

    public static void mostrar_tauler(String[][] tauler) {

        char[] letra = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.print(" ");
        for (int i = 0; i < tauler.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        for (int i = 0; i < tauler.length; i++) {

            System.out.print(letra[i] + " ");
            for (int j = 0; j < tauler.length; j++) {
                if (tauler[i][j] == null) {
                    tauler[i][j] = "-";
                }
                System.out.print(tauler[i][j] + " ");

            }
            System.out.println(" ");
        }

    }

    public static void crear_tauler(String[][] tauler) {

        for (int i = 0; i < tauler.length; i++) {

            for (int j = 0; j < tauler.length; j++) {
                if (tauler[i][j] == null) {
                    tauler[i][j] = "-";
                }

            }
        }

    }

    public static int[] menu(int a) {
        switch (a) {
            case 1:
                return new int[]{5, 3, 1, 1,50,23};
            case 2:
                return new int[]{2, 1, 1, 1,30,14};
            case 3:
                return new int[]{1, 1, 0, 0,10,4};
        }
        return null;
    }

    public static void random(String[][] tauler, int a) {
        int[] arr = menu(a);
        int L = arr[0];
        int B = arr[1];
        int Z = arr[2];
        int P = arr[3];

        for (int i = 0; i < L; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);

            if (tauler[x][y] != null) {
                i--;
            } else {
                tauler[x][y] = "L";
            }
        }
        for (int i = 0; i < B; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 8);

            if (tauler[x][y] != null || tauler[x][y + 1] != null || tauler[x][y + 2] != null) {
                i--;
            } else {
                tauler[x][y] = "B";
                tauler[x][y + 1] = "B";
                tauler[x][y + 2] = "B";
            }
        }
        for (int i = 0; i < Z; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 7);

            if (tauler[x][y] != null || tauler[x][y + 1] != null || tauler[x][y + 2] != null || tauler[x][y + 3] != null) {
                i--;
            } else {
                tauler[x][y] = "Z";
                tauler[x][y + 1] = "Z";
                tauler[x][y + 2] = "Z";
                tauler[x][y + 3] = "Z";
            }
        }
        for (int i = 0; i < P; i++) {
            int x = (int) (Math.random() * 6);
            int y = (int) (Math.random() * 10);

            if (tauler[x][y] != null || tauler[x][y] != null || tauler[x + 1][y] != null || tauler[x + 2][y] != null || tauler[x + 3][y] != null || tauler[x + 4][y] != null) {
                i--;
            } else {
                tauler[x][y] = "P";
                tauler[x + 1][y] = "P";
                tauler[x + 2][y] = "P";
                tauler[x + 3][y] = "P";
                tauler[x + 4][y] = "P";
            }
        }

    }

    public static boolean preguntar(String[][] tauler, String[][] ocult,int a) {
        int fila = 0, columna = 0;
        boolean r = true;
        random(tauler,a);
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        int[] arr = menu(a);
        int intentos = arr[4];
        int aciertos = arr[5];
        for (int i = 0; i < intentos; i++) {
            end(ocult);
            if (end(ocult) == aciertos) {
                return true;
            }

            mostrar_tauler(ocult);
            crear_tauler(tauler);
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
//            System.out.printf("%20d","*");
            disparar_tiro(tauler, fila, columna, ocult);

            r = false;
        }

        return r;
    }

    public static void disparar_tiro(String[][] tauler, int x, int y, String[][] ocult) {
        if (tauler[x][y] != "-") {
            ocult[x][y] = "X";
            System.out.println("***********TOCADO***********");
        } else {
            ocult[x][y] = "A";
            System.out.println("************AGUA************");
        }
    }

    public static int end(String[][] ocult) {
        int compr = 0;
        for (int i = 0; i < ocult.length; i++) {
            for (int j = 0; j < ocult.length; j++) {
                if (ocult[i][j] == "X") {
                    compr++;
                }

            }
        }
        return compr;

    }

    public static void main(String[] args) {
        // TODO code application logic here
        int nivel;
        String tauler[][] = new String[10][10];
        String ocult[][] = new String[10][10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Niveles: ");
        System.out.println("1-Para facil\n2-Para medio\n3-Para dificil");
        System.out.println("Elige un nivel: ");
        nivel = sc.nextInt();
        menu(nivel);
        if (preguntar(ocult, tauler,nivel)) {
            System.out.println("Has ganado!!");
        } else {
            System.out.println("Has perdido :(");
            mostrar_tauler(ocult);
        }

    }
}
