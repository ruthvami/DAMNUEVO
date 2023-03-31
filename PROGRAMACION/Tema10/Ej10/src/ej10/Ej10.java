/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej10;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // Creem inventari
        Inventari inventari = new Inventari();        
        
        // omplim l'inventari d'animals
        try{
        inventari.insertar(new Gos("Rocky",3,"dormint","08/10/2021","Boxer",true));
        inventari.insertar(new Canari("Verdeta", 7, "piulant", "22/07/2001", "curt", false, "Verd", true));      
        inventari.insertar(new Lloro("Xarraor",12,"volant","03/12/2028","curt",true,"Brasil",false));
        inventari.insertar(new Gos("Boby",4,"jugant","03/12/2018","Therrier",false));
        inventari.insertar(new Gat("", 3, "dormint", "13/02/1998", "negre", false));
        inventari.insertar(new Gat("Tomaset", 11, "maulant", "13/02/1978", "gris", true));
        inventari.insertar(new Lloro("Claudia",7,"xarrant","22/07/2001","llarg",false,"Congo",true));
        inventari.insertar(new Canari("Xiulit",7,"dormint","22/07/2001","recte",false,"Roig",false));
        }catch(Exception e){
            System.out.println(e);
        }
        try{
             
        inventari.insertar(new Gos("Felip",-1,"rascant-se","13/02/2008","PitBull",false));
        
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("");        
        inventari.mostrarLlista();
        
        // Mostrar el detall d'una mascota
        
       try{System.out.println("\n// MOSTRAR NOMÉS MASCOTA 4");
        inventari.mostrarAnimal(20);
       }catch(Excepcionnomostrar e){
           System.out.println(e);
       }
        // Mostrar el detall de tots els animals
        System.out.println("");        
        inventari.mostrarTots();
        
        
        // Eliminar una mascota    
        System.out.println("");
        inventari.mostrarLlista();
        System.out.println("\n### Eliminem 2");
        try{
        inventari.eliminar(25);
        System.out.println("");
        }catch(Exception e){
            System.out.println(e);
        }inventari.mostrarLlista();
        
       
          
    }
    
}