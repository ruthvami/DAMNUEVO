/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4.article;

/**
 *
 * @author rutvac
 */
public class Article {

    private String nom;
    private double preu;
    private double iva;
    private int quantsQueden;
//Solo se asigna un valor al constructor si se cumple que el precio es positivo,
//si el iva es o 10,21 o 4 y si la cantidad de stock es positiva

    public Article(String nom, double preu, double iva, int quantsQueden) {
        this.nom = nom;
        if (preu >= 1) {
            this.preu = preu;
        } else {
            System.out.println("*** ERROR: al introducir le precio");
        }
        if (iva == 10 || iva == 21 || iva == 4) {
            this.iva = iva;
        } else {
            System.out.println("*** ERROR: al introducir el IVA");
        }
        if (quantsQueden >= 0) {
            this.quantsQueden = quantsQueden;
        } else {
            System.out.println("*** ERROR: el stock no es correcto");
        }

    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public double getIva() {
        return iva;
    }

    public int getQuantsQueden() {
        return quantsQueden;
    }
//para calcular el IVA se multiplica el precio por el iva mas cien y esto dividido entre 100

    public double getPVP() {
        return (this.preu * ((this.iva + 100) / 100));
    }
//Para  calcular el descunto se resta el precio del iva  a el porcentaje de descuento
//dividido entre 100 y se multiplica por el iva

    public double getPVPDescompte(double per) {
        return (this.getPVP() - ((per / 100) * this.getPVP()));
    }
//Si el stock es mayor que el numero introducido se le resta al stock el numero introducido

    public boolean vendre(int prenda) {
        if (this.quantsQueden > prenda) {
            this.quantsQueden -= prenda;
            return true;
        } else {
            this.quantsQueden = 0;
            return false;
        }
    }
//devuelve una suma del porcentaje junto con el stock si se suma lo introducido mas stock

    public boolean emmagatzema(int per) {
        if (per + this.quantsQueden > 0) {
            this.quantsQueden += per;
            return true;
        } else {
            return false;
        }

    }
    public void imprimeix() {
        System.out.println(getNom() + " - Precio: " + getPreu() + "€" + "- IVA: " + getIva() + "% - PVP: " + getPVP() + " -Quedan: " + getQuantsQueden());
    }

    public void setNom(String nom) {

        this.nom = nom;
    }

    public void setPreu(double preu) {
        if ((preu <= 0)) {

            System.out.println("*** ERROR al introducir el precio ");
        } else {
            this.preu = preu;
        }
    }

    public void setIva(int iva) {
        if ((iva == 10 || iva == 21 || iva == 4)) {
            this.iva = iva;
        } else {
            this.iva = 0;
            System.out.println("*** ERROR al introducir el IVA");
        }
    }

    public void setQuantsQueden(int queden) {
        if (quantsQueden >= 0) {
            this.quantsQueden = queden;
        } else {
            System.out.println("*** ERROR al introducir el stock ");
        }
    }
}
