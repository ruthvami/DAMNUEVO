package exercici.pkg4.compra.online;

/**
 *
 * @author Ingrid de Aro Rodrigues
 */
public class Element {

    private String nomProducte;
    private double preu;
    private int quantitat;

    /**
     * Constructor de la clase Element.
     *
     * @param nomProducte Nombre del producto que se quiere comprar.
     * @param preu Precio del producto.
     * @param quantitat La cantidad de productos que se quiere comprar.
     */
    public Element(String nomProducte, double preu, int quantitat) {
        this.nomProducte = nomProducte;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    /**
     * Getter.
     *
     * @return la variable nomProducte de un objeto Element.
     */
    public String getNomProducte() {
        return nomProducte;
    }

    /**
     * Getter.
     *
     * @return la variable preu de un objeto Element.
     */
    public double getPreu() {
        return preu;
    }

    /**
     * Getter.
     *
     * @return la variable quantitat de un objeto Element.
     */
    public int getQuantitat() {
        return quantitat;
    }
}
