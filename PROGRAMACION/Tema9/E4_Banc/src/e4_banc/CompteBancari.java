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
    public void retirar(double compte) {
        if (compte > this.saldo) {
            System.out.println("***No se puede realizar la operacion***");
        } else if (compte > MAXRETIRAR) {
            System.out.println("***No es posible retirar mas de " + this.MAXRETIRAR + " euros***");
        } else {
            this.modificarSaldo(-compte);
        }
    }
//La función traspassar transpasa el dinero de una cuenta a otra
//      *Devuelve:nada ya que es un void
//      *Parámetros de entrada:
//          -CompteBancari bancari:es la cuenta a la que se va a pasar el dinero
//          -double dinero:es el dinero que se transpasara
    public void traspassar(CompteBancari bancari, double dinero) {
        if (dinero <= this.saldo) {
            bancari.ingressar(dinero);
            this.retirar(dinero);
        } else {
            System.out.println("***Error no se puede trasppasar esa cantidad de dinero***");
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
