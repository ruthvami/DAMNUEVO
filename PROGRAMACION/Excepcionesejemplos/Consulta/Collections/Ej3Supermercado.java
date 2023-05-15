/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3.supermercado;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author ingdea
 */
public class Ej3Supermercado {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, Double> preus = new HashMap<>();
        preus.put("avena", 2.21);
        preus.put("garbanzos", 2.39);
        preus.put("tomate", 1.59);
        preus.put("gengibre", 3.13);
        preus.put("quinoa", 4.50);
        preus.put("habas", 1.60);

        Map<String, Integer> quantitates = new HashMap<>();

        boolean fin = false;
        double total = 0.0;

        mostrarProductos(preus);

        System.out.println("*** Introduzca 'fin' para terminar:");

        while (!fin) {
            System.out.print("Producto: ");
            String producto = sc.nextLine().toLowerCase();

            if (preus.containsKey(producto)) {
                System.out.print("quantitat: ");
                int quantitat = sc.nextInt();
                sc.nextLine();

                if (quantitates.containsKey(producto)) {
                    int quantitatActual = quantitates.get(producto);
                    quantitates.replace(producto, quantitatActual + quantitat);
                } else {
                    quantitates.put(producto, quantitat);
                }

                total += preus.get(producto) * quantitat;

            } else if (producto.equals("fin")) {
                fin = true;
            } else {
                System.out.println("*** Producto incorrecto! ");
            }
        }

        System.out.print("Código de descuento (INTRO SI NO TIENES NINGUNO): ");
        String descuento = sc.nextLine();
        System.out.println("");

        System.out.println("Resumen de la compra:");
        System.out.printf("%-15s|%16s|%16s|%16s|\n", "Producto", "preu", "quantitat", "Total");
        System.out.println("-------------------------------------------------------------------");

        for (String producto : quantitates.keySet()) {
            int quantitat = quantitates.get(producto);
            double preu = preus.get(producto);
            double subtotal = quantitat * preu;
            System.out.printf("%-15s|%16.2f|%16d|%16.2f|\n", producto.toUpperCase(), preu, quantitat, subtotal);
        }
        System.out.println("");
        if (descuento.equals("ECODTO")) {
            double descuentoTotal = total * 0.1;
            total -= descuentoTotal;
            System.out.printf("%-15s %15.2f€\n", "Descuento:", descuentoTotal);
        }
        System.out.printf("%-15s %15.2f€\n", "Total:", total);
    }

    public static void mostrarProductos(Map<String, Double> p) {
        System.out.printf("%-15s |%16s\n", "Producto", "preu");
        System.out.println("---------------------------------");
        p.entrySet().forEach(prod -> System.out.printf("%-15s |%,15.2f\n", prod.getKey(), prod.getValue()));
        System.out.println("");
    }
}
