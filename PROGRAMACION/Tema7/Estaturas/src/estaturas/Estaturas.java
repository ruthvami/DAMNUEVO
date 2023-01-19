/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estaturas;

/**
 *
 * @author ruthv
 */
public class Estaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,max=140,min=210,med=0;
        String pais[]= {"España", "Rusia", "Japón", "Australia"};
        int matri[][]=new int[4][10];
        
        System.out.println("___________________________________________________|MED|MÍN|MAX|");
        for(int i = 0; i <matri.length; i++) {
            System.out.printf("%10s",pais[i]+":");                       
            for (int j = 0; j < matri[i].length; j++) {                    
                num=(int)(Math.random()*70)+140;                          //Es un numero random entre 140 y 210
                matri[i][j]=num;
                System.out.printf("%4d",matri[i][j]);                      //  Se imprime 4 dijitos para crear espacios
                if(num>=max){                      //Si el numero es mayor o igual que el maximo, maximo se convierte en el propio numero
                    max=num;
                }
                if(num<=min){                      //Si el numero es menor o igual que el maximo, minimo se convierte en el propio numero
                    min=num;
                }
                med+=matri[i][j];                   //sirve para sumar los numeros para lograr la media
            }
            System.out.print(" "+"|");
            System.out.print(med/10+"|"+min+"|"+max+"|");
            System.out.print("\n");
            max=140;
            min=210;                    //Inicializamos otra vez las variables max,min con los numeros 140 y 210
            med=0;
        }
    }
    
}
