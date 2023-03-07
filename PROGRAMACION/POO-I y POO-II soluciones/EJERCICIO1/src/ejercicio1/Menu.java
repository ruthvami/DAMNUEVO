/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author rutvac
 */
public class Menu {

    private String titulo;
    private String opciones;

    public Menu(String titulo, String opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }

    private int mostrarMenu() {
        int opcion = 0, opcion2 = 0;

        this.setOpciones(this.getOpciones() + "\n 4-Salir");
        System.out.println(this.getTitulo() + "\n-------------\n " + this.getOpciones());
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Elige una opcion del menu: ");
            opcion = sc.nextInt();
            if (opcion <= 4) {
                opcion2 = 1;
            }
        } while (opcion2 != 1);
        return opcion;
    }

    public void triarOpcio() {
        mostrarMenu();

    }

    public String combinar(Menu m1) {
        this.setTitulo("Moduls DAM");
        this.setOpciones(this.getOpciones() + "\n " + m1.getOpciones());
        return (this.getTitulo() + "\n-------------\n " + this.getOpciones());
    }

    public String getTitulo() {
        return titulo;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }
}
