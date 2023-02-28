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
    private ArrayList <Empleados> empleados;
    
    public Empresas(String NOM,String CIF,int telefono,String direccion,ArrayList empleados){
    this.CIF=CIF;
    this.NOM=NOM;
    this.direccion=direccion;
    this.empleados=empleados;
    this.telefono=telefono;
    }
    public void añadirempleado(Empleados empl){
        empleados.add(empl);
    }
    public void eliminarempleados(Empleados empl){
        empleados.remove(empl);
    }
    public void mostartodo(){
       Iterator inter= empleados.iterator();
       for (int i = 0; i < empleados.size(); i++) {
            System.out.print(i+"- "+empleados.get(i));
        }
    }
}
