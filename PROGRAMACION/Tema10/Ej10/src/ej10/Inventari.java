/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Inventari {

    private ArrayList<Mascotas> mascotes = new ArrayList();

    public void insertar(Mascotas animal) {
        this.mascotes.add(animal);
    }

    public void eliminar(int index) throws Excepcioneliminar {
        if (index >= 0 && index < this.mascotes.size()) {
            this.mascotes.remove(index);
        } else {
            throw new Excepcioneliminar(index);

        }
    }

    public void buidar() {
        this.mascotes.clear();
    }

    public void mostrarLlista() {
        System.out.println("/// MOSTRAR Llista completa //// ");
        for (int i = 0; i < this.mascotes.size(); i++) {
            System.out.println(i + " - " + this.mascotes.get(i).getClass().getSimpleName()
                    + " " + this.mascotes.get(i).getNom());
        }
    }

    public void mostrarAnimal(int index) throws Excepcionnomostrar {
        if (index >= 0 && index < this.mascotes.size()) {
            System.out.printf("\n# Mascota %d\n", index);
            this.mascotes.get(index).mostrar();
        } else {
            throw new Excepcionnomostrar(index);
        }

    }

    public void mostrarTots() throws Excepcionnomostrar {
        System.out.println("/// MOSTRAR TOTS ///");
        for (int i = 0; i < this.mascotes.size(); i++) {
            mostrarAnimal(i);
        }
    }

    public ArrayList<Mascotas> getMascotes() {
        return mascotes;
    }

    public void setMascotes(ArrayList mascotes) {
        this.mascotes = mascotes;
    }

}
