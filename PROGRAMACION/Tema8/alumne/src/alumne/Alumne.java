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
          
          Aalumne p3 =new Aalumne("555","u","u",5);
          Aalumne p4=new Aalumne("3445df","e","h",4);
          
          p4.modific("unos", "pan", "y", 2.9);
          
          System.out.println("La pelicula "+ p3.getTitol()+" alquilar un dia costaria "+ p3.getPre_lloguer()+", dos dias vale "+p3.dosdies()+" y una semana vale "+ p3.setmana());
          System.out.println("Su formato es "+p3.getFormat()+" y su codigo es "+ p3.getCod());
          System.out.println("La pelicula "+ p4.getTitol()+" alquilar un dia costaria "+ p4.getPre_lloguer()+", dos dias vale "+p4.dosdies()+" y una semana vale "+ p4.setmana());
          System.out.println("Su formato es "+p4.getFormat()+" y su codigo es "+ p4.getCod());

            
    }
    
}
