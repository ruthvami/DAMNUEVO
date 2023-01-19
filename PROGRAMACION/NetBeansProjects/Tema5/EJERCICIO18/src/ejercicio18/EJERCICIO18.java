/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author rutvacmin
 */
public class EJERCICIO18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1,i=1,res=0;
       do{
//           System.out.println(i);
           num=i*i;
//           System.out.println("el numero es "+num);
           res=res+num;
           i++;
//           System.out.println("el resultado por ahora " +res);
       }while(i<=5);
        System.out.println("La suma de los cuadrados de los 5 primeros numeros naturales es " + res);
    }
    
}
