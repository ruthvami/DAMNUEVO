/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e3_mascotes;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Inventari {

    private ArrayList<Mascota> mascotes = new ArrayList();
    

    public void insertar(Mascota animal) {
        this.mascotes.add(animal);
    }

    public void eliminar(int index) {
        if (index >= 0 && index < this.mascotes.size()) {
            this.mascotes.remove(index);
        } else {
            System.out.println("**** ERROR: No es pot eliminar. No existeix el número de mascota");
        }
    }

    public void buidar() {
        this.mascotes.clear();
    }

    public void mostrarLlista() {
        System.out.println("/// MOSTRAR Llista completa //// ");
        for (int i = 0; i < this.mascotes.size(); i++) {
            System.out.println(i + " - " + this.mascotes.get(i).getClass().getSimpleName() + 
                    " " + this.mascotes.get(i).getNom());
        }
    }

    public void mostrarAnimal(int index) {
        if(index>=0 && index < this.mascotes.size()){
            System.out.printf("\n# Mascota %d\n",index);
            this.mascotes.get(index).mostrar();
        }else{
            System.out.println("**** ERROR: No existeix el número de mascota");
        }
        
    }

    public void mostrarTots() {
        System.out.println("/// MOSTRAR TOTS ///");
        for (int i = 0; i < this.mascotes.size(); i++) {
            mostrarAnimal(i);
        }
    }

    public ArrayList<Mascota> getMascotes() {
        return mascotes;
    }

    public void setMascotes(ArrayList mascotes) {
        this.mascotes = mascotes;
    }

}
