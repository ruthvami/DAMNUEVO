/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author rutvac
 */
public class Persona2 {
    private String nom;
    protected String DNI;
    public Persona2(String nom,String DNI){
        this.nom=nom;
        this.DNI=DNI;
    }
    private void mostrarPersona(){
        System.out.println("Nom: "+this.nom);
        System.out.println("DNI: "+this.DNI);

    } 
}
