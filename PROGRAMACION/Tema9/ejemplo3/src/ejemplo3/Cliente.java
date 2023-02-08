/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;

/**
 *
 * @author rutvac
 */
public class Cliente {

    private String dni;
    private String nombre;
    private String apellidos;

    public Cliente(String dni,String nombre,String apellidos) {
        this.dni=dni;
        this.apellidos=apellidos;
        this.nombre=nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
}
