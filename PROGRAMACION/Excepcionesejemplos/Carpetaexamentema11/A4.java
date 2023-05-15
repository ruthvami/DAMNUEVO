/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a4;

import java.io.File;

public class A4 {

    public static void main(String[] args) {

        // Instanciem la classe File amb les rutes de les carpetes a crear      
        File lesMeuesCoses = new File("Documents/LesMeuesCoses");
        File alfabet = new File("Documents/Alfabet");    

        // Creem les carpetas        
        boolean resultat1 = lesMeuesCoses.mkdir();
        System.out.println("S'ha creat la carpeta 'Documents/LesMeuesCoses'? " + resultat1);
        boolean resultat2 = alfabet.mkdir();
        System.out.println("S'ha creat la carpeta 'Documents/Alfabet'? " + resultat2);

        // Instanciem la classe File amb les rutes d'origen i destinació
        File fotOrigen = new File("Documents/Fotografies");
        File fotDesti = new File("Documents/LesMeuesCoses/Fotografies");      
        File libOrigen = new File("Documents/Llibres");
        File libDesti = new File("Documents/LesMeuesCoses/Llibres");        

        // Movem les carpetes 'Fotografies' i 'Llibres' dins de 'LesMeuesCoses'
        resultat1 = fotOrigen.renameTo(fotDesti);
        System.out.println("¿S'ha mogut la carpeta 'Documents/Fotografies' a 'Documents/LesMeuesCoses/Fotografies'? " + resultat1);
        resultat2 = libOrigen.renameTo(libDesti);
        System.out.println("¿S'ha mogut la carpeta 'Documents/Llibres' a 'Documents/LesMeuesCoses/Llibres'? " + resultat2);

        // Creem dins de la carpeta 'Alfabet', una carpeta per cada lletra de l'alfabet (en majúscules)
        for (int i = 65; i <= 90; i++) {
            File novaCarpeta = new File(alfabet.getAbsoluteFile() + "/" + (char) i);
            novaCarpeta.mkdir();
        }
    }
}