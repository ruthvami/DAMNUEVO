/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import static java.util.Map.entry;
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
//         Set <String> s=new HashSet <String>();
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
//ejercicio2
//        Map<Integer,String>m=new HashMap<>();
//        m.put(924,"Amalia Nuñez");
//        m.put(921,"Cindy Nero");
//        m.put(700, "Cesar Vazquez");
//        m.put(219, "Victor Tilla");
//        m.put(537, "Alan Brito");
//        m.put(605, "Esteban Quito");
//        System.out.println("Els elements de m son: \n"+m);
//        
//        
//        System.out.println(m.get(921));
//        System.out.println(m.get(605));
//        System.out.println(m.get(888));
//        System.out.println("\nTotes les entrades del dic:");
//        System.out.println(m.entrySet());

        Map<Integer, String> m = new HashMap<>();
        m.put(924, "Amalia Nuñez");
        m.put(921, "Cindy Nero");
        m.put(700, "Cesar Vazquez");
        m.put(219, "Victor Tilla");
        m.put(537, "Alan Brito");
        m.put(605, "Esteban Quito");
        System.out.println("Els elements de m son: \n" + m);

        System.out.println(m.get(921));
        System.out.println(m.get(605));
        System.out.println(m.get(888));
        System.out.println("\nTotes les entrades del dic:");
        System.out.println(m.entrySet());

        //ejercicio 3
        System.out.println("\nEntrades del diccionari extretes una a una:");
        for (Map.Entry entry : m.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("\nEntrades del diccionari extretes una a una:(Lambda)");
        m.entrySet().forEach(entry->System.out.println(entry));
    }

}
