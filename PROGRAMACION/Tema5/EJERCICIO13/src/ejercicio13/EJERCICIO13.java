/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean seguir=true;
        int max=100,min=1,analitzat=0,num=0;
        char res;
        
        System.out.println("Piensa un numero del 1 al 100 ");
        
        while(seguir){
            num=(max+min)/2;
            Scanner sc= new Scanner(System.in);
            System.out.println("Tu número es <,> o = que " + num +"?");
            res=sc.nextLine().charAt(0);
            switch (res){
                case '<' :
                    max=num;
                    analitzat=num;
                    break;
                case '=':
                    seguir =false;
                    break;
                case '>':
                    min=num;
                    analitzat =num;
                    break;
                    
            }
        }
        System.out.println("Tu numero es " + num);
        
    }
    
}
