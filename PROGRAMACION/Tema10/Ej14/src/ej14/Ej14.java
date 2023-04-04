/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej14;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        Gato g1=new Gato("G1","femella");
        Gato g2=new Gato("G2","mascle");
        Gato g3=new Gato("G3","mascle");
        Gato g4=new Gato("G4","femella");
        
        ArrayList <Gato>gatos = new ArrayList<>();
        gatos.add(g1);
        gatos.add(g2);
        gatos.add(g3);
        gatos.add(g4);
        
        for (int i = 0; i <10; i++) {
           try{
             gatos.get(0 + (int) (Math.random() * (3 - 0 + 1))).aparearse(gatos.get(0 + (int) (Math.random() * (3 - 0 + 1))));
           
           }
           catch(ExceptionApariamentImpossible e){
               System.out.println(e.getMessage());
               
           }
           catch(Exception e){
               System.out.println(e.getMessage());
           }
        }
    }

   
}
