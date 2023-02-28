/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmascotas;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rutvac
 */
public abstract class Mascotas {
    private String nom;
    private int edat;
    private String estat;
    private String data;
    
    public Mascotas(String nom,int edat,String estat,String data){
        this.data=data;
        this.edat=edat;
        this.estat=estat;
        this.nom=nom;
    }
    public void mostrar(){
        System.out.println("Nom:"+this.getNom()+"\t Edat:"+this.getEdat());
        System.out.println("Estat:"+this.getEstat()+"\t Naixement:"+this.getData());
    }
    public abstract void parla();
    public void aniversari(){
        setEdat(edat+1);   
    }
    public void morir(){
        setEstat("mort");
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String getEstat() {
        return estat;
    }

    public String getData() {
        return data;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setEstat(String estat) {
        this.estat = estat;
    }

    public void setData(String data) {
        this.data = data;
    }
}
