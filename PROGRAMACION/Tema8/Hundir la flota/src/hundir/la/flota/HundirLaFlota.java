package hundir.la.flota;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class HundirLaFlota {
//Esta funcion sirve para mostrar por pantalla el tablero 
//Tiene de entrada el tablero que quieres mostrar para que el usuario lo vea
//No se devuelve nada ya que es un void

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
//Crea un tablero que esta completo de guiones
//Tiene de entrada el tablero que quieres rellenar con guiones
//No se devuelve nada ya que es un void

    public static void crear_tauler(String[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                if (tauler[i][j] == null) {
                    tauler[i][j] = "-";
                }
            }
        }
    }
//Esta funcion sirve para poder saber el nombre de barcos e intentos y aciertos que tienes dependiendo del nivel
//Tiene de entrada un numero que se introduce desde el main para saber que nivel has elegido
//Devuelve el numero de lanchas,barcos,acorazados,portaviones,intentos y los aciertos que tienes que hacer

    public static int[] menu(int a) {
        switch (a) {
            case 1:
                return new int[]{5, 3, 1, 1, 50, 23};
            case 2:
                return new int[]{2, 1, 1, 1, 30, 14};
            case 3:
                return new int[]{1, 1, 0, 0, 10, 4};
            default:
                return null;
        }
    }
//Esta funcion rellena un tauler con los barcos
//Tiene de entrada el tablero que quieres rellenar y el numero del nivel que se ha escogido
//No se devuelve nada ya que es un void

    public static void random(String[][] tauler, int a) {
        int[] arr = menu(a);
        int L = arr[0];
        int B = arr[1];
        int Z = arr[2];
        int P = arr[3];
        crear_tauler(tauler);
        Lanchas(tauler, L);
        Barcos(tauler, B);
        Acorazados(tauler, Z);
        Portaaviones(tauler, P);
    }

    public static void Lanchas(String[][] tauler, int L) {
        for (int i = 0; i < L; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            if (tauler[x][y] != "-") {
                i--;
            } else {
                tauler[x][y] = "L";
            }
        }
    }

    public static void Barcos(String[][] tauler, int B) {
        for (int i = 0; i < B; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 8);
            if (tauler[x][y] != "-" || tauler[x][y + 1] != "-" || tauler[x][y + 2] != "-") {
                i--;
            } else {
                tauler[x][y] = "B";
                tauler[x][y + 1] = "B";
                tauler[x][y + 2] = "B";
            }
        }
    }

    public static void Acorazados(String[][] tauler, int Z) {
        for (int i = 0; i < Z; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 7);
            if (tauler[x][y] != "-" || tauler[x][y + 1] != "-" || tauler[x][y + 2] != "-" || tauler[x][y + 3] != "-") {
                i--;
            } else {
                tauler[x][y] = "Z";
                tauler[x][y + 1] = "Z";
                tauler[x][y + 2] = "Z";
                tauler[x][y + 3] = "Z";
            }
        }
    }

    public static void Portaaviones(String[][] tauler, int P) {
        for (int i = 0; i < P; i++) {
            int x = (int) (Math.random() * 6);
            int y = (int) (Math.random() * 10);
            if (tauler[x][y] != "-" || tauler[x][y] != "-" || tauler[x + 1][y] != "-" || tauler[x + 2][y] != "-" || tauler[x + 3][y] != "-" || tauler[x + 4][y] != "-") {
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
//Esta funcion es para preguntar por las filas y columnas que quieres disparar y comprueba que los datos que introduce son correctos
//Tiende de entrada el tablero que ese rellena y el que tiene los barcos ya puestos y tambien el nivel que has introducido
//Devulve un true si has acertado todos los barcos y un false si se acaban los intentos

    public static boolean preguntar(String[][] tauler, String[][] ocult, int a) {
        int fila = 0, columna = 0;
        boolean r = true;
        random(tauler, a);
        System.out.println(" ");
        Scanner sc = new Scanner(System.in);
        int[] arr = menu(a);
        int intentos = arr[4];
        int aciertos = arr[5];
        for (int i = 1; i <= intentos; i++) {
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
            disparar_tiro(tauler, fila, columna, ocult);
            System.out.println("Llevas " + i + "/" + intentos);
            r = false;
        }
        return r;
    }
//Comprueba que en el lugar que se ha disparado sea diferente a - para ver si hay un barco o es agua
//Tiene de entrada los dos tableros uno que tiene los barcos y el otro que apunta los disparos, tambien entran los lugares donde quieres disparar
//No se devuelve nada ya que es un void

    public static void disparar_tiro(String[][] tauler, int x, int y, String[][] ocult) {
        if (tauler[x][y] != "-") {
            ocult[x][y] = "X";
            System.out.println("***********TOCADO***********");
        } else {
            ocult[x][y] = "A";
            System.out.println("************AGUA************");
        }
    }
//Comprueba las x que hay en el tablero
//Tiene de entrada el tablero que introduces los disparos
//Devuelve el numero de X que hay en el tablero

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
        System.out.println("\nJUEGO HUNDIR LA FLOTA");
        System.out.println("\nNiveles: \n1-Para facil\n2-Para medio\n3-Para dificil\nElige un nivel: ");
        nivel = sc.nextInt();
        menu(nivel);
        if (preguntar(ocult, tauler, nivel)) {
            System.out.println("Has ganado!!");
        } else {
            System.out.println("Has perdido :(");
            mostrar_tauler(ocult);
        }
    }
}
