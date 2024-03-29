/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e3_mascotes;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class E3_Mascotes {

   public static void main(String[] args) {
        // Creem inventari
        Inventari inventari = new Inventari();        
        
        // omplim l'inventari d'animals
        inventari.insertar(new Gos("Rocky",3,"dormint","08/10/2021","Boxer",true));
        inventari.insertar(new Canari("Verdeta", 7, "piulant", "22/07/2001", "curt", false, "Verd", true));      
        inventari.insertar(new Gos("Felip",1,"rascant-se","13/02/2008","PitBull",false));
        inventari.insertar(new Lloro("Xarraor",12,"volant","03/12/2028","curt",true,"Brasil",false));
        inventari.insertar(new Gos("Boby",4,"jugant","03/12/2018","Therrier",false));
        inventari.insertar(new Gat("Misifú", 3, "dormint", "13/02/1998", "negre", false));
        inventari.insertar(new Gat("Tomaset", 11, "maulant", "13/02/1978", "gris", true));
        inventari.insertar(new Lloro("Claudia",7,"xarrant","22/07/2001","llarg",false,"Congo",true));
        inventari.insertar(new Canari("Xiulit",7,"dormint","22/07/2001","recte",false,"Roig",false));
        
        System.out.println("");        
        inventari.mostrarLlista();
        
        // Mostrar el detall d'una mascota
        System.out.println("\n// MOSTRAR NOMÉS MASCOTA 4");
        inventari.mostrarAnimal(4);
        
        // Mostrar el detall de tots els animals
        System.out.println("");        
        inventari.mostrarTots();
        
        // Utilitzar els mètodes d'una mascota
        int index = 1;        
        ArrayList<Mascota> ArrayTenda = inventari.getMascotes();
        System.out.printf("\n### DETALLS DE '%s': ####\n",ArrayTenda.get(index).getNom());
        System.out.print("Parlar: ");
        ArrayTenda.get(index).parla();              
        System.out.println("Edat: " + ArrayTenda.get(index).getEdat());        
        System.out.println("AVUI ES EL CUMPLE !!!!");
        ArrayTenda.get(index).aniversari();
        System.out.println("Edat: " + ArrayTenda.get(index).getEdat());
        System.out.println("HA MORT ()()()()()()");
        ArrayTenda.get(index).morir();
        System.out.println("Estat: " + ArrayTenda.get(index).getEstat());
        
        // Eliminar una mascota    
        System.out.println("");
        inventari.mostrarLlista();
        System.out.println("\n### Eliminem 2");
        inventari.eliminar(2);
        System.out.println("");
        inventari.mostrarLlista();
        
        // Buidar l'inventari complet
        System.out.println("\n### Buidar l'inventari");
        inventari.buidar();        
        System.out.println("");
        inventari.mostrarLlista();
    }
    
}