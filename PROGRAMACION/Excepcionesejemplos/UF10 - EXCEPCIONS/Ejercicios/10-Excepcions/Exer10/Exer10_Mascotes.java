/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer10_mascotes;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Exer10_Mascotes {
    
    public static void main(String[] args) {
        // Creem inventari
        Inventari inventari = new Inventari();

        // Crear mascotes pot crear Excepció "ExceptionNomBuit" i "ExceptionEdatNegativa"
        try {
            // omplim l'inventari d'animals (últim sense nom)
            inventari.insertar(new Gos("Rocky", 3, "dormint", "08/10/2021", "Boxer", true));
            inventari.insertar(new Canari("Verdeta", 7, "piulant", "22/07/2001", "curt", false, "Verd", true));
            inventari.insertar(new Lloro("Xarraor", 12, "volant", "03/12/2028", "curt", true, "Brasil", false));
            inventari.insertar(new Gat("Tomaset", 11, "maulant", "13/02/1978", "gris", true));
            inventari.insertar(new Canari("", 7, "dormint", "22/07/2001", "recte", false, "Roig", false));
        } catch (ExceptionNomBuit | ExceptionEdatNegativa e) {
            System.out.println(e);
        }
        
        try {
            // afegir animal amb edat negativa
            inventari.insertar(new Lloro("Claudia",-7, "xarrant", "22/07/2001", "llarg", false, "Congo", true));
        } catch (ExceptionNomBuit | ExceptionEdatNegativa e) {
            System.out.println(e);
        }
                
        System.out.println("");
        inventari.mostrarLlista();

        // Mostrar mascotes pot crear Excepció "ExceptionNoExisteixMascota" 
        try {
            // Mostrar el detall d'una mascota
            System.out.println("\n// MOSTRAR NOMÉS UNA MASCOTA");
            inventari.mostrarAnimal(2);
            // Mostrar el detall de tots els animals
            inventari.mostrarTots();

        } catch (ExceptionNoExisteixMascota e) {
            System.out.println(e);
        }

        // Eliminar mascotes pot crear Excepció "ExceptionNoExisteixMascota" 
        try {
            System.out.println("");
            inventari.mostrarLlista();
            System.out.println("\n### Eliminem una mascota per índex");
            inventari.eliminar(52);
            System.out.println("");
            inventari.mostrarLlista();
        } catch (ExceptionNoExisteixMascota e) {
            System.out.println(e);
        }
    }

}
