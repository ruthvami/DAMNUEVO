/**
 * {@link tresraya.tresenraya}
 */
package tresraya.tresenraya;
import java.util.Scanner;
import tresraya.cuatroenraya.*;

/**
 *Clase donde se elige si juagar al tres en raya o al cuatro;
 * @author rutvac
 * @version 8/5/2023
 */
public class TresEnRaya {

    /**
     * Es el main del proyecto donde ocurre todo el juego;
     * @param args sirve para introducir por consola
     */
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        Tablero2 tablero2 = new Tablero2();
        Jugador jugador1 = new Jugador("X");
        Jugador jugador2 = new Jugador("O");
        int turno = 1;
        
        Scanner juego = new Scanner (System.in);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al juego del tres en raya!");
        System.out.println("Para jugar al tres en raya pulsa 1 y para jugar al cuatro en raya pulsa 2");
        System.out.println("Para jugar, ingresa las coordenadas de la casilla que quieras marcar.");
        System.out.println("En el tres en raya las filas y columnas van del 1 al 3. En cambio, en el cuatro en raya las filas van del 1 al 6 y las oclumnas del 1 al 7");
        
        
        if(juego.nextInt() == 1)
        {
            tablero.mostrarTablero();
        
            while (true) {
                Jugador jugadorActual = (turno % 2 == 1) ? jugador1 : jugador2;

                System.out.println("Turno del jugador " + jugadorActual.getMarca() + ".");
                System.out.print("Ingresa la fila: ");
                int fila = sc.nextInt();
                System.out.print("Ingresa la columna: ");
                int columna = sc.nextInt();
                System.out.println("\n");

                if (tablero.marcar(fila, columna, jugadorActual)) {
                    tablero.mostrarTablero();

                    if (tablero.hayGanador(jugadorActual)) {
                        System.out.println("¡El jugador " + jugadorActual.getMarca() + " ha ganado!");
                        System.out.println("\n");
                        break;
                    } else if (tablero.estaLleno()) {
                        System.out.println("¡Empate!");
                        System.out.println("\n");
                        break;
                    }

                    turno++;
                } else {
                    System.out.println("Esa casilla ya está ocupada. Intenta de nuevo.");
                    System.out.println("\n");
                }
            } 
        }
        else
        {
            tablero2.mostrarTablero();
        
            while (true) {
                Jugador jugadorActual = (turno % 2 == 1) ? jugador1 : jugador2;

                System.out.println("Turno del jugador " + jugadorActual.getMarca() + ".");
                System.out.print("Ingresa la fila: ");
                int fila = sc.nextInt();
                System.out.print("Ingresa la columna: ");
                int columna = sc.nextInt();
                System.out.println("\n");

                if (tablero2.marcar(fila, columna, jugadorActual)) {
                    tablero2.mostrarTablero();

                    if (tablero2.hayGanador(jugadorActual)) {
                        System.out.println("¡El jugador " + jugadorActual.getMarca() + " ha ganado!");
                        System.out.println("\n");
                        break;
                    } else if (tablero2.estaLleno()) {
                        System.out.println("¡Empate!");
                        System.out.println("\n");
                        break;
                    }

                    turno++;
                } else {
                    System.out.println("Esa casilla ya está ocupada. Intenta de nuevo.");
                    System.out.println("\n");
                }
            }
        }
        
        /*
        System.out.println("");*/

        
        System.out.println("¡Gracias por jugar!");
    }
}
