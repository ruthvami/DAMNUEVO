/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuatro;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author ruthv
 */
public class Cuatro {

    /**
     * @param args the command line arguments 
     * Completa el siguiente código para
     * crear un TreeMap llamado "agenda" que almacene nombres y números de
     * teléfono. El programa debe permitir al usuario ingresar nombres y números
     * de teléfono hasta que ingrese la palabra "salir". Maneja las siguientes
     * situaciones:
     *
     * Si el usuario ingresa un nombre que ya existe en la agenda, lanza una
     * excepción del tipo IllegalArgumentException y muestra un mensaje de
     * error. Si se produce un error al leer la entrada del usuario, lanza una
     * excepción del tipo InputMismatchException y muestra un mensaje de error.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, String> agenda = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("Introduce un nombre:");
                String nom = sc.nextLine().toLowerCase();
                if ("salir".equals(nom)) {
                    break;
                }
                System.out.println("Introduce numero de telefono:");
                String tel = sc.nextLine().toLowerCase();
                if ("salir".equals(tel)) {
                    break;
                }
                if (agenda.containsKey(nom)) {
                    throw new IllegalArgumentException("Error ya existe ese nombre");
                }
                agenda.put(nom, tel);
            }

        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
 
}
