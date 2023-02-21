/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interficie;

/**
 *
 * @author rutvac
 */
public class Quadrat  implements Figura{
    private float lado;
    public Quadrat (float lado){
        this.lado=lado;
    }
    public float area(){
        return (float)Math.pow(lado, 2);
    }
    public String toString(){
        return "Area: "+this.area();
    }
}
