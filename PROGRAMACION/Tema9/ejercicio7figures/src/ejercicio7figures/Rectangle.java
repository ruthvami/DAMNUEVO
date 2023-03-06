/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7figures;

/**
 *
 * @author rutvac
 */
public class Rectangle implements iFigura2D{
     private double ample;
     private double alt;

    public Rectangle(double ample, double alt) {
        this.ample = ample;
        this.alt = alt;
    }
    
     
    public double perimetre(){
        return (ample*2)+(alt*2);
    }

    public double area(){
        return ample*alt;
    }

    public void escalar(double escala) {
        if (escala >0) {
            this.ample*=escala;
            this.alt*=escala;
            
        }else{
        System.out.println("Error al introducir escala");
        }
    }

    public String imprimir(){
        return this.getClass().getSimpleName()+"\nPerimetro: "+this.perimetre()+"\n Area: "+this.area()+"\n Ample:"+this.ample+"\n Alt:"+this.alt;
    }
}
