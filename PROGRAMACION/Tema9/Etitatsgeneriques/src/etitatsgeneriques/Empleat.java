/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etitatsgeneriques;

/**
 *
 * @author rutvac
 */
public class Empleat<T> {
    T sou;
    
    public Empleat(T sou){
        this.sou=sou;
    }
    public void print(){
        System.out.println("El sou de l'empleat és: "+this.sou);
    }
}
