/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d2.persona;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class D2Persona {

    /**
     * @param args the command line arguments
     */
    public static boolean edad(int a) {
        if (a >= 18) {

            return true;
        } else {

            return false;
        }
    }

    public void imprimeix(int edat, String nom, String cognom, String dni) {
        System.out.println("Dni: " + dni + "\n Nom: " + nom + " \n Cognom: " + cognom + "\n Edat: " + edat);
    }

    public boolean jubilat(int a) {
        if (a >= 65) {

            return true;
        } else {

            return false;
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

        imprimeix(p1.edat, p1.dni, p1.nom, p1.cognom);
        imprimeix(p2.edat, p2.dni, p2.nom, p2.cognom);
        if (edad(edad) == true) {
            System.out.println(" es mayor de edad");
        } else {
            System.out.println(" no es mayor de edad");
        }
        if (jubilat(edad) == true) {
            System.out.println(" esta jubilado");
        } else {
            System.out.println(" no esta jubilado");
        }
    }

}
