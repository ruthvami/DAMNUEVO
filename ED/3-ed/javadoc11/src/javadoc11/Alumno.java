/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadoc11;

/**
 *
 * @author rutvac
 */
public class Alumno {
    private String nivel;
    private String nombre;

    /**
     *
     * @param n cambia el nivel del alumno
     */
    public void setNivel(String n){
        this.nivel=n;
    }

    /**
     *
     * @param nom cambia el nombre del alumno
     */
    public void setNombre(String nom){
        this.nombre=nom;
    }

    /**
     *
     * @return pone el nivel del alumno
     */
    public String getNivel(){
        return nivel;
    }

    /**
     *
     * @return pone el nombre del alumno
     */
    public String getNombre(){
        return nombre;
    }

    /**
     *
     * @param n nivel del alumno introducido
     * @param nom nombre del alumno introducido
     */
    public Alumno(String n, String nom){
        this.nivel=n;
        this.nombre=nom;
    }
    
    /**
     *
     * @return devuelve un String en el que muestra el nombre del alumno y nivel
     */
    public String toString(){
        return "Nombre del alumno: "+nombre+"\n"+"Nivel del alumno: "+nivel+
                "\n";
    }
   
}
