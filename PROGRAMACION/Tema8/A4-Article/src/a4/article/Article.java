/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a4.article;

/**
 *
 * @author rutvac
 */
public class Article {

    private String nom;
    private double preu;
    private double iva;
    private int existencies;
    private int stock;
    private int quantsQueden=getExistencies() / getStock();
    public Article(String nom, double preu, double iva,int compra) {
        if (!(preu < 0 || iva < 0)) {
            this.nom = nom;
            this.preu = preu;
            this.iva = iva;
            
            System.out.println("Datos correctos");

        } else {
            this.nom = null;
            this.preu = 0;
            this.iva = 0;

            System.out.println("*** ERROR al introducir los datos ");

        }
    }

    

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public double getIva() {
        return iva;
    }

    public int getExistencies() {
        return existencies;
    }

    public int getStock() {
        return stock;
    }
    public int getQuantsQueden(){
        return quantsQueden;
    }
    public double getPVP() {
        return (getPreu() * (1 + getIva()));
    }
    public double getPVPDescompte( double per) {
        return (getPVP()*(1-per/100));
    }
    public boolean vendre( int prenda) {
        if(getQuantsQueden()>0){
            return true;
        }else{
        return false;
        }
    }
    public boolean emmagatzema(int per ) {
        int cons=getStock()+per;
        if(cons>0){
            return true;
        }else{
        return false;
        }
    }
    public void imprimeix(){
        System.out.println(getNom()+" - Precio: "+getPreu()+"€"+"- IVA: "+(getIva()*100)+"% - PVP: "+(getPVP())+" -Quedan: "+getStock());
    }
    public void setNom(String nom) {

        this.nom = nom;
    }

    public void setPreu(double preu) {
        if ((preu < 0)) {
            this.preu = 0;
            System.out.println("*** ERROR al introducir los datos ");
        } else {
            this.preu = preu;
        }
    }

    public void setIva(double iva) {
        if ((iva < 0)) {
            this.iva = 0;
            System.out.println("*** ERROR al introducir los datos ");
        } else {
            this.iva = iva;

        }
    }

    public void setExistencies(int existencies) {
        this.existencies = existencies;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public void setQuantsQueden(int queden) {
        this.quantsQueden = queden;
    }
}
