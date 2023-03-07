/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e1punt;

/**
 *
 * @author AiA
 */
public class Punt {
    private int x;
    private int y;
    
    public Punt(int x,int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    
    public void imprimeix(){
        System.out.println("(" + getX() + "," + getY() + ")");
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void desplaça(int dx, int dy){
        this.x = this.x + dx;
        this.y = this.y + dy;
    }
    
    public int distancia(Punt p){
        return (int)Math.sqrt((Math.pow(p.getX()-this.x, 2))+(Math.pow(p.getY()-this.y, 2)));
    }
    
    public static Punt creaPuntAleatori(){
        final int INICIAL = -100;
        final int FINAL = 100;
        int x = INICIAL + (int) (Math.random() * (FINAL - INICIAL + 1));
        int y = INICIAL + (int) (Math.random() * (FINAL - INICIAL + 1));
        return new Punt(x,y);    
        
    }
}