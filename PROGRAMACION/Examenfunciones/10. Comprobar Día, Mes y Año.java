/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_10;


import java.util.Scanner;

public class Ejercicio_10 {

    public static boolean fechacorrecta(int dia, int mes, int anyo) {
        if (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anyo >=0) {
            return true;
        }
        else {
            return false;
        }
        
        // También se puede hacer directamente así
        // return (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anyo >=0) ? true : false;
        // o directamente
        // return (dia >= 1 && dia <= 30 && mes >= 1 && mes <= 12 && anyo >=0);
    }

    public static void main(String[] args) {
        int dia, mes, anyo;
       
        Scanner entrada = new Scanner(System.in);
        System.out.print("Valor del dia: ");
        dia = entrada.nextInt();
        System.out.print("Valor del mes: ");
        mes = entrada.nextInt();
        System.out.print("Valor del año: ");
        anyo = entrada.nextInt();
        
        if (fechacorrecta(dia, mes, anyo)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha no es correcta");
        }
    }
}