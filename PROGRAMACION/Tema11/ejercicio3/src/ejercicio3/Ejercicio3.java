/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author rutvac
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Map<String, Double> m = new HashMap<>();
        m.put("avena", 2.21);
        m.put("cigrons", 2.39);
        m.put("tomaca", 1.59);
        m.put("gingebre", 3.13);
        m.put("quinoa", 4.50);
        m.put("faves", 1.60);
        boolean fin = false;
        String prod, desc;
        int quant;
        double coste = 0;
        Map< String,Integer> cuenta = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Producte: ");
            prod = sc.nextLine();
            if (prod.equals("fi")) {
                break;
            } else if (!m.containsKey(prod)) {
                System.out.println("***Aquest producte és incorrecte");
            }
            if (m.containsKey(prod)) {
                System.out.println("Quantitat: ");
                quant = sc.nextInt();
                coste+=quant*m.get(prod);
                cuenta.put(prod, quant);
                sc.nextLine();
            }

        } while (!fin);
        ArrayList<Double> pre = new ArrayList<>(m.values());
        System.out.print("Introduce un codigo de descuento(INTRO si no tiene): ");
        desc = sc.nextLine();
        if (desc == "ECODTO") {
            coste *= 0.10;
        }
        System.out.println("Producte Preu Quantitat Subtotal");
        System.out.println("---------------------------------");
        for (Map.Entry articulo : cuenta.entrySet()) {
            prod=(String) articulo.getKey();
            double subtotal;
            subtotal = coste/(m.get(prod));
            System.out.println(prod + "\t" +m.get(prod) +"\t" + articulo.getValue() +"\t"+subtotal );
            
        }
    }

}