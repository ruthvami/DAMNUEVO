/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package c3.rectangle;

/**
 *
 * @author rutvac
 */
public class Rectangle {

    private int x1, x2, y1, y2;

    /**
     * @return the x1
     */
    public int getX1() {
        return x1;
    }

    /**
     * @return the x2
     */
    public int getX2() {
        return x2;
    }

    /**
     * @return the y1
     */
    public int getY1() {
        return y1;
    }

    
    public int getY2() {
        return y2;
    }

    public Rectangle(int x1, int y1, int x2, int y2) {
        if ((x2 > x1) && (y2 > y1)) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
           
        } else {
            System.out.println("---->ERROR en " + y1 + " i " + x1);
        }
    }

    

    public void setX1(int x1) {
        if ((x1 < this.getX2())) {
            this.x1 = x1;

        } else {
            System.out.println("---->ERROR en  " + x1 + " ha de ser menor que " + this.getX2());
        }
    }

    public void setX2(int x2) {
        if ((x2 > this.getX1())) {
            this.x2 = x2;

        } else {
            System.out.println("---->ERROR en  " + x2 + " ha de ser mayor que " + this.getX1());
        }
    }

    public void setY1(int y1) {
        if ((y1 < this.getY2())) {
            this.y1 = y1;

        } else {
            System.out.println("---->ERROR en  " + y1 + " ha de ser menor que " + this.getY2());
        }
    }

    public void setY2(int y2) {
        if ((y2 > this.getY1())) {
            this.y2 = y2;

        } else {
            System.out.println("---->ERROR en  " + y2 + " ha de ser mayor que " + this.getY1());
        }
    }
}
