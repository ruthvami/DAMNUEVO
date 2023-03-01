/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaiempleados;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rutvac
 */
public class Empresas {
    private final String NOM;
    private final String CIF;
    private int telefono;
    private String direccion;
    private ArrayList <Empleados> empleados=new ArrayList();
    
    public Empresas(String NOM,String CIF,int telefono,String direccion){
    this.CIF=CIF;
    this.NOM=NOM;
    this.direccion=direccion;
    
    this.telefono=telefono;
    }
    public void añadirempleado(Empleados empl){
        empleados.add(empl);
    }
    public void eliminarempleados(Empleados empl){
        empleados.remove(empl);
    }
    public void mostartodo(){
       Iterator<Empleados> iter = empleados.iterator();
        while (iter.hasNext()) {
            Empleados emp = iter.next();
            emp.imprimirEmp();
            System.out.println("-------------------------------------------------------------------------------------------------------");
        }
    }
    public void muestracasitodo(){
       Iterator<Empleados> iter= empleados.iterator();
       for (int i = 0; i < empleados.size(); i++) {
           Empleados emp = iter.next();
           System.out.println("DNI:"+emp.getDNI()+" sueldo bruto "+emp.getSueldo()+" sueldo neto "+emp.sueldoneto());
        }
    }
    public void sumasueldosnetos(){// hecho con iterator
        double suma=0;
        Iterator<Empleados> iter = empleados.iterator();
        while (iter.hasNext()) {
            Empleados emp = iter.next();
            suma+=emp.sueldoneto();
        }
        System.out.println(suma);
    }
    public void sumapreciosbrutos(){//hecho con otro metodo pero lo mismo de arriba
        double suma=0;
        
        for (int i = 0; i < empleados.size(); i++){
            suma+=empleados.get(i).getSueldo();
        }
        System.out.println(suma);
    }
}
