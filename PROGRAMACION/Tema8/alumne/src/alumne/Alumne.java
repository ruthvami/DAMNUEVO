/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumne;

/**
 *
 * @author rutvac
 */
public class Alumne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Aalumne Roger1rC=new Aalumne();
//        Roger1rC.setNom("Roger");
//        Roger1rC.setEdat(19);
//        System.out.println(Roger1rC.toString());
//          
//          Aalumne p1 =new Aalumne();
//          Aalumne p2=new Aalumne();
//          
//          p1.titol="Transformers";
//          p1.cod="5586";
//          p1.format="DVD";
//          p1.preu_lloguer=1.25;
//          
//          p2.titol="Barbie";
//          p2.cod="4132184";
//          p2.format="bluerray";
//          p2.preu_lloguer = 3;
//           Aalumne p3 =new Aalumne("555","u","u",5);
//          Aalumne p4=new Aalumne("3445df","e","h",4);
//          
//          p4.modific("unos", "pan", "y", 2.9);

        Aalumne ob[] = new Aalumne[10];
        
        for (int i = 0; i < 10; i++) {
            ob[i] = new Aalumne(i,"Terminator","DVD",Math.random()*9);
            
        }
        for (Aalumne v : ob) {
//            
            System.out.println("La pelicula " + v.getTitol() + " alquilar un dia costaria " + v.getPre_lloguer() + ", dos dias vale " + v.dosdies() + " y una semana vale " + v.setmana());
            System.out.println("Su formato es " + v.getFormat() + " y su codigo es " + v.getCod()+"\n");
        }
        
        

    }

}
