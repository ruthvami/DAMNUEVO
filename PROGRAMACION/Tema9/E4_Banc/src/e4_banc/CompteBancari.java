/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_banc;

/**
 *
 * @author ruthv
 */
public abstract class CompteBancari {

    private String IBAN;
    private double saldo;
    private final double INTERESANUALBASIC = 2.5;
    private final double MAXRETIRAR = 1000;

    public CompteBancari(String IBAN, double saldo) {
        this.IBAN = IBAN;
        this.saldo = saldo;
    }

    public double ingressar(double compte) {
        return this.modificarSaldo(compte);
    }

    public void retirar(double compte) {
        if (compte <= this.saldo && compte < MAXRETIRAR) {
            this.modificarSaldo(-compte);
        } else if (compte > MAXRETIRAR) {
            System.out.println("No es posible retirar mas de " + this.MAXRETIRAR + " euros");
        } else {
            System.out.println("No se puede realizar la operacion");
        }
    }

    public double traspassar(CompteBancari bancari, double dinero) {
        if (dinero <= this.saldo) {
            bancari.ingressar(dinero);
            this.retirar(dinero);
        } else {
            System.out.println("ERROR NO SE HA PODIDO REALIZAR LA OPERACION");
        }
        return this.saldo;
    }

    public double modificarSaldo(double cantidad) {
        return this.saldo += cantidad;
    }

    public abstract void calcularInteressos();

    public abstract void mostrarDades();

    public String getIBAN() {
        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteresAnualBasic() {
        return INTERESANUALBASIC;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
