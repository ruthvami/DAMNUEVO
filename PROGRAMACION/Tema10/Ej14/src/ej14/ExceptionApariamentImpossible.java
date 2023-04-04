/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author rutvac
 */
public class ExceptionApariamentImpossible extends Exception{

    private final Gato uno;
    private final String nom;
    private final String sexe;

    public ExceptionApariamentImpossible(Gato uno,String nom,String sexe) {
        this.uno = uno;
        this.nom = nom;
        this.sexe=sexe;
    }
    ExceptionApariamentImpossible(String nom){
        this.nom=nom;
    }
    @Override
    public String toString() {
        if(sexe.toLowerCase()=="femella"){
        return "**** ERROR: Dos gats femella ("+this.uno.getNom()+","+this.nom+") no es poden apariar";}
        else{
        return "**** ERROR: Dos gats mascle ("+this.uno.getNom()+","+this.nom+") no es poden apariar";
        }
    }

}
