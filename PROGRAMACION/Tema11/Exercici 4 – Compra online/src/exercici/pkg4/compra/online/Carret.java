/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici.pkg4.compra.online;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rutvac
 */
class Carret {

    private final ArrayList<Element> elMeuCarret = new ArrayList<>();
    Map<String, Integer> productes = new HashMap<>();

    public void agrega(Element ele) {
        if (productes.containsKey(ele.getNom())) {
            int quantitat = productes.get(ele.getNom());
            productes.replace(ele.getNom(), quantitat + ele.getQuantitat());
        } else {
            elMeuCarret.add(ele);
            productes.put(ele.getNom(), ele.getQuantitat());
        }
    }

    public int numElements() {
        return elMeuCarret.size();
    }

     public double importTotal() {
         double total = 0;
        for (Element elemento : elMeuCarret) {
            int cantidad = productes.get(elemento.getNom());
            total += elemento.getPreu() * cantidad;
        }
        return total;
    }

    @Override
    public String toString() {
        String resultat = "";
        for (Element element : elMeuCarret) {
            int quantitat = productes.get(element.getNom());
            double importTotal = element.getQuantitat() * element.getPreu();
            resultat += element.getNom() + " (" + quantitat + " x " + element.getPreu() + " euros) = " + importTotal + " euros\n";
        }
        return resultat;
    }
}
