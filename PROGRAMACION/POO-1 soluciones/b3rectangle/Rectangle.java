/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3rectangle;

/**
 *
 * @author AiA
 */
public class Rectangle {
    int x1,x2,y1,y2;
    
    public Rectangle(int x1,int x2,int y1,int y2){        
        if(x2>x1 && y2>y1){
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            
            System.out.println("Dades correctes");
            
        }else{
            System.out.println("***** ERROR a l'instanciar el Rectangle (" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")");
        }       
    }
}