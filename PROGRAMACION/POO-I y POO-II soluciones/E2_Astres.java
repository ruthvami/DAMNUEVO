/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e2_astres;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class E2_Astres {

    public static void main(String[] args) {
        // NOTA: Els atributs de planetes i satèl.lits són inventats
        
        // Planetes sense satel.lits
        Planeta saturn = new Planeta("Saturn", 544.4, 44, 87971.45, 125, 9.8, 684684, 565);
        Planeta terra = new Planeta("Terra", 54.4, 24, 87971.45, 19, 9.8, 684684, 365);
        Planeta mart = new Planeta("Mart", 164.4, 66, 6971.45, 55, 11.8, 334684, 255);

        // Satel.lits (amb el planeta al que pertanyen)
        Satelit atlas = new Satelit("Atlas", 57, 16, 4675.4, -45, 18.4, 87, 16, saturn);
        Satelit lluna = new Satelit("Lluna", 7, 20, 475.4, -4, 182.4, 487, 1, terra);
        Satelit fobos = new Satelit("Fobos", 1.072E16, 11000.0, 2344.0, 0.319, -40.15, 4.7E6, 6000, mart);
        Satelit deimos = new Satelit("Deimos", 2.244E15, 12400.0, 443212.0, 1.262, -40.15, 5.5E8, 23460, mart);

        // Afegim satèl.lits als planetes
        terra.afegirSatelit(lluna);
        mart.afegirSatelit(fobos);
        mart.afegirSatelit(deimos);
        saturn.afegirSatelit(atlas);

        // Creem ArrayList d'astres per a guardar-ho tot
        ArrayList<Astre> astres = new ArrayList<>();
        astres.add(saturn);
        astres.add(terra);
        astres.add(mart);
        astres.add(atlas);
        astres.add(lluna);
        astres.add(fobos);
        astres.add(deimos);

        // Afegim el satel.lit Titan sense planeta asociat
        astres.add(new Satelit("Titan", 5.172E16, 54700.0, 244.4, -154.1, 35.15, 1.9E6, 5987));

        // Creem ArrayList de satèl.lits per a Júpiter
        ArrayList<Satelit> SatsJupiter = new ArrayList<>();
        SatsJupiter.add(new Satelit("Europa", 2.2E7, 4897, 544.8, -88.4, 3.3, 3E5, 7784));
        SatsJupiter.add(new Satelit("Ganimedes", 4.77E3, 43153.1, 4331, -335.5, 66.15, 5.2E5, 6654));

        // Afegim el planeta Júpiter utilitzant el constructor amb ArrayList de satèl.lits
        astres.add(new Planeta("Jupiter", 53, 14, 871.45, 22, 19.8, 35475, 887, SatsJupiter));

        // Creem un altre objecte de Júpiter però aquesta vegada sense passar-li els satél.lits
        Planeta Jupiter2 = new Planeta("Jupiter2", 53, 14, 871.45, 22, 19.8, 35475, 887);
        // Li afegim els satèl.lits mitjançant el mètode corresponent
        Jupiter2.setSatelits(SatsJupiter);
        astres.add(Jupiter2);

        menu(astres);

    }

    public static void menu(ArrayList<Astre> astres) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\n#### Aquests són els astres guardats: ####");
            for (int i = 0; i < astres.size(); i++) {
                System.out.println((i + 1) + " - " + astres.get(i).getNom());
            }
          
            System.out.print("Quin tries per veure el detall? (0 per a eixir): ");
            int numPlanet = sc.nextInt() - 1; // -1 perquè l'index per pantalla comença en 1
            System.out.println("");

            if (numPlanet > -1 && numPlanet < astres.size()) {
                astres.get(numPlanet).mostrar();
            }else if(numPlanet == -1){
                System.out.println("ADEU !!!!");
                break;
            }else{
                System.out.println("**** Opció incorrecta ");
            }
        } while (true);
    }
}
