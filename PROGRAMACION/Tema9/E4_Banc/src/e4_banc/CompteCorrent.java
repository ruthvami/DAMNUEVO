/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4_banc;

/**
 *
 * @author ruthv
 */
public class CompteCorrent extends CompteBancari {

    public CompteCorrent(String IBAN, double saldo) {
        super(IBAN, saldo);
    }

    public void calcularInteressos() {
        double interessos = 0;
        interessos += this.getSaldo() * (this.getInteresAnualBasic() / 100);
        this.ingressar(interessos);
    }

    public void mostrarDades() {
        System.out.println(this.getClass().getSimpleName() + " El IBAN es " + this.getIBAN()  + " , el saldo de la cuenta es de " + this.getSaldo()+ " y tiene un interes de " + this.getInteresAnualBasic());
    }
}
