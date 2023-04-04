/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej14;

/**
 *
 * @author rutvac
 */
public class Gato {
    private final String nom;
    private final String sexe;

    public Gato(String nom, String sexe) {
        this.nom = nom;
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

   
    public String getSexe() {
        return sexe;
    }
    public Gato aparearse(Gato uno) throws Exception, ExceptionApariamentImpossible{
        int x = 0 + (int) (Math.random() * (1 - 0 + 1));
        if(uno.nom==nom){
            throw new Exception("**** ERROR: No es pot apariar a "+this.nom+" amb si mateix");
        }else if(uno.sexe==this.sexe){
            throw new ExceptionApariamentImpossible(uno,nom,sexe);
        }
            
            if(x==1){
                return new Gato("","mascle");
//            System.out.println("L'apariament de "+uno.getNom()+" amb "+this.getNom()+" ha resultat en un gatet");
            }
            else{
                return new Gato("","femella");
//            System.out.println("L'apariament de "+uno.getNom()+" amb "+this.getNom()+" ha resultat en un gateta");
            }
        
    }
    
}
