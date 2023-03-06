/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobiblioteca;

/**
 *
 * @author rutvac
 */
public class Usuario {
    private String nom;
    private String ciutat;
    private int numUsuaris;
    
    public Usuario(String nom, String ciutat) {
        this.nom = nom;
        this.ciutat = ciutat;
        numUsuaris++;
    }

    public int getNumUsuaris() {
        return numUsuaris;
    }
    
}
