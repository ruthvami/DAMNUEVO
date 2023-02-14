/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioantesexamen;

/**
 *
 * @author ruthv
 */
public class Password {

    int longitud;
    String contraseña;

    public Password() {
        this.longitud = 8;
        this.contraseña = "0";
    }

    public Password(int longitud) {
        this.longitud = longitud;

    }

    public boolean esFuerte() {
        for (int i = 0; i < this.longitud; i++) {
            this.contraseña.charAt(i);
            if (this.contraseña.charAt(i)=="") {
                
            }
        }
    
    }
}
