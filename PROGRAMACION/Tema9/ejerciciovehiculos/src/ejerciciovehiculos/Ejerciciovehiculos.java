/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciovehiculos;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Ejerciciovehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Terrestres t1 = new Terrestres("1234ABC", "Sedan", 4);
        Aquaticos aqua1 = new Aquaticos("ABC123", "Barco velero", 10.5);
        Aerios ae1 = new Aerios("XYZ456", "Avión comercial", 150);
        
        Motos moto1 = new Motos("XYZ789", "Motocicleta deportiva", 2, "Rojo");
        Submarinos sub1 = new Submarinos("DEF456", "Submarino nuclear", 100.0, 5000.0);
        Aviones av1 = new Aviones("DEF456", "Boeing 747", 400, 14);
        Cotxe cot1 = new Cotxe("1267ABC", "Seat Ibiza", 4, true);
        Helicoptero hel1 = new Helicoptero("X3489", "HeliX", 4, 2);
        Vaixells vai1 = new Vaixells("DEF456", "Barco de motor", 12.5, false);

        ArrayList<Vehiculos> vehicu=new ArrayList();
        vehicu.add(t1);
        vehicu.add(aqua1);
        vehicu.add(ae1);
        vehicu.add(moto1);
        vehicu.add(sub1);
        vehicu.add(av1);
        vehicu.add(cot1);
        vehicu.add(hel1);
        vehicu.add(vai1);
        
        for (int i = 0; i < vehicu.size(); i++) {
            vehicu.get(i).mostrar();
            System.out.println("---------------------------------------------------------------");
        }
    }
    
}
