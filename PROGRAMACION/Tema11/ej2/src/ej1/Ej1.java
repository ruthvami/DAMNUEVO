/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author rutvac
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Set <String> s=new TreeSet <String>();
//        s.add("Dell");
//        s.add("HP");
//        s.add("Apple");
//        s.add("Acer");
//        s.add("Asus");
//        s.add("Samsung");
//        s.add("Asus");
//        
//        System.out.println("Set elements are: ");
//        for (String temp: s) {
//            System.out.println(temp);
//        }
//        s.add("Lenovo");
//        
//        System.out.println("Set elements are: ");
//        for (String temp: s) {
//            System.out.println(temp);
//        }
//        
         Set <String> s=new HashSet <String>();
        s.add("Dell");
        s.add("HP");
        s.add("Apple");
        s.add("Acer");
        s.add("Asus");
        s.add("Samsung");
        s.add("Asus");
        
        System.out.println("Set elements are: ");
        for (String temp: s) {
            System.out.println(temp);
        }
        s.add("Lenovo");
        
        System.out.println("Set elements are: ");
        for (String temp: s) {
            System.out.println(temp);
        }
    }
    
}
