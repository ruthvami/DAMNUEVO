/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_banc;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class LLibres extends Element {
    private String titol;
    private final int ISBN;
    private ArrayList isbnUsats= new ArrayList();

    public LLibres(String titol, Usuario usuariPrestat,String titol,int ISBN) {
        super(titol,usuariPrestat);
        this.titol = titol;
        this.ISBN = ISBN;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public ArrayList getIsbnUsats() {
        return isbnUsats;
    }

    public void setIsbnUsats(ArrayList isbnUsats) {
        this.isbnUsats = isbnUsats;
    }
    
    public boolean comprovarIsbn(int comprueba){
        int ISBNanterior=this.ISBN;
        if(comprueba==ISBNanterior){
            return false;
        }
        return true;
    }
    public  void mostrar(Usuario us){
        
    }
}
