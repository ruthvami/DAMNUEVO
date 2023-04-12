
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf10.excepcions.ruth;

/**
 *
 * @author ruthv
 */
public class Jugadors extends Personatges{
    private int nomtrets;

    public Jugadors(int nomtrets, String nom, int posx, int posy, double velocidad) throws LimitDePantalla {
        super(nom, posx, posy, velocidad);
        this.nomtrets = nomtrets;
    }
    public void disparar(Enemic en) throws EnemicMort{
        if(en.getVida()==0){
            throw new EnemicMort();
        }
        en.decrement();
        nomtrets--;
    }
    public void estat(){
        System.out.println("Nom: "+this.getNom() );
        System.out.println("Tipus de personatge: "+this.getClass());
        System.out.println("Posició: x("+this.getPosx()+"), y("+this.getPosy()+")");
        System.out.println("Trets: "+this.nomtrets);
    }
}
