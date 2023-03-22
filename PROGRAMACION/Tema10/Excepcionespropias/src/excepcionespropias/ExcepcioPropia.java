/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionespropias;

/**
 *
 * @author rutvac
 */
class ExcepcioPropia extends Exception{
      private int x;

    public ExcepcioPropia(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "*** Excepcion capturada: ExcepcioPropia [el valor "+ this.x+" tiene que ser mayor que 10]";
    }
    
    
      
}
