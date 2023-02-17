/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimosfisme;

/**
 *
 * @author rutvac
 */
public class POLIMOSFISME {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mare mare1 = new Mare();
        Filla1 fi1 = new Filla1();
        Filla2 fi2 = new Filla2();
        System.out.println("Variable mare1: ");
        mare1.crida();

        Mare mare2;
        mare2 = mare1;
        System.out.println("Variable mare2: ");
        mare2.crida();

        mare2 = fi1;
        System.out.println("Variable mare2: ");
        mare2.crida();

        mare2 = fi2;
        System.out.println("Variable mare2: ");
        mare2.crida();
        
        fi2.crida(23);
        fi2.crida(23, "obrera");
        fi2.crida(23, 5000);
    }
}

class Mare {

    public void crida() {
        System.out.println("Estic a la Mare");
    }
}

class Filla1 extends Mare {

    public void crida() {
        System.out.println("Estic a la Filla1");
        
    }
}

class Filla2 extends Mare {

    public void crida() {
        System.out.println("Estic a la Filla2");
    }
    public void crida(int edat) {
        System.out.println("Estic a la Filla2 i tinc "+edat);
    }
    public void crida(int edat,String feina) {
        System.out.println("Estic a la Filla2 i tinc "+edat+" i treballe de "+feina);
    }
    public void crida(int edat, double feina) {
        System.out.println("Estic a la Filla2 i tinc "+edat+" i el meu dou es de "+feina);
    }
}
