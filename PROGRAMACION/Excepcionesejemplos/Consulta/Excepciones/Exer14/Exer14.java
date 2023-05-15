/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer14;

import java.util.ArrayList;

/**
 *
 * @author Luis José Sánchez González
 * @modificació Angel Olmos
 */
public class Exer14 {

    public static void main(String[] args) {
        Gat garfield = new Gat("Garfield","mascle");
        Gat kitty = new Gat("Kitty","femella");
        Gat duquesa = new Gat("Duquesa","femella");
        Gat doraemon = new Gat("Doraemon","mascle");
        
        ArrayList<Gat> Gats = new ArrayList();
        Gats.add(garfield);
        Gats.add(kitty);
        Gats.add(duquesa);
        Gats.add(doraemon);

        int numGats = Gats.size();

        for (int i = 0; i < 10; i++) {
            try {          
                Gat G1 = Gats.get((int)(Math.random() * numGats));
                Gat G2 = Gats.get((int)(Math.random() * numGats));
                Gat cria = G1.apareiarAmb(G2);
                System.out.print("L'apariament de " + G1.getNom() + " amb " + G2.getNom() + " ha resultat en un");
                
                if(cria.getSexe().equals("femella")){
                    System.out.println("a gateta");
                }else{
                    System.out.println(" gatet");
                }
            } catch (ExceptionApariamentImpossible e) {
                System.out.println(e);
            }
        }
    }
}
