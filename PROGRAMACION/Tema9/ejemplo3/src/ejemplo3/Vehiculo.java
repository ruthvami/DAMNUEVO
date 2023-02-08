/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;

/**
 *
 * @author rutvac
 */
public class Vehiculo {
     private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private double tarifa;
    private boolean disponible;

    public Vehiculo(String matricula,String marca,String modelo,String color,double tarifa){//esto es un constructor
        this.matricula=matricula;
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.tarifa=tarifa;
        this.disponible=true;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public String getAtribuyos(){
        return "Matricula: "+this.getMatricula()+"-Marca: "+this.getMarca()+"-Modelo: "+this.getMarca()+"-Color: "+this.getColor()+"-Tarifa: "+this.getTarifa();
    }
}
