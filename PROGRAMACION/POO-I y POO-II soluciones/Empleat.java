/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e5_empresa;

/**
 *
 * @author angel
 */
public class Empleat {

    private final String nom;
    private final String DNI;
    private double souBrut;
    private int edat;
    private int telef;
    private String direccio;
    private final double IRPF20 = 0.2;
    private final double IRPF30 = 0.3;
    private final double IRPF40 = 0.4;
    private final double BRUT_MIN = 12000;
    private final double BRUT_MAX = 25000;
    

    public Empleat(String nom, String DNI, double souBrut, int edat, int telef, String direccio) {
        this.nom = nom;
        this.DNI = DNI;
        this.souBrut = souBrut;
        this.edat = edat;
        this.telef = telef;
        this.direccio = direccio;
    }

    public Empleat(String nom, String DNI, double souBrut) {
        this.nom = nom;
        this.DNI = DNI;
        this.souBrut = souBrut;
        this.edat = 0;
        this.telef = 0;
        this.direccio = "Sense adreça";
    }

    public String getNom() {
        return this.nom;
    }

    public String getDNI() {
        return this.DNI;
    }

    public double getSouBrut() {
        return this.souBrut;
    }

    public int getEdat() {
        return this.edat;
    }

    public int getTelef() {
        return this.telef;
    }

    public String getDireccio() {
        return this.direccio;
    }

    public void setSouBrut(double souBrut) {
        this.souBrut = souBrut;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    public void setTelef(int telef) {
        this.telef = telef;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public void mostrarTot() {
        System.out.println("");
        System.out.println("// INFO EMPLEAT //");
        System.out.println("Nom: " + this.nom);
        System.out.println("DNI: " + this.DNI);
        System.out.println("Sou brut: ou bru" + this.souBrut);
        System.out.println("Sou net: " + this.souNetMensual());
        System.out.println("Edat: " + this.edat);
        System.out.println("Telèfon: " + this.telef);
        System.out.println("Adreça: " + this.direccio);
    }

    public double souNetMensual() {
        double souAnual = this.souBrut * 12;
        double IRPF;
        if (souAnual < BRUT_MIN) {
            IRPF = IRPF20;
        } else if (souAnual <= BRUT_MAX) {
            IRPF = IRPF30;
        } else {
            IRPF = IRPF40;
        }
        return this.souBrut - (IRPF * this.souBrut);
    }
}
