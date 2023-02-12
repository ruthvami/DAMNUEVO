/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dniexception;

/**
 *
 * @author ruthv
 */
public class DNIexception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        DNI p1 = new DNI("Juan Ferrández Rubio", "12345678901234567890", 1.75, 300);

        System.out.println("Datos de la cuenta 1");
        System.out.println("Nombre del titular: " + p1.getCliente());
        System.out.println("Número de cuenta: " + p1.getNcuenta());
        System.out.println("Tipo de interés: " + p1.getTipoi());
        System.out.println("Saldo: " + p1.getSaldo());
        System.out.println();
        p1.ingreso(2000);
         System.out.println("Saldo: " + p1.getSaldo());
       p1.reintegro(2300);
               System.out.println("Saldo: " + p1.getSaldo());
        
    }

}
