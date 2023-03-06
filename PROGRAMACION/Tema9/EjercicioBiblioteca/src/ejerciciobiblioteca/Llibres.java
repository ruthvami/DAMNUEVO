/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobiblioteca;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Llibres extends Element {

    private final int ISBN;
    private String editorial;
    private ArrayList isbnUsats = new ArrayList();

    public Llibres(String titol,Usuario usuariPrestat, int ISBN,String editorial) {
        super(titol, usuariPrestat);
        this.editorial=editorial;
        this.ISBN = ISBN;
    }

    

    public ArrayList getIsbnUsats() {
        return isbnUsats;
    }

    public void setIsbnUsats(ArrayList isbnUsats) {
        this.isbnUsats = isbnUsats;
    }

    public boolean comprovarIsbn(int comprueba) {
        int ISBNanterior = this.ISBN;
        if (comprueba == ISBNanterior) {
            return false;
        }
        return true;
    }

    public void mostrar(Usuario us) {

    }
}
