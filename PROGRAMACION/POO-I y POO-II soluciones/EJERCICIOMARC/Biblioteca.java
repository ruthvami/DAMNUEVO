package biblioteques;

import java.util.ArrayList;
import java.util.Arrays;

public class Biblioteca {
    
    private String nom, ciutat;
    private ArrayList<Element> elements = new ArrayList<>();

    public Biblioteca(String nom, String ciutat, ArrayList<Element> elements) {
        this.nom = nom;
        this.ciutat = ciutat;
        this.elements=elements;
    }
    
    public Biblioteca(String nom, String ciutat) {
        this.nom = nom;
        this.ciutat = ciutat;
    }

    public String getNom() {
        return nom;
    }

    public String getCiutat() {
        return ciutat;
    }
    
    public void afegirElements(Element ...e) {
        for (int i = 0; i < e.length; i++) {
            this.elements.add(e[i]);
        }
    }
    
    public void eliminarElements(Element ...e) {
        for (int i = 0; i < e.length; i++) {
            this.elements.remove(e[i]);
        }
    }

    public void eliminarElements(int ...e) {
        Arrays.sort(e); //Si no s'ordena, a l'eliminar un element menor canvia la posició de tots els elements majors
        for (int i = 0; i < e.length; i++) {
            this.elements.remove(e[e.length-i-1]);
        }
    }
    
    public void canviarElements(Biblioteca b, Element ...e) {
        this.eliminarElements(e);
        b.afegirElements(e);
    }
    
    public void mostrarTots() {
        System.out.println(this.getNom());
        for (int i = 0; i < elements.size(); i++) {
            elements.get(i).mostrar();
            System.out.println("");
        }
    }
    
    public void mostrarDisponibles() {
        System.out.println(this.getNom()+"\t(SOLS DISPONIBLES)");
        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i).getUsuariPrestat()==null) {
                elements.get(i).mostrar();
                System.out.println("");
            }
        }
    }
    
}
    //Marc Martínez Sanchis