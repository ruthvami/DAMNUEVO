/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author rutvac
 */
class ExceptionNom extends Exception{
    private String nom;

    public ExceptionNom(String nom) {
        this.nom = nom;
    }
    public String toString() {
        return "*** Excepcion capturada: "+this.getClass().getSimpleName()+" EL nombre debe tener minimo 3 letras y no tener numeros --> "+this.nom;
    }
    
}
