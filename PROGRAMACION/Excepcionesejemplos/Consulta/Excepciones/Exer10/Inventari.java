/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exer10_mascotes;

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

    public void eliminar(int index) throws ExceptionNoExisteixMascota {
        if(existeix(index)){
            this.mascotes.remove(index);
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

    public void mostrarAnimal(int index) throws ExceptionNoExisteixMascota {
        if(existeix(index)){
            System.out.printf("\n# Mascota %d\n",index);
            this.mascotes.get(index).mostrar();
        }        
    }

    public void mostrarTots() throws ExceptionNoExisteixMascota {
        System.out.println("\n/// MOSTRAR TOTS ///");
        for (int i = 0; i < this.mascotes.size(); i++) {
            mostrarAnimal(i);
        }
    }
    
    private boolean existeix(int index) throws ExceptionNoExisteixMascota{
        if (index >= 0 && index < this.mascotes.size()) {
            return true;
        } else {
            throw new ExceptionNoExisteixMascota(index);
        }
    }

    public ArrayList<Mascota> getMascotes() {
        return mascotes;
    }

    public void setMascotes(ArrayList mascotes) {
        this.mascotes = mascotes;
    }

}
