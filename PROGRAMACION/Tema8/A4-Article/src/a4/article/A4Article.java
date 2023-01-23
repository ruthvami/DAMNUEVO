/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a4.article;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class A4Article {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Article p1 =new Article();
        
        String nom;
        int iva=21/100,quantsQueden;
        double preu;
        p1.nom="Pijama";
        p1.iva=21;
        p1.preu=10;
        p1.quantsQueden=10;
        System.out.println(p1.nom+" - Precio: ");
    }
    
}
