/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej10;

/**
 *
 * @author rutvac
 */
class Excepcioneliminar extends Exception {

    private int index;

    public Excepcioneliminar(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Excepcioneliminar: La mascota no se puede eliminar";
    }

}
class Excepcionnomostrar extends Exception {

    private int index;

    public Excepcionnomostrar(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Excepcionnomostrar: La mascota no existe";
    }

}

class Excepcionnombre extends Exception{

    private String nom;

    public Excepcionnombre(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Excepcionnombre: no tiene nombre ";
    }

}

class Excepcionedadm extends Exception{

    private int edad;

    public Excepcionedadm(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Excepcionedadm: no se puede tener edad negativa ";
    }

}
