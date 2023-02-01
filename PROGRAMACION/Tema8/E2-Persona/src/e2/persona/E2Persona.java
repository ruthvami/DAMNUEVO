/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2.persona;

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

//        String dni, nom, cognom;
//        int edad;

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Persona 1- Introduce tu DNI:");
//        dni = sc.nextLine();
//        System.out.println("Persona 1- Introduce tu nombre:");
//        nom = sc.nextLine();
//        System.out.println("Persona 1- Introduce tus apellidos:");
//        cognom = sc.nextLine();
//        System.out.println("Persona 1- Introduce tu edad:");
//        edad = sc.nextInt();
//
//        Persona p1 = new Persona(dni, nom, cognom, edad);

//        sc.nextLine();

//        System.out.println("Persona 2- Introduce tu DNI:");
//        dni = sc.nextLine();
//        System.out.println("Persona 2- Introduce tu nombre:");
//        nom = sc.nextLine();
//        System.out.println("Persona 2- Introduce tus apellidos:");
//        cognom = sc.nextLine();
//        System.out.println("Persona 2- Introduce tu edad:");
//        edad = sc.nextInt();

        Persona p2 = new Persona("234214","r", "fsf",2);

//      
        p2.imprimeix();
        
        
        if (p2.edad() ) {
            System.out.println(" es mayor de edad");
        } else {
            System.out.println(" no es mayor de edad");
        }
        if (p2.jubilat() ) {
            System.out.println(" esta jubilado");
        } else {
            System.out.println(" no esta jubilado");
        }
    }

}
