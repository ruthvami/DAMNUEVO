/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioexamenrepaso;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Ejercicioexamenrepaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        String sexo;
        double peso;
        double altura;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre: ");
        nombre = sc.nextLine();
        System.out.println("Introduce una edad: ");
        edad = sc.nextInt();
        sc.nextLine();
         System.out.println("Introduce tu sexo: ");
        sexo = sc.nextLine();
        System.out.println("Introduce tu peso en kg: ");
        peso = sc.nextDouble();
        System.out.println("Introduce tu altura en m: ");
        altura = sc.nextDouble();
        
        Persona p1=new Persona(nombre,edad,sexo,peso,altura);
        Persona p2=new Persona(nombre,edad,sexo);
        Persona p3=new Persona();
        
        if(p1.calcularIMC()==1){
            System.out.println("Sobrepeso");
        }else if (p1.calcularIMC()==0){
            System.out.println("Peso ideal");
        }else{
            System.out.println("Bajo de peso");
        }
        if(p2.calcularIMC()==1){
            System.out.println("Sobrepeso");
        }else if (p2.calcularIMC()==0){
            System.out.println("Peso ideal");
        }else{
            System.out.println("Bajo de peso");
        }
        if(p3.calcularIMC()==1){
            System.out.println("Sobrepeso");
        }else if (p3.calcularIMC()==0){
            System.out.println("Peso ideal");
        }else{
            System.out.println("Bajo de peso");
        }
        if(p1.esMayorEdad()==true){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
        if(p2.esMayorEdad()==true){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
        if(p3.esMayorEdad()==true){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
        
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }

}
