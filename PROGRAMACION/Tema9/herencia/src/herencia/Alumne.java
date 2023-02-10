/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author rutvac
 */
public class Alumne extends Persona {

    private String assignatura;
    private double nota;

    public Alumne(String nom, String DNI, String assignatura, double nota) {
        super(nom, DNI);
        this.assignatura = assignatura;
        this.nota = nota;
    }
    public void mostrarPersona(){
        super.mostrarPersona();
        
        System.out.println("Assignatura: "+this.assignatura);
        System.out.println("Nota: "+this.nota);

    }
}
