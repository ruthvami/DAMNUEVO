/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuatro;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Cuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        int a=0,e=0,i=0,o=0,u=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        frase = sc.nextLine();
        
        char n[]=frase.toCharArray();
        for (int j = 0; j < frase.length(); j++) {
            if(n[j]=='a'){
                    a++;
            }else if(n[j]=='e'){
                    e++;
            }else if(n[j]=='i'){
                    i++;
            }else if(n[j]=='o'){
                    o++;
            }else if(n[j]=='u'){
                    u++;
            }
            
        }
        System.out.println("Has introducido : a="+a+" e="+e+" i="+i+" o="+o+" u="+u );
    }
    
}
