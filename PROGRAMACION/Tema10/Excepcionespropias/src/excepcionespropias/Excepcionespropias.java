/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionespropias;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Excepcionespropias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x;
        try {
            System.out.println("Introduce el valor para duplicar");
            x = sc.nextInt();
            System.out.println("Duplicado: " + duplicar(x));
        } catch (ExcepcioPropia e) {
            System.out.println(e);
        }
    }

    public static int duplicar(int x) throws ExcepcioPropia {
        if (x > 10) {
            throw new ExcepcioPropia( x);
        }
        return x * 2;
    }
}
