package exer14;

public class Gat {

    private final String sexe;
    private final String nom;

    public Gat(String nom, String sexe) {
        this.nom = nom;
        this.sexe = sexe;
    }
    public Gat(String sexe) {
        this.nom = "";
        this.sexe = sexe;
    }

    public String getNom() {
        return this.nom;
    }
    public String getSexe() {
        return this.sexe;
    }

    public Gat apareiarAmb(Gat parella) throws ExceptionApariamentImpossible {
        if (this.nom.equals(parella.nom)) {
            throw new ExceptionApariamentImpossible(this);
        }
        if (this.sexe.equals(parella.sexe)) {
            throw new ExceptionApariamentImpossible(this, parella);
        }      

        String sexe_cria = (int) (Math.random() * 2) == 0 ? "femella" : "mascle";
        return new Gat(sexe_cria);
    }

}
