/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c2.persona;

/**
 *
 * @author rutvac
 */
public class Persona {

    private String dni, nom, cognom;
    private int edat;

    public Persona(String dni, String nom, String cognom, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }
    public String getDni(){
        return this.dni;
    }
    public String getNom(){
        return this.nom;
    }
    public String getCognom(){
        return this.cognom;
    }
    public int getEdat(){
        return this.edat;
    }
    
    public void setEdat( int edat ){
        this.edat=edat;
    }
    public void setCognom(String cognom){
        this.cognom=cognom;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
}
