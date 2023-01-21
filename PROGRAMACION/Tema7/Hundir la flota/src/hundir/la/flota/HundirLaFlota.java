/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundir.la.flota;

import java.util.Scanner;

/**
 *
 * @author ruthv
 */
public class HundirLaFlota {

    public static void crear_tauler(int[][] matriu, int vaixell) {
        char c; 
        
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        {
            for (c = 'A'; c <= 'J'; ++c) {
                System.out.print(c);
                for (int i = 0; i < matriu.length; i++) {
                    System.out.print(" ");
                    System.out.print("-");
                }
                System.out.println(" ");
            }
        }
    }

    public static void inserir_vaixell(int[][] matriu) {

    }

    public static void dispara_tret(int[][] matriu) {

    }

    public static void mostrar_tauler(int[][] matriu) {
        char c;
        System.out.print(" ");
        for (int i = 0; i < matriu.length; i++) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println(" ");
        {
            for (c = 'A'; c <= 'J'; ++c) {
                System.out.print(c);
                for (int i = 0; i < matriu.length; i++) {
                    System.out.print(" ");
                    System.out.print("-");
                }
                System.out.println(" ");
            }
        }
    }
    public static int menu(int a) {
        int vaixell = 0,intents=0;
        switch(a){
            case 1:
                vaixell=10;
                intents=50;
                break;
            case 2: 
                vaixell=5;
                intents=30;
                break;
            case 3:
                vaixell=2;
                intents=10;
                break;
        }
        return intents,vaixell;
    }
    public static void random() {
        int num=Math.random();
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int nivel;
        int tauler[][] = new int[10][10];
        int ocult[][] = new int[10][10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Niveles: ");
        System.out.println("1-Para facil\n2-Para medio\n3-Para dificil");
        System.out.println("Elige un nivel: ");
        nivel=sc.nextInt();
        
        
        crear_tauler(tauler,menu(nivel));
        mostrar_tauler(ocult);
    }

}
