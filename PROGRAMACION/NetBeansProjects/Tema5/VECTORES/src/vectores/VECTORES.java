/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores;

/**
 *
 * @author rutvac
 */
public class VECTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int notas[] = new int[]{7, 3, 9, 6, 5};
        int num = 0;
        for (int i = 0; i < notas.length; i++) {
            num = num + notas[i];
        }
        System.out.println(num / notas.length);
    }
}
