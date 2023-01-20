/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quadrat;

/**
 *
 * @author rutvac
 */
public class Rectangle {

    double x, y, x2, y2;

    public double diagonal() {
        return Math.sqrt(Math.pow(x2-x, 2) + Math.pow(y2-y, 2));
    }

    public double perimetre() {
        return 4 * (diagonal() / Math.sqrt(2));
         
    }

    public double area(double a, double b) {
        return (0.5 * Math.pow(diagonal(), 2));
    }
}
