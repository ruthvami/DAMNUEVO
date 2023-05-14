/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer10_mascotes;

/**
 *
 * @author angel
 */
public abstract class Mascota {
    private String nom;
    private int edat;
    private String estat; // jugant, dormint, mort ...
    private String dataNaixement;

    public Mascota(String nom,int edat,String estat,String dataNaixement) throws ExceptionNomBuit, ExceptionEdatNegativa{
        this.setNom(nom);
        this.setEdat(edat);
        this.estat = estat;
        this.dataNaixement = dataNaixement;
    }

    public String getNom() {
        return this.nom;
    }

    public int getEdat() {
        return this.edat;
    }

    public String getEstat() {
        return this.estat;
    }

    public String getDataNaixement() {
        return this.dataNaixement;
    }

    public void setNom(String nom) throws ExceptionNomBuit{
        if("".equals(nom)){
            throw new ExceptionNomBuit();
        }
        this.nom = nom;
    }

    public void setEdat(int edat) throws ExceptionEdatNegativa{
        if(edat < 0){
            throw new ExceptionEdatNegativa(this.getNom());
        }
        this.edat = edat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public void setDataNaixement(String dataNaixement) {
        this.dataNaixement = dataNaixement;
    }
    
    public abstract void mostrar();
    public abstract void parla();
    
    public void aniversari(){
        this.edat = this.edat + 1;
    }
    public void morir(){
        this.estat= "mort";
    }    
}