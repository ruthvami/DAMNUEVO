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
public class Biblioteca {

    private String nom;
    private String ciutat;
    private ArrayList Elements = new ArrayList();

    public Biblioteca(String nom, String ciutat, ArrayList Elements) {
        this.nom = nom;
        this.ciutat = ciutat;
        this.Elements = Elements;
    }

    public Biblioteca(String nom, String ciutat) {
        this.nom = nom;
        this.ciutat = ciutat;
    }

    public void afegir(Element... c) {

        for (Element mensaje : c) {
            Elements.add(c);
        }
    }

    public void eliminar(Element... c) {
        for (Element mensaje : c) {
            Elements.remove(c);
        }
    }
    public void eliminar(int... c) {
        for (int mensaje : c) {
            Elements.remove(c);
        }
    }

    public void cambiar(Biblioteca s,Element... c) {
        for (Element mensaje : c) {
            s.Elements.add(c);
            this.Elements.remove(c);
        }
    }
    public void mostrarTot(){
        System.out.println("Biblioteca:" +this.nom+"\nCiutat:"+this.ciutat);
        for (int i = 0; i < Elements.size(); i++) {
            System.out.println(Elements.get(i));
            
        }
    }
}
