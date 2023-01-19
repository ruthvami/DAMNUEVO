/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosc;

/**
 *
 * @author rutvac
 */
public class DOSC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 1, val = 1;
        int notes[][] = new int[10][10];
        for (int i = 0; i < notes.length; i++) {
            System.out.println("La tabla del " + num + " es = ");
            for (int j = 0; j < notes.length; j++) {
                notes[i][j] = num * val;
                System.out.println( num+ " x " + val + " = " + notes[i][j] + " ");
                val++;
            }
            System.out.println(" ");
            val = 1;
            num++;
        }
    }

}
