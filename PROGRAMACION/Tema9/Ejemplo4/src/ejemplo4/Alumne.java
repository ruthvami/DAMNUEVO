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
public class Alumne extends Persona {
    private int exp;
    private String cicle;
    private int curs;
    private ArrayList notes;

    public Alumne(String nom, String dni, String adreça, int telefon,int exp,String cicle,int curs, ArrayList notes) {
        super(nom, dni, adreça, telefon);
        this.cicle=cicle;
        this.curs=curs;
        this.exp=exp;
        this.notes=notes;
    }
    public void mostrarPersona() {
        super.mostrarPersona();
        System.out.println("Exp: " + this.getExp());
        System.out.println("Cicle: " + this.getCicle());
        System.out.println("Curs: " + this.getCurs());
        System.out.println("Notes: " + this.getNotes());
    }

    public int getExp() {
        return exp;
    }

    public String getCicle() {
        return cicle;
    }

    public int getCurs() {
        return curs;
    }

    public ArrayList getNotes() {
        return notes;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public void setNotes(ArrayList notes) {
        this.notes = notes;
    }
    
    
}
