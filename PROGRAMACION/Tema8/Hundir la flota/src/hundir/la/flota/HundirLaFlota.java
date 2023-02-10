package hundir.la.flota;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class HundirLaFlota {
//La funcion mostrar_tauler crea un tablero, lo rellena  y lo muestra por pantalla
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -String[][] tauler:Referencia a el tablero que se va a rellenar

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
//La funcion crear_tauler es para rellenar la matriz de guiones
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -String[][] tauler:Referencia a el tablero que se va a rellenar

    public static void crear_tauler(String[][] tauler) {
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler.length; j++) {
                if (tauler[i][j] == null) {
                    tauler[i][j] = "-";
                }
            }
        }
    }
//La funcion menu dependiendo del valor que se introduce se devolvera un array diferente
//      *Devuelve:un array lleno de int
//      *Parametros de entrada:
//          -int a: numero introducido desde el main

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
//La funcion random dependiendo del valor que se introduce el valor de los barcos sera diferente y se introducen dentro de la matriz 
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -int a: numero introducido desde el main
//          -String[][] tauler:Referencia a el tablero que se va a rellenar

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
//La funcion Lanchas dependiendo del valor introducido se ejecutan un numero de lanchas diferentes y se añaden al tablero
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -int L: numero introducido desde la funcion random 
//          -String[][] tauler:Referencia a el tablero que se va a rellenar

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
//La funcion Barcos dependiendo del valor introducido se ejecutan un numero de lanchas diferentes y se añaden al tablero
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -int B: numero introducido desde la funcion random 
//          -String[][] tauler:Referencia a el tablero que se va a rellenar

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
//La funcion Acorazados dependiendo del valor introducido se ejecutan un numero de lanchas diferentes y se añaden al tablero
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -int Z: numero introducido desde la funcion random 
//          -String[][] tauler:Referencia a el tablero que se va a rellenar

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
//La funcion Portaaviones dependiendo del valor introducido se ejecutan un numero de lanchas diferentes y se añaden al tablero
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -int P: numero introducido desde la funcion random 
//          -String[][] tauler:Referencia a el tablero que se va a rellenar

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
//La funcion preguntar pregunta a donde quieres disparar y hace los intentos que se han introducido
//      *Devuelve:un booleno true si se aciertan todos los barcos y un false si se hacen todos los intentos
//      *Parametros de entrada:
//          -int a: numero introducido desde el main
//          -String[][] tauler:Referencia a el tablero que tiene los barcos
//          -String[][] ocult:Referencia a el tablero que se muestra por pantalla

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
//La funcion disparar_tiro añade una x y dice el texto tocado si has disparado bien y una a y el texto agua si no se ha acertado al disparar
//      *Devuelve:es un void por lo que no devulve nada
//      *Parametros de entrada:
//          -int x: fila donde se ha disparado
//          -int y: columna donde se ha disparado
//          -String[][] tauler:Referencia a el tablero que tiene los barcos
//          -String[][] ocult:Referencia a el tablero que se muestra por pantalla

    public static void disparar_tiro(String[][] tauler, int x, int y, String[][] ocult) {
        if (tauler[x][y] != "-") {
            ocult[x][y] = "X";
            System.out.println("***********TOCADO***********");
        } else {
            ocult[x][y] = "A";
            System.out.println("************AGUA************");
        }
    }
//La funcion end recorre toda la matriz contando las X que hay
//      *Devuelve:el numero de X que se han encontrado
//      *Parametros de entrada:
//          -String[][] ocult:Referencia a el tablero que se muestra por pantalla

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
//La funcion main te pregunta por el nivel que quieres seleccionar y te dice si has ganado o perdido

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
        }
        mostrar_tauler(ocult);
    }
}