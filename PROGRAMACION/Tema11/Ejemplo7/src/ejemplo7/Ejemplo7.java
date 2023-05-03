/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 *
 * @author rutvac
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
//        File f = new File("Enters.txt");
//        try {
//            Scanner sc = new Scanner(f);
//            for (int i = 0; i < 10; i++) {
//                System.out.println("Valor num " + (i + 1) + " del archiu " + f.getName() + " : " + sc.nextInt());
//            }
//            sc.close();
//        }catch(FileNotFoundException e){
//            System.out.println("Error no se ha encontrado el archivo->"+f.getName());
//        } catch (InputMismatchException e) {
//            System.out.println("Error al escribir");
//        }catch(NoSuchElementException e){
//            System.out.println("Error no hay nada más para leer");
//        }catch(Exception e){
//            System.out.println("Algo ha ocurrido que no tenias previsto");
//        }
        
        File f = new File("/home/rutvac/Escriptori/DAMNUEVO/PROGRAMACION/Tema11/Ejemplo8/Enters.txt");
        try {
            Scanner sc = new Scanner(f);
            for (int i = 0; i < 10; i++) {
                System.out.println("Valor num " + (i + 1) + " del archiu " + f.getName() + " : " + sc.nextInt());
            }
            sc.close();
        }catch(FileNotFoundException e){
            System.out.println("Error no se ha encontrado el archivo->"+f.getName());
        } catch (InputMismatchException e) {
            System.out.println("Error al escribir");
        }catch(NoSuchElementException e){
            System.out.println("Error no hay nada más para leer");
        }catch(Exception e){
            System.out.println("Algo ha ocurrido que no tenias previsto");
        }
    }

}
