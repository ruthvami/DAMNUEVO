package biblioteques;

public abstract class Element {
    
    private String titol;
    private Usuari usuariPrestat;

    public Element(String titol) {
        this.titol = titol;
    }

    public String getTitol() {
        return titol;
    }

    public Usuari getUsuariPrestat() {
        return usuariPrestat;
    }

    public void setUsuariPrestat(Usuari usuariPrestat) {
        this.usuariPrestat = usuariPrestat;
    }
    
    public void prestar(Usuari a) {
        if (this.getUsuariPrestat()==null) {
            this.setUsuariPrestat(a);
        } else {
            System.out.println("***El "+this.getClass().getSimpleName()+" "+this.getTitol()+" no està disponible.");
        }
    }
    
    public void tornar() {
        if (this.usuariPrestat==null) {
            System.out.println("***L'element no està prestat.");
        } else {
            this.usuariPrestat=null;
        }
    }
    
    public abstract void mostrar();
            
}
    //Marc Martínez Sanchis