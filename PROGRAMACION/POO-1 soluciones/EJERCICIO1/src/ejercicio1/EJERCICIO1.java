/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author rutvac
 */
public class EJERCICIO1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu m1 = new Menu("Moduls 1dam", "1-FOL \n 2-Programacion \n 3-BBD");
        Menu m2 = new Menu("Moduls 2dam", "1-ACCES A DADES  \n 2-PROGRAMACIO MULTIMEDIA \n 3-FCT");
        m1.triarOpcio();
        m2.triarOpcio();
        System.out.println(m2.combinar(m1));
    }

}
