package es.uv.eu.aplicacion4;

import java.util.HashSet;
public class PeliculaModel {
    private HashSet<Pelicula> peliculas;
    
    
    public PeliculaModel(){
        peliculas = new HashSet<>();
    }
    
    public boolean add(Pelicula p)
    {
        return peliculas.add(p);
    }
    
    @Override
    public String toString(){
        String resultado="";
        for (Pelicula p : peliculas) {
            resultado=resultado+p.toString()+"\n";
        }
        return resultado; 
    }
    
    public int Anyomen(){
        
        int piv, añomen=3000;
        for(Pelicula p:peliculas)
        {
            piv=p.getAnyo();
            if(piv<añomen){
                añomen=piv;
            }
            
        }
         return añomen;   
        }
    
    public int Anyomay(){
        int piv, añomay=0;
        for(Pelicula p:peliculas)
        {
            piv=p.getAnyo();
            if(piv>añomay){
                añomay=piv;}
            
        }   
        return añomay;    
        }
    
    public int numero_pelis()
    {
        int n=0;
        
        for(Pelicula p: peliculas){
            n+=1;}
        
           return n; 
    }
    
    }