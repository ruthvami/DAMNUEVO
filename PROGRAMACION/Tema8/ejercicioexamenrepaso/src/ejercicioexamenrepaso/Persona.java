/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioexamenrepaso;

/**
 *
 * @author rutvac
 */
public class Persona {

    private String nombre;
    private int edad ;
    private String DNI;
    private String sexo ;
    private double peso ;
    private double altura;
    private static final int BAJO = -1;
    private static final int IDEAL = 0;
    private static final int ALTO = 1;

    public Persona() {
        this.altura = 0;
        this.edad = 0;
        this.nombre = " ";
        this.peso = 0;
        this.sexo = "H";
    }

    public Persona(String nombre, int edad, String sexo) {
        this.altura = 0;
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = "H";
        
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.altura = altura;
        this.edad = edad;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }

    public int calcularIMC() {
        if ((this.peso / Math.pow(this.altura, 2)) < 20) {
            return BAJO;
        } else if ((peso / Math.pow(this.altura, 2)) >= 20 && (this.peso / Math.pow(this.altura, 2)) <= 25) {
            return IDEAL;
        } else {
            return ALTO;
        }
    }

    public boolean esMayorEdad() {
        if (edad >= 18) {
            return true;
        }
        return false;
    }

    private String comprobarsexo() {
        if (this.sexo == "M") {
            return "M";
        }
        return "H";
    }

    public String toString() {
        return "Nombre: " + this.nombre + " Edad: " + this.edad  + " Sexo: " + this.sexo+ " DNI: " + generaDNI() + " Peso: " + this.peso + " Altura: " + this.altura;
    }
//
    private String generaDNI() {
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int x = 10000000 + (int) (Math.random() * (99999999 - 10000000 + 1));
        int res = x %23;
        String dnipersona = Integer.toString(x)+letras[res];
        return dnipersona;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

 
}