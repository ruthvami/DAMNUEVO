/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        ArrayList<Gat> gatos = new ArrayList<>();
        String nom;
        int edat;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            try {

                System.out.println("Introduce el nombre: ");
                nom = sc.nextLine();
//                nom = "Aaa";
                System.out.println("Introduce la edad: ");
                edat = sc.nextInt();
//                   edat=3;
                gatos.add(new Gat(nom, edat));
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Error al introducir un numero");
                i--;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error indice incorrecto");
                i--;
            } catch (ExceptionNom | ExceptionEdat e) {
                System.out.println(e);
                sc.nextLine();
            }
        }
        imprimir(gatos);
        try {
            System.out.println("Introduce un gato que quieras borra:");
            int num = sc.nextInt();

            gatos.remove(num);
            imprimir(gatos);
        } catch (InputMismatchException e) {
            System.out.println("Error al introducir un numero");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error indice incorrecto");
        }
    }

    public static void imprimir(ArrayList<Gat> gatos) {
        for (int i = 0; i < gatos.size(); i++) {
            System.out.print(i + "-");
            gatos.get(i).imprimir();

        }
    }
}
