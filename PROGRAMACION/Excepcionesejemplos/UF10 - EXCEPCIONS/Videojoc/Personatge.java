/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aq10_videojoc;

/**
 *
 * @author AiA
 */
public class Personatge {
    private String nom;
    private int x;
    private int y;
    private int velocitat;
    private final int  XMAX = 200;
    private final int  XMIN = -XMAX;
    private final int  YMAX = 100;
    private final int  YMIN = -YMAX;

    public Personatge(String nom, int x, int y, int velocitat) throws ExceptionLimitDePantalla{
        this.nom = nom;
        this.velocitat = velocitat;
        this.setX(x);
        this.setY(y);
    }

    public void moureDreta() throws ExceptionLimitDePantalla{
        this.setX(this.x + velocitat);
    }

    public void moureEsquerra() throws ExceptionLimitDePantalla{
        this.setX(this.x - velocitat);
    }

    public void saltar() throws ExceptionLimitDePantalla{
        this.setY(this.y + velocitat * 2);
    }
    public void baixar() throws ExceptionLimitDePantalla{
        this.setY(this.y - velocitat * 2);
    }
    
    public String getNom(){
        return this.nom;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void setX(int x) throws ExceptionLimitDePantalla{
        if(x > XMAX || x < XMIN){
            throw new ExceptionLimitDePantalla(this.nom,x,"horitzontal");
        }else{
            this.x = x;
        }        
    }

    public void setY(int y) throws ExceptionLimitDePantalla{
        if(y > YMAX || y < YMIN){
            throw new ExceptionLimitDePantalla(this.nom,y,"vertical");
        }else{
            this.y = y;
        }   
    }
    
    public void info(){
        System.out.println("\n### Info personatge ###");
        System.out.println("Nom: " + this.getNom());
        System.out.println("Tipus: " + this.getClass().getSimpleName());
        System.out.println("Posició: " + this.getX() + " / "+ this.getY());
    }
}