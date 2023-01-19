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
//    private String nom;
//    private String cognom;
//    private int edat;
//    
//
//public void setNom( String inNom){
//    nom=inNom;
//}
//public void setCognom(String inCognom){
//    cognom=inCognom;
//}
//public void setEdat(int inEdat){
//    edat = inEdat;
//}
//public String toString(){
//    return (nom +" té "+edat+" anys");
//}
    String cod,titol,format;
    double preu_lloguer;
    
    public double undia(){
        return preu_lloguer;
    }
    public double dosdies(){
        return (preu_lloguer-(preu_lloguer*0.2))*2;
    }
    public double setmana(){
        return preu_lloguer*5;
    }
}