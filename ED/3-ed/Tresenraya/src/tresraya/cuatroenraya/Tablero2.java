/**
 * {@link tresraya.cuatroenraya}
 */
package tresraya.cuatroenraya;

import tresraya.tresenraya.*;

/**
 *Esta clase es el tablero del cuatro en raya
 * @author rutvac
 * @version 8/5/2023
 */
public class Tablero2 {

    private String[][] tablero2;
    
    /**
     *Cosntructor del tablero, le asigna su medida;
     */
    public Tablero2() {
        tablero2 = new String[6][7];
        reiniciar();
    }

    /**
     *Pone el tablero a cero, como si no se hubiera jugado nadie;
     */
    public void reiniciar() {
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                tablero2[fila][columna] = "-";
            }
        }
    }

    /**
     *Muestra por pantalla el estado del tablero en ese momento;
     */
    public void mostrarTablero() {
    for (int fila = 0; fila < 6; fila++) {
        for (int columna = 0; columna < 7; columna++) {
            System.out.print(tablero2[fila][columna] + " ");
        }
        System.out.println();
    }
}

   /**
     *Marca donde le ha indicado la persona;
     * @param fila fila donde se quiere marcar
     * @param columna columna donde se quiere marcar
     * @param jugador es el jugador que ha hecho su turno
     * @return devuelve true si aun no se habia marcado en ese lugar y false si ya se habia marcado
     */
    public boolean marcar(int fila, int columna, Jugador jugador) {
        if (tablero2[fila-1][columna-1].equals("-")) {
            tablero2[fila-1][columna-1] = jugador.getMarca();
            return true;
        } else {
            return false;
        }
    }

   /**
     *Averigua si se ha ganado la partida uno de los dos jugadores;
     * @param jugador indica cual de los dos es el juagador que ha podido ganar
     * @return devuelve true si se gana y false si no ha ganado 
     */
    public boolean hayGanador(Jugador jugador) {
    String marca = jugador.getMarca();
    // Comprobar las filas
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 4; j++) {
            if (tablero2[i][j].equals(marca) && tablero2[i][j+1].equals(marca) && tablero2[i][j+2].equals(marca) && tablero2[i][j+3].equals(marca)) {
                return true;
            }
        }
    }
    // Comprobar las columnas
    for (int i = 0; i < 7; i++) {
        for (int j = 0; j < 3; j++) {
            if (tablero2[j][i].equals(marca) && tablero2[j+1][i].equals(marca) && tablero2[j+2][i].equals(marca) && tablero2[j+3][i].equals(marca)) {
                return true;
            }
        }
    }
    // Comprobar diagonales descendentes
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 4; j++) {
            if (tablero2[i][j].equals(marca) && tablero2[i+1][j+1].equals(marca) && tablero2[i+2][j+2].equals(marca) && tablero2[i+3][j+3].equals(marca)) {
                return true;
            }
        }
    }
    // Comprobar diagonales ascendentes
    for (int i = 3; i < 6; i++) {
        for (int j = 0; j < 4; j++) {
            if (tablero2[i][j].equals(marca) && tablero2[i-1][j+1].equals(marca) && tablero2[i-2][j+2].equals(marca) && tablero2[i-3][j+3].equals(marca)) {
                return true;
            }
        }
    }
    return false;
}

    /**
     *Mira si el trablero esta entero marcado o si aun hay huecos;
     * @return devuelve true si esta lleno y false si aun queda sitio por marcar
     */
    public boolean estaLleno() {
        for (int fila = 0; fila < 6; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                if (tablero2[fila][columna].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

}
    
