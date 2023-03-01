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

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    private final String NOM;
    private final String DNI;
    private double sueldo;
    private int edad;
    private String telefono;
    private String direccion;

    public Empleados(String NOM, String DNI, double sueldo, int edad, String telefono, String direccion) {
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
            System.out.println(this.NOM+" con DNI "+this.getDNI()+" cobrara de sueldo bruto "+this.getSueldo());
        } else {
            System.out.println(this.NOM+" con DNI "+this.getDNI()+" cobrara de sueldo bruto "+this.getSueldo()+" vive en "+this.direccion+" y su edad es de "+this.edad+" años\nTelefono:"+this.telefono);
        }
    }
    public double sueldoneto(){
        double irpf = 0;
        double sueldos=(this.sueldo*12);
        if(sueldos<12000){
           irpf= 0.20;
        }else if(sueldos>=12000&&sueldos<=25000){
             irpf=0.30;
             
        }else if(sueldos>25000){
             irpf=0.4;
        }
        return (this.getSueldo()-(this.getSueldo()*irpf));
    }

    public String getDNI() {
        return DNI;
    }
    
}
