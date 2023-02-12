/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e3rectangle;

import static java.lang.Math.max;
import static java.lang.Math.min;

/**
 *
 * @author AiA
 */
public class Rectangle {
    private int x1,x2,y1,y2;
    private static final int MIN = 0;
    private static final int MAX = 100;
    
    public Rectangle(int x1,int x2,int y1,int y2){        
        if ((x1 < x2) && (y1 < y2) && (x1 >= MIN && x1 <= MAX) && 
                (x2 >= MIN && x2 <= MAX) && (y1 >= MIN && y1 <= MAX) && 
                (y2 >= MIN && y2 <= MAX)) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            
            System.out.println("Dades correctes");
            
        }else{
            System.out.println("*** ERROR a l'instanciar el Rectangle (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
        }       
    }
    
    public int getX1(){
        return this.x1;
    }
    public int getX2(){
        return this.x2;
    }
    public int getY1(){
        return this.y1;
    }
    public int getY2(){
        return this.y2;
    }
    
    public void setX1(int x1){
        if (x1 > this.x2) {
            System.out.println("*** ERROR: x1 ha de ser menor que x2");
        } else if (x1 < MIN || x1 > MAX) {
            System.out.println("ERROR el valor x1 ha d'estar entre " + MIN + " i " + MAX);
        } else {
            this.x1 = x1;
        }
    }
    public void setX2(int x2){
        if (this.x1 > x2) {
            System.out.println("*** ERROR: x1 ha de ser menor que x2");
        } else if (x2 < MIN || x2 > MAX) {
            System.out.println("ERROR el valor x2 ha d'estar entre " + MIN + " i " + MAX);
        } else {
            this.x2 = x2;
        }
    }
    
    
    
    public void setY1(int y1){
        if (y1 > this.y2) {
            System.out.println("*** ERROR: y1 ha de ser menor que y2");
        } else if (y1 < MIN || y1 > MAX) {
            System.out.println("ERROR el valor y1 ha d'estar entre " + MIN + " i " + MAX);
        } else {
            this.y1 = y1;
        }
    }
    public void setY2(int y2){
        if (this.y1 > y2) {
            System.out.println("*** ERROR: y1 ha de ser menor que y2");
        } else if (y2 < MIN || y2 > MAX) {
            System.out.println("ERROR el valor y2 ha d'estar entre " + MIN + " i " + MAX);
        } else {
            this.y2 = y2;
        }
    }
    
    
    
    public void imprimeix() {
        System.out.println("Coordenades: (" + this.x1 + "," + this.y1 + ") / (" + this.x2 + "," + this.y2 + ")");
        System.out.println("Perímetre: " + this.getPerimetre());
        System.out.println("Àrea: " + this.getArea());
    }
    
    public void setX1Y1(int x1, int y1){
        this.setX1(x1);
        this.setY1(y1);
    }
    public void setX2Y2(int x2, int y2){
        this.setX2(x2);
        this.setY2(y2);
    }
    
    public void setAll(int x1, int y1, int x2, int y2){            
        if(x2>x1 && y2>y1){            
            this.setX2(x2);
            this.setY2(y2);
            this.setX1(x1);
            this.setY1(y1);
            
            System.out.println("Coordenades X1Y1-X2Y2 correctes");
            
        }else{
            System.out.println("*** ERROR a l'instanciar les coordinades X1Y1-X2Y2");
        } 
    }
    
    public int getPerimetre(){
        return Math.abs(this.x1-this.x2)*2 + Math.abs(this.y1-this.y2)*2;
    }
    public int getArea(){
        return Math.abs(this.x1-this.x2) * Math.abs(this.y1-this.y2);
    }
    
    public static Rectangle RectangleAleatori(){
        int x1 = (int)(Math.random()*(MAX+1));
        int y1 = (int)(Math.random()*(MAX+1));
        int x2 = (int)(Math.random()*(MAX+1));
        int y2 = (int)(Math.random()*(MAX+1));
        
        Rectangle R = new Rectangle(min(x1,x2),max(x1,x2),min(y1,y2),max(y1,y2));
        return R;
    }
    
}