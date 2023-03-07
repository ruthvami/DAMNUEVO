/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e1_aliment;

/**
 *
 * @author angel
 */
public class Aliment {
    private String nom;
    private int quantitat;
    
    public Aliment(String nom,int quantitat){
        this.nom = nom;
        this.quantitat = quantitat;
    }
    
    public String getNom(){
        return this.nom;
    }
    public int getQuantitat(){
        return this.quantitat;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public void setQuantitat(int quantitat){
        this.quantitat = quantitat;
    }
    
}