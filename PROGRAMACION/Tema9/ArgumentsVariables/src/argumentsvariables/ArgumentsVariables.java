/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package argumentsvariables;

/**
 *
 * @author rutvac
 */
public class ArgumentsVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        fun("funcio2",55.5,555,5,9,14);
        fun("hola",2.3,4,5);
        fun("que",33.3);
        
    }
    public static void fun(String str,double doub,int... a){
            System.out.println("String:"+str);
            System.out.println("Double:"+doub);
            System.out.println("Nombre d'arguments:"+a.length);
            
            for(int i:a){
                System.out.println(i+" ");
            }
    }
    
}
