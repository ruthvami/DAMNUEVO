/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coloma;

/**
 *
 * @author rutvac
 */
public class Coloma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first=10;
        int second=20;
        comparaValores(first,second);
        System.out.println("Se ha acabado la funcion");
    }

    public static void comparaValores(int a, int b)
    {
        if(a>b)
        {
            System.out.println("El primero es mayor");
        }
        else
        {
            System.out.println("El segundo es mayor");
        }

        for (int i = 0; i <=5; i++) 
        {
            System.out.println(i);
        }
    }
}