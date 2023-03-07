/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e5_empresa;

import java.util.ArrayList;

/**
 *
 * @author angel
 */
public class Empresa {

    private final String nom;
    private final String CIF;
    private int telef;
    private String direccio;
    private ArrayList<Empleat> ArrayEmpleats;

    public Empresa(String nom, String CIF, int telef, String direccio) {
        this.nom = nom;
        this.CIF = CIF;
        this.telef = telef;
        this.direccio = direccio;
        this.ArrayEmpleats = new ArrayList<>();
    }

    public String getNom() {
        return this.nom;
    }

    public String getCIF() {
        return this.CIF;
    }

    public int getTelef() {
        return this.telef;
    }

    public String getDireccio() {
        return this.direccio;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public void afegir(Empleat empleat) {
        this.ArrayEmpleats.add(empleat);
    }

    public void esborrar(int index) {
        this.ArrayEmpleats.remove(index);
    }

    public void infoEmpleats() {
        for (Empleat e : this.ArrayEmpleats) {
            e.mostrarTot();
        }
    }

    public void infoSous() {
        System.out.println("DNI\t\t  Sou Brut\t  Sou Net");
        for (Empleat e : this.ArrayEmpleats) {
            System.out.println(e.getDNI() + "\t -- " + e.getSouBrut() + "\t -- " + e.souNetMensual());
        }
        System.out.println("");
    }

    public double totalSousBruts() {
        double sumaTotalBruts = 0;
        for (Empleat e : this.ArrayEmpleats) {
            sumaTotalBruts += e.getSouBrut();
        }
        return sumaTotalBruts;
    }

    public double totalSousNets() {
        double sumaTotalNets = 0;
        for (Empleat e : this.ArrayEmpleats) {
            sumaTotalNets += e.souNetMensual();
        }
        return sumaTotalNets;
    }
}
