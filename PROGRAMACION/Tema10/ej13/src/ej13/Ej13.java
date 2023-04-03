package ej13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.lang.AbstractMethodError;

/**
 *
 * @author rutvac
 */
public class Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int MIN = 1, MAX = 5;
        ArrayList valor = new ArrayList();
        valor.add(new InputMismatchException());
        valor.add(new ArrayIndexOutOfBoundsException());
        valor.add(new NumberFormatException());
        valor.add(new AbstractMethodError());
        valor.add(new ArithmeticException());
        int x = MIN + (int) (Math.random() * (MAX - MIN + 1));
        System.out.println(valor.get(x));

    }

}
