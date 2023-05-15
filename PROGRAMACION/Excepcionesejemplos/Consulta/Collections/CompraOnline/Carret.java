package exercici.pkg4.compra.online;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Ingrid de Aro Rodrigues
 */
public class Carret {

    /**
     * ArrayList para guardar objetos de tipo Element.
     */
    private final ArrayList<Element> elMeuCarret = new ArrayList<>();
    /**
     * Mapa utilizado para actualizar la cantidad de productos de cada tipo en
     * el carrito.
     */
    private final Map<String, Integer> productos = new HashMap<>();

    /**
     * Se utiliza para insertar Elements en el ArrayList elMeuCarret.
     *
     * @param e Objeto de tipo Element.
     */
    public void agrega(Element e) {
        if (productos.containsKey(e.getNomProducte())) {
            int quantitat = productos.get(e.getNomProducte()) + e.getQuantitat();
            productos.replace(e.getNomProducte(), quantitat);
        } else {
            elMeuCarret.add(e);
            productos.put(e.getNomProducte(), e.getQuantitat());
        }
    }

    /**
     * Se utiliza para conocer la cantidad de productos en el carrito.
     *
     * @return int elements: cantidad de elementos en el HashMap productos.
     */
    public int numElements() {
        int elements = 0;
        for (Integer producto : productos.values()) {
            elements += producto;
        }
        return elements;
    }

    /**
     * Se utiliza para conocer el importe total de la compra.
     *
     * @return double total: total de la compra.
     */
    public double importTotal() {
        double total = 0;
        for (Element element : elMeuCarret) {
            total += element.getPreu() * productos.get(element.getNomProducte());
        }
        return total;
    }

    /**
     * Método toString() del objeto Carret.
     *
     * @return String resultado: String concatenada con los nombres, precios y
     * cantidades de cada objeto de tipo Element en el carrito.
     */
    @Override
    public String toString() {
        String resultado = """
                           Nom del Producte          | Preu            | Quantitat
                           -------------------------------------------------------
                           """;
        for (Element element : elMeuCarret) {
            int quantitat = productos.get(element.getNomProducte());
            resultado += String.format("%-25s | %,15.2f | %8d\n", element.getNomProducte(), element.getPreu(), quantitat);
        }
        return resultado;
    }
}
