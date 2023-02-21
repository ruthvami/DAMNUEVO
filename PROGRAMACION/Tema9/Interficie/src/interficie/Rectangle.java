/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interficie;

/**
 *
 * @author rutvac
 */
public class Rectangle implements Figura {
    private float base;
    private float altura;
    public Rectangle (float base,float altura){
        this.base=base;
        this.altura=altura;
    }
    public float area(){
        return base*altura;
    }
    public String toString(){
        return "Area: "+this.area();
    }
}
