/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etitatsgeneriques;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Etitatsgeneriques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here+
        int sou =1000;
        Empleat emp1=new Empleat (sou);
        emp1.print();
        double sou2 =2500.55;
        Empleat emp2=new Empleat (sou2);
        emp2.print();
        String sou3 ="sense sou";
        Empleat emp3=new Empleat (sou3);
        emp3.print();
        
        ArrayList<String> al =new ArrayList<>();
        al.add("salaaa");
        al.add("entonces");
        al.add("ahh");
        
        String s1=al.get(0);
        String s2=al.get(1);
        String s3=al.get(2);
    }
    
}
