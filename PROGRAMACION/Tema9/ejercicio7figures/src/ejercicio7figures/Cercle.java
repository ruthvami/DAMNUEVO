/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7figures;

/**
 *
 * @author rutvac
 */
public class Cercle implements iFigura2D{

    private double radi;

    public Cercle(double radi) {
        this.radi = radi;
    }

    
    public double perimetre() {
        return 2 *Math.PI*radi;
    }

    public double area() {
        return Math.PI * Math.pow(radi, 2);
    }

    public void escalar(double escala) {
        if (escala >0) {
            this.radi*=escala;
        }else{
        System.out.println("Error al introducir escala");
        }
    }

    public String imprimir() {
        return this.getClass().getSimpleName() + "\nPerimetro: " + this.perimetre() + "\n Area: " + this.area() + "\n Radi:" + this.radi;
    }
}
