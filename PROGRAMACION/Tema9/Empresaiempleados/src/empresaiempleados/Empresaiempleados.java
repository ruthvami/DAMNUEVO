/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresaiempleados;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Empresaiempleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Empleados empl1 = new Empleados("John Smith", "12345678A", 2000.0, 30, 123456789, "123 Main St");
    Empleados empl2 = new Empleados("Juan", "12345678A", 1500.0);
    Empleados empl3 = new Empleados("María", "23456789B", 1800.0);
    Empleados empl4 = new Empleados("Pedro", "34567890C", 2000.0);
    
    ArrayList<Empleados> empleado = new ArrayList<>();
    ArrayList<Empleados> empleado2 = new ArrayList<>();
    Empresas empresa1 = new Empresas("Company 1", "123456789A", 555555555, "789 Elm St", empleado);
    Empresas empresa2 = new Empresas("Company 2", "234567890B", 666666666, "987 Maple St", empleado2);
    
    empl1.imprimirEmp();
        
    empresa1.añadirempleado(empl1);
    empresa1.añadirempleado(empl2);
    
        System.out.println("");
    
    empresa2.añadirempleado(empl3);
    empresa2.añadirempleado(empl4);
    
        System.out.println("");
    
    System.out.println("Empresa 1");
    empresa1.mostartodo();

        System.out.println("");
    
    
    System.out.println("Sueldo bruto");
    empresa2.sumapreciosbrutos();
    System.out.println("Sueldo neto");
    empresa2.sumasueldosnetos();
    
        System.out.println("");
    
    empresa1.eliminarempleados(empl3);
    
        System.out.println("");
    
    empresa2.muestracasitodo();
    }
    
}
