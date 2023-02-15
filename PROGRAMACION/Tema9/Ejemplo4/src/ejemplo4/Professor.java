/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo4;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Professor extends Persona {

    private int code;
    private String dept;
    private ArrayList moduls;
    private String horari;

    public Professor(String nom, String dni, String adreça, int telefon, String dept, int code, ArrayList moduls, String horari) {
        super(nom, dni, adreça, telefon);
        this.code = code;
        this.dept = dept;
        this.horari = horari;
        this.moduls = moduls;
    }
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("code: " + this.code);
        System.out.println("Dept: " + this.dept);
        System.out.println("Horari: " + this.horari);
        System.out.println("Moduls: " + this.moduls);
    }

    public int getCode() {
        return code;
    }

    public String getDept() {
        return dept;
    }

    public ArrayList getModuls() {
        return moduls;
    }

    public String getHorari() {
        return horari;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setModuls(ArrayList moduls) {
        this.moduls = moduls;
    }

    public void setHorari(String horari) {
        this.horari = horari;
    }

}
