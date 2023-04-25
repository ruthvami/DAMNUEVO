package ejercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ejercicio3 {

    public static void main(String[] args) {

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
        double coste = 0, descuento = 0;
        Map<String, Integer> cuenta = new TreeMap<>();

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Producte: ");
            prod = sc.nextLine().replaceAll("\\s", "");
            if (prod.equals("fi")) {
                break;
            } else if (!m.containsKey(prod)) {
                System.out.println("***Aquest producte és incorrecte");
                continue;
            }
            System.out.println("Quantitat: ");
            quant = sc.nextInt();
            coste += quant * m.get(prod);
            cuenta.put(prod, quant);
            sc.nextLine();

        } while (!fin);
        ArrayList<Double> pre = new ArrayList<>(m.values());
        System.out.print("Introduce un codigo de descuento(INTRO si no tiene): ");
        desc = sc.nextLine();
        if (desc.equals("ECODTO")) {
            double precio = coste;
            coste *= 0.90;
            descuento = precio - coste;
        }
        System.out.println("Producte Preu Quantitat Subtotal");
        System.out.println("---------------------------------");
        for (Map.Entry<String, Integer> articulo : cuenta.entrySet()) {
            prod = articulo.getKey();
            double subtotal;
            subtotal = articulo.getValue() * m.get(prod);
            System.out.printf("%8s%6.2f%4d%8.2f\n", prod, m.get(prod), articulo.getValue(), subtotal);
        }
        System.out.println("---------------------------------");
        System.out.printf("Descompte: %.2f\n", descuento);
        System.out.println("---------------------------------");
        System.out.printf("Total: %.2f", coste);
    }
}
