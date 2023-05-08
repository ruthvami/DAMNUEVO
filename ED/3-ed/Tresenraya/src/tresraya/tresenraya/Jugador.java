/**
 * {@link tresraya.tresenraya}
 */
package tresraya.tresenraya;

/**
 *Esta clase sirve para definir a un jugador;
 * @author rutvac
 * @version 8/5/2023
 */
public class Jugador {
    private String marca;
    
    /**
     *El constructor identifica que marca es la de cada jugador;
     * @param marca sirve para ver cual es la marca que identifica al jugador
     */
    public Jugador(String marca) {
        this.marca = marca;
    }
    
    /**
     *El getMarca sirve para poder decir la marca que se le ha asignado;
     * @return la marca del jugador
     */
    public String getMarca() {
        return marca;
    }
}




