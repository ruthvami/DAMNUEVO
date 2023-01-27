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
    
    public void modific(int cod,String titol,String format,double preu_lloguer){
    this.cod=cod;
    this.titol=titol;
    this.format=format;
    this.preu_lloguer=preu_lloguer;
    }
    
//    String cod,titol,format;
//    double preu_lloguer;
    public Aalumne(int cod,String titol,String format,double preu_lloguer){
           this.cod=cod;
           this.titol=titol;
           this.format=format;
           this.preu_lloguer=preu_lloguer;
    }
    
    public double undia(){
        return preu_lloguer;
    }
    public double dosdies(){
        return (preu_lloguer-(preu_lloguer*0.2))*2;
    }
    public double setmana(){
        return preu_lloguer*5;
    }
    public static final double IVA=1.21;
    private static int num;
    public final String id=null;

}
