/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer14;

public class ExceptionApariamentImpossible extends Exception {

    private Gat G1;
    private Gat G2;
    private String missatge;

    public ExceptionApariamentImpossible(Gat G1) {
        this.G1 = G1;
        this.missatge = "**** ERROR: No es pot apariar a " + 
                this.G1.getNom() + " amb si mateix";
    }
    public ExceptionApariamentImpossible(Gat G1, Gat G2) {
        this.G1 = G1;
        this.G2 = G2;
        this.missatge = "**** ERROR: Dos gats " + this.G1.getSexe() + " (" + 
                this.G1.getNom() + ", " + this.G2.getNom() + ") no es poden apariar";
    }

    @Override
    public String toString() {
        return this.missatge;
    }
}
