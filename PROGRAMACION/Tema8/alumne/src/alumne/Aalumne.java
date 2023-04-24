/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumne;

/**
 *
 * @author rutvac
 */
public class Aalumne {
    private int cod;
    private String titol;
    private String format;
    private double preu_lloguer;
    
    /**
     *
     * @return this.cod  
     */
    public int getCod(){
        return this.cod;
    }
    public String getTitol(){
        return this.titol;
    }
    public String getFormat(){
        return this.format;
    }
    public double getPre_lloguer(){
        return this.preu_lloguer;
    }
    
    /**
     *
     * @param cod codigo de la pelicula a modificar
     * @param titol titulo de la pelicula a modificar
     * @param format formato de la pelicula a modificar
     * @param preu_lloguer precio de la pelicula a modificar
     */
    public void modific(int cod,String titol,String format,double preu_lloguer){
    this.cod=cod;
    this.titol=titol;
    this.format=format;
    this.preu_lloguer=preu_lloguer;
    }
    
//    String cod,titol,format;
//    double preu_lloguer;

    /**
     *
     * @param cod codigo de la pelicula
     * @param titol titulo de la pelicula
     * @param format formato que se encuantra
     * @param preu_lloguer precio 
     */
    public Aalumne(int cod,String titol,String format,double preu_lloguer){
           this.cod=cod;
           this.titol=titol;
           this.format=format;
           this.preu_lloguer=preu_lloguer;
    }
    
    /**
     *
     * @return el precio por un dia de alquiler
     */
    public double undia(){
        return preu_lloguer;
    }

    /**
     *
     * @return el precio de dos dias
     */
    public double dosdies(){
        return (preu_lloguer-(preu_lloguer*0.2))*2;
    }

    /**
     *
     * @return el precio de una semana
     */
    public double setmana(){
        return preu_lloguer*5;
    }
    public static final double IVA=1.21;
    private static int num;
    public final String id=null;

}
