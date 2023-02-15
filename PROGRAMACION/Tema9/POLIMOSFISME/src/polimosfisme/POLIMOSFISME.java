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
        Mare mare1=new Mare();
        Filla1 fi1=new Filla1();
        Filla2 fi2=new Filla2();
         System.out.println("Variable mare1: ");
        mare1.crida();
        
        Mare mare2;
        mare2=mare1;
        System.out.println("Variable mare2: ");
        mare2.crida();
        
        mare2=fi1;
        System.out.println("Variable mare2: ");
        mare2.crida();
        
        mare2=fi2;
        System.out.println("Variable mare2: ");
        mare2.crida();
    }
}
 class Mare {
        public void crida(){
            System.out.println("Estic a la Mare");
        }
    }

     class Filla1 extends Mare {
        public void crida(){
            System.out.println("Estic a la Filla1");
        }
    }

     class Filla2 extends Mare {
        public void crida(){
            System.out.println("Estic a la Filla2");
        }
    }
