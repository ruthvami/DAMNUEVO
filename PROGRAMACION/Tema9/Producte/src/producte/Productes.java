/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package producte;

/**
 *
 * @author rutvac
 */
public class Productes {
    private String nom;
    private int quantitat;

    /**
     *
     * @param nom nombre del producto
     * @param quantitat cantidad de producto
     */
    public Productes(String nom,int quantitat){//esto es un constructor
        this.nom=nom;
        this.quantitat=quantitat;
    }

    /**
     *
     */
    public Productes(){//esto es un constructor
       this.nom="NoData";
       this.quantitat=0;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the quantitat
     */
    public int getQuantitat() {
        return quantitat;
    }

    /**
     * @param quantitat the quantitat to set
     */
    public void setQuantitat(int quantitat) {
        this.quantitat = quantitat;
    }
//    public String toString(){
//        return "Nom: "+this.nom+"Cantidad: "+this.quantitat ;
//    }
}
