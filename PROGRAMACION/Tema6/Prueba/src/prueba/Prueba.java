/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author rutvac
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        String s1="Papallona";
//        System.out.println(s1.replace('a', 'e'));
//        System.out.println(s1);
        String cadena2="j1234";
        
        System.out.println("ejemplo8:"+cadena2.matches("[abc]+.*"));
        System.out.println("ejemplo9: "+ cadena2.matches("[abc]+\\d{1,10}"));
        System.out.println("ejemplo8:"+cadena2.matches("[a-z]^.*"));

    }
    
}
