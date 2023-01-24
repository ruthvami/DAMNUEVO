/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c2.persona;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class C2Persona {

    /**
     * @param args the command line arguments
     */
    public static void edad(int a) {
        if (a >= 18) {
            System.out.println(" es mayor de edad");

        } else {
            System.out.println(" no es mayor de edad");
        }
    }

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

        sc.nextLine();

        System.out.println("Persona 2- Introduce tu DNI:");
        dni = sc.nextLine();
        System.out.println("Persona 2- Introduce tu nombre:");
        nom = sc.nextLine();
        System.out.println("Persona 2- Introduce tus apellidos:");
        cognom = sc.nextLine();
        System.out.println("Persona 2- Introduce tu edad:");
        edad = sc.nextInt();

        Persona p2 = new Persona(dni, nom, cognom, edad);
        
        p2.setNom("ROberto");
        
        System.out.print(p1.getNom() + " " + p1.getCognom() + " con DNI " + p1.getDni());
        edad(p1.getEdat());
        System.out.print(p2.getNom()+ " " + p2.getCognom() + " con DNI " + p2.getDni());
        edad(p2.getEdat());
        
        
    }

}
