package uf10.excepcions.ruth;

public abstract class Personatges {

    private int posx;
    private int posy;
    private final String nom;
    private final double velocidad;

    public Personatges(String nom, int posx, int posy, double velocidad) throws LimitDePantalla {
        this.nom = nom;
        this.velocidad = velocidad;
        this.setPosx(posx);
        this.setPosy(posy);
    }

    public double getVelocidad() {
        return velocidad;
    }
//La función mourey se mueve dependiendo de si el valor es poditivo o negativo hacia la arriba o hacia abajo
//      *Devuelve:es un void por lo que no devuelve nada
//      *Parámetros de entrada:nada
    public void mourey(int a) throws LimitDePantalla {
        this.setPosy((int) (this.getPosy() + this.velocidad * 2 * a));
        System.out.println("Jugador " + this.getNom() + " se ha movido a la posicion " + this.posy);

        if (posy > 100 || posy < -100) {
            throw new LimitDePantalla(this);
        }
    }

    public void mourex(int a) throws LimitDePantalla {
        this.setPosx((int) (this.getPosx() + this.velocidad * a));
        System.out.println("Jugador " + this.getNom() + " se ha movido a la posicion " + this.posx);
        if (posx > 200 || posx < -200) {
            throw new LimitDePantalla(this);
        }
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public String getNom() {
        return nom;
    }

    public void setPosx(int posx) throws LimitDePantalla {
        this.posx = posx;
        if (posx > 200 || posx < -200) {
            throw new LimitDePantalla(this);
        }
    }

    public void setPosy(int posy) throws LimitDePantalla {
        this.posy = posy;
        if (posy > 100 || posy < -100) {
            throw new LimitDePantalla(this);
        }
    }

    public abstract void estat();
}
