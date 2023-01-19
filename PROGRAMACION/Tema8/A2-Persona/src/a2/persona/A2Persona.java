/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2.persona;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class A2Persona {

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
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        Scanner sc = new Scanner(System.in);
        System.out.println("Persona 1- Introduce tu DNI:");
        p1.dni = sc.nextLine();
        System.out.println("Persona 1- Introduce tu nombre:");
        p1.nom = sc.nextLine();
        System.out.println("Persona 1- Introduce tus apellidos:");
        p1.cognom = sc.nextLine();
        System.out.println("Persona 1- Introduce tu edad:");
        p1.edat = sc.nextInt();

        sc.nextLine();
        System.out.println("Persona 2- Introduce tu DNI:");
        p2.dni = sc.nextLine();
        System.out.println("Persona 2- Introduce tu nombre:");
        p2.nom = sc.nextLine();
        System.out.println("Persona 2- Introduce tus apellidos:");
        p2.cognom = sc.nextLine();
        System.out.println("Persona 2- Introduce tu edad:");
        p2.edat = sc.nextInt();

        System.out.print(p1.nom + " " + p1.cognom + " con DNI " + p1.dni);
        edad(p1.edat);
        System.out.print(p2.nom + " " + p2.cognom + " con DNI " + p2.dni);
        edad(p2.edat);
    }

}
