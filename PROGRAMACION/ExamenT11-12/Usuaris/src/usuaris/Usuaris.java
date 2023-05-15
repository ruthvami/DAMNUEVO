/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usuaris;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Usuaris {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File u = new File("usuaris.txt");
        try {

            Scanner usuaris = new Scanner(u);
            ArrayList<String> usu = new ArrayList<>();
            ArrayList<Integer> con = new ArrayList<>();
            boolean seguir = true,encontrado=false;
            if (u.exists()) {

                while (usuaris.hasNextLine()) {

                    String users = usuaris.nextLine();
                    if (!users.contains(":")) {
                        System.out.println("**Formato incorrecto");
                        seguir = false;
                        break;
                    }
                    if (users.contains(":")) {

                        String nuev = users.replace(":", " ");
                        String[] separa = nuev.split(" ");
                        usu.add(separa[0]);
                        con.add(Integer.valueOf(separa[1]));
                    }

                }
            }
            FileWriter wr = new FileWriter("usuaris.txt", false);
            Scanner sc = new Scanner(System.in);
            if (seguir) {
                System.out.println("Usuario:");
                String usuario = sc.nextLine();
                System.out.println("Contraseña:");
                int contrasenya = sc.nextInt();
                for (int i = 0; i < usu.size(); i++) {
                    if (usu.get(i).equals(usuario) && String.valueOf(con.get(i)).equals(String.valueOf(contrasenya))) {
                        System.out.println("Introduce nueva contraseña:");
                        int nueva = sc.nextInt();
                        wr.write(usuario + ":" + nueva + "\n");
                        encontrado=true;
                        System.out.println("Contraseña cambiada");
                    } else {

                        wr.write(usu.get(i) + ":" + String.valueOf(con.get(i)) + "\n");
                    }

                }

                wr.close();
                if(encontrado==false)System.out.println("###Usuari o contrasenya no coincideixen amb els valors guardats");
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        } catch (IOException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println("No has introducido el valor correcto");
        }

    }
}
