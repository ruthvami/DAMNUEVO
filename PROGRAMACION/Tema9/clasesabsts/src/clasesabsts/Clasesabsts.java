/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesabsts;

/**
 *
 * @author rutvac
 */
public class Clasesabsts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
abstract class Principal{
    public void imprimirNom(String nom){
        System.out.println("El nom es " +nom);
    }
    public abstract void imprimirClasse();
}

class Secundaria extends Principal{
    public void imprimirClasse(){
        System.out.println("Classe Secundaria");
    }

}