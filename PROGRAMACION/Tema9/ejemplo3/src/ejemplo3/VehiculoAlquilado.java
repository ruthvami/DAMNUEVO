/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo3;

/**
 *
 * @author rutvac
 */
public class VehiculoAlquilado {
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int diaAlquiler;
    private int mesAlquiler;
    private int anyoAlquiler;
    private int totalDiasAlquilado;

    public VehiculoAlquilado(Cliente cliente,Vehiculo vehiculo,int diaAlquiler,int mesAlquiler,int anyoAlquiler,int totalDiasAlquilado){//esto es un constructor
        this.cliente=cliente;
        this.vehiculo=vehiculo;
        this.diaAlquiler=diaAlquiler;
        this.mesAlquiler=mesAlquiler;
        this.anyoAlquiler=anyoAlquiler;
        this.totalDiasAlquilado=totalDiasAlquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public int getDiaAlquiler() {
        return diaAlquiler;
    }

    public int getMesAlquiler() {
        return mesAlquiler;
    }

    public int getAnyoAlquiler() {
        return anyoAlquiler;
    }

    public int getTotalDiasAlquilado() {
        return totalDiasAlquilado;
    }
}
