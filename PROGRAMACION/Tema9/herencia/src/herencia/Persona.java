/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author rutvac
 */
public class Persona {
    private String nom;
    private String DNI;
    public Persona(String nom,String DNI){
        this.nom=nom;
        this.DNI=DNI;
    }
    public void mostrarPersona(){
        System.out.println("Nom: "+this.nom);
        System.out.println("DNI: "+this.DNI);

    } 
}
