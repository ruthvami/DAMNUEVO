package hundir.la.flota;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class HundirLaFlota {

    public static void mostrar_tauler(String[][] matriu) {
        char c;
        int i2 = 0;
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        for (c = 'A'; c <= 'J'; c++) {
//           for (int i = 0; i < matriu.length; i++) {
            for (int j = 0; j < matriu.length; j++) {
                System.out.print(c);

                if (matriu[i2][j] == null) {
                    matriu[i2][j] = "-";
                }
                System.out.print(matriu[i2][j] + " ");
                i2++;
            }
            System.out.println(" ");
        }
    }

    public static void inserir_vaixell(String[][] matriu) {
        crear_tauler(matriu);
//        random(matriu);
    }

//    public static boolean dispara_tret(String[][] matriu) {
////            inserir_vaixell(matriu);
//            
//    }
    public static void crear_tauler(String[][] matriu) {
//        random(matriu);
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

    public static int menu(int a) {
        int niveles[] = {int L,int B, int Z,int P,int intents};
        switch (a) {
        case 1:
            L = 5;
            B = 3;
            Z = 1;
            P = 1;
            intents = 50;

            break;
        case 2:
            L = 2;
            B = 1;
            Z = 1;
            P = 1;
            intents = 30;

            break;
        case 3:
            L = 1;
            B = 1;
            intents = 10;
            break;

    }
        
    return niveles[] ;

}

public static void random(String[][] matriu,int niveles[]) {
        menu(niveles);
        for (int i = 0; i <5; i++) {
            System.out.println(niveles[i]); 
                }
        for (int i = 0; i < L; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);

            if (matriu[x][y] != null) {
                i--;
            } else {
                matriu[x][y] = "L";
            }
        }
        for (int i = 0; i < B; i++) {
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
        for (int i = 0; i < Z; i++) {
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
        for (int i = 0; i < P; i++) {
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

    public static void main(String[] args) {
        // TODO code application logic here
        int nivel;
        String tauler[][] = new String[10][10];
        String ocult[][] = new String[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Niveles: ");
        System.out.println("1-Para facil\n2-Para medio\n3-Para dificil");
        System.out.println("Elige un nivel: ");
        nivel=sc.nextInt();

//        mostrar_tauler(tauler);
        crear_tauler(tauler);
        menu(nivel);
    }

}
