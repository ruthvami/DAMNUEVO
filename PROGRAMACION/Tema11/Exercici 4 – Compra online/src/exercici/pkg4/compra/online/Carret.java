/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici.pkg4.compra.online;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rutvac
 */
class Carret {

    /**
     * carrito se usa para saber el numero de productos.
     */
    private final ArrayList<Element> carrito = new ArrayList<>();
    /**
     * productes se añaden todos los productos que van a pedir.
     */
    Map<String, Integer> productes = new HashMap<>();

    /**
     * Funcion agrega() sirve para agregar o cambiar la cantidad de productos
     * que se requieren.
     *
     * @param ele es el Element que se va a agregar
     */
    public void agrega(Element ele) {
        if (productes.containsKey(ele.getNom())) {
            int quantitat = productes.get(ele.getNom());
            productes.replace(ele.getNom(), quantitat + ele.getQuantitat());
        } else {
            carrito.add(ele);
            productes.put(ele.getNom(), ele.getQuantitat());
        }
    }

    /**
     * Funcion numElements() muestra la cantidad de elementos.
     *
     * @return la cantidad de productos en ese momento
     */
    public int numElements() {
        return carrito.size();
    }

    /**
     * Funcion importTotal() muestra el importe total de toda la compra .
     * @return la cantidad total
     */
    public double importTotal() {
        double total = 0;
        for (Element elemento : carrito) {
            int cantidad = productes.get(elemento.getNom());
            total += elemento.getPreu() * cantidad;
        }
        return total;
    }

    /**
     * Funcion toString() para mostrar los productos y el precio total del producto .
     * @return un String que muestre el nombre del elemento y la cifra de todos los que quiere
     */
    @Override
    public String toString() {
        String resultat = "";
        for (Element element : carrito) {
            int quantitat = productes.get(element.getNom());
            double importTotal = element.getQuantitat() * element.getPreu();
            resultat += element.getNom() + " (" + quantitat + " x " + element.getPreu() + " euros) = " + importTotal + " euros\n";
        }
        return resultat;
    }
}
