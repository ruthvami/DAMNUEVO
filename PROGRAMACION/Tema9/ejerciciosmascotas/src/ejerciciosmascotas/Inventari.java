/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciosmascotas;

import java.util.ArrayList;

/**
 *
 * @author rutvac
 */
public class Inventari {
    private ArrayList <Mascotas> mascotes =new ArrayList() ;
    
    public void inserirmascota( Mascotas masc){
        mascotes.add(masc);
    }
    public void eliminar( int posicion){
        mascotes.remove(posicion);
    }
    public void borrar(){
        mascotes.clear();
    }
    
}