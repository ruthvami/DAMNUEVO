/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interficie;

/**
 *
 * @author rutvac
 */
public class Cercle implements Figura {
      private float radio;
    public Cercle (float radio){
        this.radio=radio;
    }
    public float area(){
        return PI*(float)Math.pow(radio, 2);
    }
    public String toString(){
        return "Area: "+this.area();
    }
}