package ej13;

import java.util.ArrayList;
import java.util.InputMismatchException;

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
        
        ArrayList <Exception>valor = new ArrayList<>();
        valor.add(new InputMismatchException());
        valor.add(new ArrayIndexOutOfBoundsException());
        valor.add(new NumberFormatException());
        valor.add(new ArithmeticException());
        valor.add(new NullPointerException());
        try {
            throw valor.get((int)(Math.random() * valor.size()));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
