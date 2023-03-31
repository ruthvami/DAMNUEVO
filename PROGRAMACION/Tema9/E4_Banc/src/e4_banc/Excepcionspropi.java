/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_banc;

/**
 *
 * @author rutvac
 */
class Excepoperacionfallida extends Exception {

    private double compte;
    private double saldo;

    public Excepoperacionfallida(double compte, double saldo) {
        this.compte = compte;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "operacionfallida: no se puede realizar la operacion:" + this.compte + ">" + this.saldo;
    }

}

class Excepretirada extends Exception {

    private double compte;
    private double maximo;

    public Excepretirada(double compte, double maximo) {
        this.compte = compte;
        this.maximo = maximo;
    }

    @Override
    public String toString() {
        return "Excepretirada: el dinero que desea sacar es mayor al maximo posible: " + this.maximo;
    }

}

class Expibanmal extends Exception {

    private final String IBAN;

    public Expibanmal(String IBAN) {
        this.IBAN = IBAN;
    }

    @Override
    public String toString() {
        return "Expibanmal: el iban es incorrecto" ;
    }

}
