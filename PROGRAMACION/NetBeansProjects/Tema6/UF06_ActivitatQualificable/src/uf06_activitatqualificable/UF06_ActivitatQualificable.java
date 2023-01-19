/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf06_activitatqualificable;

import java.util.Arrays;

/**
 *
 * @author rutvac
 */
public class UF06_ActivitatQualificable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int pos = 0,medida=0;
        
        for (int i = 0; i <=10; i++) {  //bucle para que poner la medida del array
             medida+=i;
            
        }
        
        int array[] = new int[medida];   
        
        for (int num = 1; num <= 10; num++) { //bucle para poder reproducir numeros del 1 al 10
                                                    
            for (int i = 0; i < num; i++) {   //bucle para repetir el mismo numero hasta que i sea igual que el mismo numero
                array[pos] = num;
                pos++;
                
            }
        }
        System.out.println(Arrays.toString(array));   //convierte el array en String
    }

    }

