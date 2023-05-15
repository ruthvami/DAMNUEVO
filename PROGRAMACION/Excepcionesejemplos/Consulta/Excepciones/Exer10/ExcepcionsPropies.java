/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer10_mascotes;

/**
 *
 * @author AiA
 */
class ExceptionEdatNegativa extends Exception {
    private String nom;
    public ExceptionEdatNegativa(String nom){
        this.nom = nom;
    }
    @Override
    public String toString(){
        return "*** ExceptionEdatNegativa {L'edat de " + this.nom + " no pot ser negativa}";
    }   
}

class ExceptionNoExisteixMascota extends Exception {
    private int index;
    
    public ExceptionNoExisteixMascota(int index) {
        this.index = index;
    }
    
    public String toString(){
        return "*** ExceptionNoExisteixMascota {l'index " + this.index+ " és incorrecte o no pertany a cap mascota}";
    }    
}

class ExceptionNomBuit extends Exception {

    @Override
    public String toString(){
        return "*** ExceptionNomBuit {No es pot crear una mascota sense nom}";
    }    
}
