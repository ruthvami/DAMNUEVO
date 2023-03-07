/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1punt;

/**
 *
 * @author AiA
 */
public class E1Punt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CREEM punts aleatoris amb la classe Punt");
        Punt pAle1 = Punt.creaPuntAleatori();
        Punt pAle2 = Punt.creaPuntAleatori();
        Punt pAle3 = Punt.creaPuntAleatori();
        
        pAle1.imprimeix();
        pAle2.imprimeix();
        pAle3.imprimeix();
        
        
        System.out.println("CREEM 30 punts aleatoris amb la class Punt dins un Array");
        Punt MoltsPunts[] = new Punt[30];
        for (int i = 0; i < MoltsPunts.length; i++) {
            MoltsPunts[i]=Punt.creaPuntAleatori();
            System.out.print("Punt " + i + " creat: ");
            MoltsPunts[i].imprimeix();            
        }
    }    
}