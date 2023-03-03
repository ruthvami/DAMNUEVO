/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7figures;

/**
 *
 * @author rutvac
 */
public class Triangle implements iFigura2D{
     private double ample;
     private double alt;

    public Triangle(double ample, double alt) {
        this.ample = ample;
        this.alt = alt;
    }
    
     
     
    public double perimetre(){
        return (alt*2)+ample;
    }

    public double area(){
        return (ample*alt)/2;
    }

    public void escalar(double escala) {
        if (escala >0) {
            this.ample*=escala;
            this.alt*=escala;
        }
        System.out.println("Error al introducir escala");
        
    }

    public String imprimir(){
        return this.getClass().getSimpleName()+"\nPerimetro: "+this.perimetre()+"\n Area: "+this.area()+"\n Ample:"+this.ample+"\n Alt:"+this.alt;
    }
}
