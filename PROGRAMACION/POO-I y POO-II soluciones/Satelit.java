/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e2_astres;

/**
 *
 * @author angel
 */
public class Satelit extends Astre{
    private double distanciaPlaneta;
    private double orbitaPlanetaria;
    private Planeta planeta;
    
    public Satelit(String nom,double radi,double rotacio,double massa,double temperatura,
            double gravetat,double distanciaPlaneta, double orbitaPlanetaria,Planeta planeta){
        
        super(nom,radi,rotacio,massa,temperatura,gravetat);
        
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
        this.planeta = planeta;
    }
    public Satelit(String nom,double radi,double rotacio,double massa,double temperatura,
            double gravetat,double distanciaPlaneta, double orbitaPlanetaria){
        
        super(nom,radi,rotacio,massa,temperatura,gravetat);
        
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();

        System.out.println("- Distància al seu planeta  : " + this.distanciaPlaneta +" Km");
        System.out.println("- Temps d'òrbita planetària : " + this.orbitaPlanetaria +" dies");
        if(this.planeta != null){
            System.out.println("- Planeta mare              : " + this.planeta.getNom());
        }else{
            System.out.println("- No té planeta asociat");
        }
        
    }
    
    public double getDistanciaPlaneta() {
        return this.distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return this.orbitaPlanetaria;
    }

    public Planeta getPlaneta() {
        return this.planeta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    public void setPlaneta(Planeta planeta) {
        this.planeta = planeta;
    }
    
}