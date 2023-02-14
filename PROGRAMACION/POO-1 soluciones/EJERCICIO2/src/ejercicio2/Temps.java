/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author rutvac
 */
public class Temps {

    private int horas;
    private int minutos;
    private int segundos;

    public Temps(int horas, int minutos, int segundos) {
        if (horas >= 0) {
            this.horas = horas;
        } else {
            System.out.println("Error al introducir las horas");
            normalitza();
            this.horas = horas;
        }
        if (this.minutos >= 0 && this.minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Error al introducir los minutos");
            normalitza();
            this.minutos = minutos;
        }
        if (this.segundos >= 0 && this.segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Error al introducir los segundos");
            normalitza();
            this.segundos = segundos;
        }
    }

    private void normalitza() {
        int s = this.horas * 3600 + this.minutos * 60 + this.segundos;

        this.horas = s / 3600;
        this.minutos = ((s % 3600) / 60);
        this.segundos = ((s % 3600) % 60);
    }

    public int editahoras(int num) {
        this.horas = this.horas + (num);
        return this.horas;
    }

    public int editaminutos(int num) {
        this.minutos = this.minutos + (num);
        return this.minutos;
    }

    public int editasegundos(int num) {
        this.segundos = this.segundos + (num);
        return this.segundos;
    }

    public String toString() {
        return this.horas + "h " + this.minutos + "m " + this.segundos + "s";
    }

    public int getHoras() {

        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHoras(int horas) {
        if (this.horas >= 0) {
            this.horas = horas;
        } else {
            System.out.println("Error al introducir las horas");
            normalitza();
            this.horas = horas;
        }
    }

    public void setMinutos(int minutos) {
        if (this.minutos >= 0 && this.minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Error al introducir los minutos");
            normalitza();
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (this.segundos >= 0 && this.segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Error al introducir los segundos");
            normalitza();
            this.segundos = segundos;
        }
    }

    public Temps sumarobj(Temps t1) {
        this.horas = this.horas + t1.horas;
        this.minutos = this.minutos + t1.minutos;
        this.segundos = this.segundos + t1.segundos;
        normalitza();
        return new Temps(this.horas, this.minutos, this.segundos);
    }

    public Temps restaobj(Temps t1) {
        this.horas = this.horas - t1.horas;
        this.minutos = this.minutos - t1.minutos;
        this.segundos = this.segundos - t1.segundos;
        normalitza();
        return new Temps(this.horas, this.minutos, this.segundos);
    }

}
