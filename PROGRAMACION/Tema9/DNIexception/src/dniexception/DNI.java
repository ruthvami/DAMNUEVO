/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dniexception;

/**
 *
 * @author ruthv
 */
public class DNI {

    private String cliente;
    private String ncuenta;
    private double tipoi;
    private double saldo;

    public DNI(String cliente, String ncuenta, double tipoi, double saldo) {
        this.cliente = cliente;
        this.ncuenta = ncuenta;
        this.saldo = saldo;
        this.tipoi = tipoi;
    }

    public DNI() {
    }

    public String getCliente() {
        return cliente;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public double getTipoi() {
        return tipoi;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public void setTipoi(double tipoi) {
        this.tipoi = tipoi;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(double cantidad) {
        if (cantidad < 0) {
            return false;
        }
        saldo = saldo + cantidad;
        return true;
    }

    public boolean reintegro(double cantidad) {
        if (cantidad < 0) {
            System.out.println("ERROR MENOR QUE 0");
            return false;
        } else if (saldo >= cantidad) {
            saldo = saldo - cantidad;
            return true;
        } else {
            System.out.println("ERROR NO QUEDARIA CANTIDAD");
            return false;
        }

    }

    public boolean transferencia(DNI c, double n) {
        boolean correcto = true;
        if (n < 0) {
            correcto = false;
        } else if (saldo >= n) {
            reintegro(n);
            c.ingreso(n);
        } else {
            correcto = false;
        }
        return correcto;
    }
}
