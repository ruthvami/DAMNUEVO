/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici.pkg4.compra.online;

/**
 *
 * @author rutvac
 */
public class Element {

    private String nom;
    private double preu;
    private int quantitat;

    /**
     *Constructor de la clase Element.
     * @param nom nombre del producto
     * @param preu precio del producto
     * @param quantitat cantidad del producto
     */
    public Element(String nom, double preu, int quantitat) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    
    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public int getQuantitat() {
        return quantitat;
    }


}
