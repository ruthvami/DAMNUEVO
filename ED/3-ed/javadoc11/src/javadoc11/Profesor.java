/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javadoc11;

/**
 *
 * @author rutvac
 */
public class Profesor {

    private String nombre;
    private int idioma;
    private int nativo;

    private static final String[] idiomas = {"Frances", "Ingles", "aleman"};
    private static final String[] natividad = {"Sí", "No"};

    /**
     *
     * @param n es el nombre que se introduce para cambiarlo
     */
    public void SetNombre(String n) {
        this.nombre = n;
    }

    /**
     *
     * @param i numero del idioma que se quiere selecionar
     */
    public void SetIdioma(int i) {
        this.idioma = i;
    }

    /**
     *
     * @param n para cambiar si es nativo o no
     */
    public void SetNativo(int n) {
        this.nativo = n;
    }

    /**
     *
     * @return devuelve el nombre del profesor
     */
    public String GetNombre() {
        return nombre;
    }

    /**
     *
     * @return devuelve el idioma que imparte
     */
    public int GetIdioma() {
        return idioma;
    }

    /**
     *
     * @return devuelve si es nativo o no
     */
    public int GetNativo() {
        return nativo;
    }

    /**
     *
     * @param nombre el nombre del profesor
     * @param idioma idioma que imparte
     * @param nativo si es nativo el profesor o no
     */
    public Profesor(String nombre, int idioma, int nativo) {
        this.nombre = nombre;
        this.idioma = idioma;
        this.nativo = nativo;

    }

    /**
     *
     * @return devuelve un String en el que muestra el nombre del profesor, idioma que imparte y si es nativo
     */
    public String toString() {
        return "Nombre del profesor:" + nombre + "\n" + "Idioma que imparte el profesor: "
                + idiomas[idioma] + "\n" + "Nativo:" + natividad[nativo];
    }

}
