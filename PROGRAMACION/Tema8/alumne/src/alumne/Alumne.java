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
          Aalumne p1 =new Aalumne();
          Aalumne p2=new Aalumne();
          
          p1.titol="Transformers";
          p1.cod="5586";
          p1.format="DVD";
          p1.preu_lloguer=1.25;
          
          p2.titol="Barbie";
          p2.cod="4132184";
          p2.format="bluerray";
          p2.preu_lloguer = 3;
          
          System.out.println("La pelicula "+ p1.titol+" alquilar un dia costaria "+ p1.undia()+", dos dias vale "+p1.dosdies()+" y una semana vale "+ p1.setmana());
          System.out.println("Su formato es "+p1.format+" y su codigo es "+ p1.cod);
          System.out.println("La pelicula "+ p2.titol+" alquilar un dia costaria "+ p2.undia()+", dos dias vale "+p2.dosdies()+" y una semana vale "+ p2.setmana());
          System.out.println("Su formato es "+p2.format+" y su codigo es "+ p2.cod);

    }
    
}
