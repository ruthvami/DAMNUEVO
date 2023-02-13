/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package d3rectangle;

/**
 *
 * @author AiA
 */
public class Rectangle {
    private int x1,x2,y1,y2;
    
    public Rectangle(int x1,int x2,int y1,int y2){        
        if(x2>x1 && y2>y1){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
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
        if(this.x2>x1){
            this.x1 = x1;            
            System.out.println("Dades correctes");            
        }else{
            System.out.println("*** ERROR: x1 ha de ser menor que x2");
        }
    }
    public void setX2(int x2){
        if(this.x1<x2){
            this.x2 = x2;            
            System.out.println("Dades correctes");            
        }else{
            System.out.println("*** ERROR: x2 ha de ser major que x1");
        }
    }
    
    
    
    public void setY1(int y1){
        if(this.y2>y1){
            this.y1 = y1;            
            System.out.println("Dades correctes");            
        }else{
            System.out.println("*** ERROR: y1 ha de ser menor que y2");
        }
    }
    public void setY2(int y2){
        if(this.y1<y2){
            this.y2 = y2;            
            System.out.println("Dades correctes");            
        }else{
            System.out.println("*** ERROR: y2 ha de ser major que y1");
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
    
}