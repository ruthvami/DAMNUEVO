/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresaiempleados;

/**
 *
 * @author rutvac
 */
public class Empleados {

    private final String NOM;
    private final String DNI;
    private double sueldo;
    private int edad;
    private int telefono;
    private String direccion;

    public Empleados(String NOM, String DNI, double sueldo, int edad, int telefono, String direccion) {
        this.DNI = DNI;
        this.NOM = NOM;
        this.direccion = direccion;
        this.edad = edad;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }

    public Empleados(String NOM, String DNI, double sueldo) {
        this.DNI = DNI;
        this.NOM = NOM;
        this.sueldo = sueldo;
    }

    public void imprimirEmp() {
        if (this.direccion == null) {
            System.out.println(this.NOM+"con DNI "+this.DNI+"cobrara de sueldo bruto"+this.sueldo);
        } else {
            System.out.println(this.NOM+"con DNI "+this.DNI+"cobrara de sueldo bruto"+this.sueldo+"vive en "+this.direccion+"y su edad es de"+this.edad+"\nTelefono:"+this.telefono);
        }
    }
    public double sueldoneto(){
        int irpf = 0;
        if((this.sueldo*12)<12000){
           irpf= 20;
        }else if((this.sueldo*12)>=12000&&this.sueldo<=25000){
             irpf=30;
             
        }else if((this.sueldo*12)>25000){
             irpf=40;
        }
        System.out.println(irpf);
        return (this.sueldo-(this.sueldo*(irpf/100)));
    }
    
}
