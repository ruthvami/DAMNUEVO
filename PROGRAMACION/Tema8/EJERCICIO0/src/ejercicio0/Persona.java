
package ejercicio0;

/**
 *
 * @author rutvac
 */
public class Persona {
    String nom;
    int edat;
    
    void setNom(String n){
        nom=n;
    }
    void setEdat(int e){
        edat=e;
    }
    String getNom(){
        return nom;
    }
    int getEdat(){
        return edat;
    }
    void imprimeNom(){
        System.out.println(nom);
    }
    boolean esMajorEdat(){
        return (edat>=18);
    }
}
