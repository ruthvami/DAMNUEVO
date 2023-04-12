/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
public class UF10ExcepcionsRuth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        try {
            Jugadors p1 = new Jugadors(2,"roi", -300, 100, 10);
        } catch (LimitDePantalla e) {
            System.out.println(e.toString());

        }
    }

}
