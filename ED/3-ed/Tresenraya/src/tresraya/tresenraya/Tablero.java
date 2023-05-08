/**
 * {@link tresraya.tresenraya}
 */
package tresraya.tresenraya;

/**
 *Esta clase es el tablero del tres en raya
 * @author rutvac
 * @version 8/5/2023
 */
public class Tablero {

    private String[][] tablero;
    
    /**
     *Cosntructor del tablero, le asigna su medida;
     */
    public Tablero() {
        tablero = new String[3][3];
        reiniciar();
    }

    /**
     *Pone el tablero a cero, como si no se hubiera jugado nadie;
     */
    public void reiniciar() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = "-";
            }
        }
    }

    /**
     *Muestra por pantalla el estado del tablero en ese momento;
     */
    public void mostrarTablero() {
    for (int fila = 0; fila < 3; fila++) {
        for (int columna = 0; columna < 3; columna++) {
            System.out.print(tablero[fila][columna] + " ");
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
        if (tablero[fila-1][columna-1].equals("-")) {
            tablero[fila-1][columna-1] = jugador.getMarca();
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
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].equals(marca) && tablero[i][1].equals(marca) && tablero[i][2].equals(marca)) {
                return true;
            }
            if (tablero[0][i].equals(marca) && tablero[1][i].equals(marca) && tablero[2][i].equals(marca)) {
                return true;
            }
        }
        if (tablero[0][0].equals(marca) && tablero[1][1].equals(marca) && tablero[2][2].equals(marca)) {
            return true;
        }
        if (tablero[0][2].equals(marca) && tablero[1][1].equals(marca) && tablero[2][0].equals(marca)) {
            return true;
        }
        return false;
    }

    /**
     *Mira si el trablero esta entero marcado o si aun hay huecos;
     * @return devuelve true si esta lleno y false si aun queda sitio por marcar
     */
    public boolean estaLleno() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (tablero[fila][columna].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

}
    
