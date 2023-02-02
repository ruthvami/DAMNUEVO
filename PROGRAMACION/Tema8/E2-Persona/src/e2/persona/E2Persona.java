/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2.persona;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class E2Persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String dni, nom, cognom;
        int edad;

        Scanner sc = new Scanner(System.in);
        System.out.println("Persona 1- Introduce tu DNI:");
        dni = sc.nextLine();
        System.out.println("Persona 1- Introduce tu nombre:");
        nom = sc.nextLine();
        System.out.println("Persona 1- Introduce tus apellidos:");
        cognom = sc.nextLine();
        System.out.println("Persona 1- Introduce tu edad:");
        edad = sc.nextInt();

        Persona p1 = new Persona(dni, nom, cognom, edad);

//        sc.nextLine();

//        System.out.println("Persona 2- Introduce tu DNI:");
//        dni = sc.nextLine();
//        System.out.println("Persona 2- Introduce tu nombre:");
//        nom = sc.nextLine();
//        System.out.println("Persona 2- Introduce tus apellidos:");
//        cognom = sc.nextLine();
//        System.out.println("Persona 2- Introduce tu edad:");
//        edad = sc.nextInt();

//        Persona p2 = new Persona("23421415A","r", "fsf",29);

//      
        p1.imprimeix();
        validarDNI(dni());
        
        if (p1.majoredat() ) {
            System.out.print("Es mayor de edad");
        } else {
            System.out.print("No es mayor de edad");
        }
        if (p1.jubilat() ) {
            System.out.println(" y esta jubilado");
        } else {
            System.out.println(" y no esta jubilado");
        }
    }

}
