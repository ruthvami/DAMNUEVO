/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici.pkg4.compra.online;

/**
 *
 * @author rutvac
 */
class Carret {
    String nom;
    double preu;
    double quantitat;

    public Carret(String nom, double preu, double quantitat) {
        this.nom = nom;
        this.preu = preu;
        this.quantitat = quantitat;
    }

    public Carret() {
        this.nom=" ";
        this.preu=0;
        this.quantitat=0;
    }
    
    
}
