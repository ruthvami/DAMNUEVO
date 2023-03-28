/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author rutvac
 */
public class ExceptionEdat extends Exception{
    private int edat;

    public ExceptionEdat(int edat) {
        this.edat = edat;
    }
    public String toString() {
        return "*** Excepcion capturada: "+this.getClass().getSimpleName()+" La edad no puede ser menor que 0 --> "+this.edat;
    }
}
