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

    private final String IBAN;
    private double saldo;
    private final double INTERESANUALBASIC = 2.5;
    private final double MAXRETIRAR = 1000;

    public CompteBancari(String IBAN, double saldo) throws Expibanmal {
        if (!IBAN.matches("[A-Z]{2}[0-9]{10}")) {
            throw new Expibanmal(IBAN);
        }
        this.IBAN = IBAN;
        this.saldo = saldo;
    }
//La función ingressar ingresa el saldo introducido
//      *Devuelve:el sueldo nuevo
//      *Parámetros de entrada:
//          -double compte: que es el dinero que se ingresara

    public double ingressar(double compte) {
        return this.modificarSaldo(compte);
    }
//La función retirar retira el saldo introducido
//      *Devuelve:nada ya que es un void
//      *Parámetros de entrada:
//          -double compte: que es el dinero que se retirara

    public void retirar(double compte) throws Excepoperacionfallida, Excepretirada {
        if (compte > this.saldo) {
            throw new Excepoperacionfallida(compte, this.saldo);
        } else if (compte > MAXRETIRAR) {
            throw new Excepretirada(compte, this.MAXRETIRAR);
        } else {
            this.modificarSaldo(-compte);
        }
    }
//La función traspassar transpasa el dinero de una cuenta a otra
//      *Devuelve:nada ya que es un void
//      *Parámetros de entrada:
//          -CompteBancari bancari:es la cuenta a la que se va a pasar el dinero
//          -double dinero:es el dinero que se transpasara

    public void traspassar(CompteBancari bancari, double dinero) throws Excepoperacionfallida, Excepretirada {
        if (dinero <= this.saldo) {
            bancari.ingressar(dinero);
            this.retirar(dinero);
        } else {
            throw new Excepoperacionfallida(dinero, this.saldo);
        }

    }
//La función modificarSaldo se modifica el saldo añadiendo la cantidad introducida
//      *Devuelve:el sueldo nuevo
//      *Parámetros de entrada:
//          -double cantidad: sueldo que se añade

    public double modificarSaldo(double cantidad) {
        return this.saldo += cantidad;
    }

    public abstract void calcularInteressos();

    public abstract void mostrarDades();

    public String getIBAN() throws Expibanmal {

        return IBAN;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getInteresAnualBasic() {
        return INTERESANUALBASIC;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
