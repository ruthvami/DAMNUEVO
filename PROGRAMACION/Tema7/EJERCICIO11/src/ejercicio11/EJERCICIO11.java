package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class EJERCICIO11 {

    /**
     * @param args the command line arguments
     */
    public static void tabla(int a){
        for (int i = 1; i <=10; i++) {
            System.out.println(a +" x "+i+" = "+a*i);
        }
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero : ");
        a = sc.nextInt();
        tabla(a);
    }
    
}
