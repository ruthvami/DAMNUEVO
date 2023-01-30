/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package d1.punt;

/**
 *
 * @author rutvac
 */
public class Punt {

    private int x, y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprimeix() {
        System.out.println(x + y);

    }

    public void setxy(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void desplaza(int dx, int dy) {
        this.x = dx + x;
        this.y = dy + y;
    }

    public double distancia(Punt p) {
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2));
    }
}
