/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7figures;

/**
 *
 * @author rutvac
 */
public class Quadrat implements iFigura2D {

    private double lados;

    public Quadrat(double lados) {
        this.lados = lados;
    }

    public double perimetre() {
        return lados * 4;
    }

    public double area() {
        return lados * lados;
    }

    public void escalar(double escala) {
        if (escala > 0) {

            this.lados *= escala;
            
        } else {
            System.out.println("Error al introducir escala");
        }
    }

    public String imprimir() {
        return this.getClass().getSimpleName() + "\nPerimetro: " + this.perimetre() + "\nArea: " + this.area() + "\nLado:" + this.lados;
    }
}
