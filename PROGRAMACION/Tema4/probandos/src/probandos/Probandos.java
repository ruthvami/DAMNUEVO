/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probandos;

/**
 *
 * @author rutvac
 */
public class Probandos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int notes[][] = {{7, 5, 7}, {3, 2, 4}, {1, 8, 9}};

        for (int i = 0; i < notes.length; i++) {
            System.out.print("Notes de l'alumne " + i + ": ");
            for (int j = 0; j < notes[i].length; j++) {
                System.out.print(notes[i][j] + " ");

            }
            System.out.println(" ");
        }
    }

}
