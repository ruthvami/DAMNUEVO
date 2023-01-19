/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuatroc;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class CUATROC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0,media=0,max=0,min=10;
        
        int matriz[][]=new int[4][5];
        Scanner sc=new Scanner(System.in);
              
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Introduce las notas del estudiante "+(i+1)+":");
            
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("asignatura "+(j+1)+":");
                num=sc.nextInt(); 
                 matriz[i][j]=num ;
                 media=media+num;
                 if(num>max){
                     max=num;
                 }
                 if(num<min){
                     min=num;
                 }
                 
            }
                
                 media=media/matriz[0].length;
                 System.out.println("La media del alumno "+(i+1)+" es "+media+"\nLa nota maxima introducida es "+max+
                         "\nLa nota minima introducida es "+min);
                 media=0;
                 max=0;
                 min=10;
        }
        
    }
    
}
