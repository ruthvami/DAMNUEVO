package biblioteques;

public class DVD extends Element {

    private int duracio;
    private String format;
    private final static String[] FORMATSVALIDS = {"video","rom","audio"};

    public DVD(String titol, int duracio, String format) {
        super(titol);
        this.duracio = duracio;
        if (comprovarFormat(format)) {
            this.format=format;
        } else {
            this.format="No conegut";
        }
    }

    public int getDuracio() {
        return duracio;
    }

    public String getFormat() {
        return format;
    }
    
    private boolean comprovarFormat(String format) {
        for (int i = 0; i < FORMATSVALIDS.length; i++) {
            if (FORMATSVALIDS[i]==format.toLowerCase()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void mostrar() {
        System.out.printf(this.getClass().getSimpleName()+"\t%-25s%-25s%-25s","Titol: "+this.getTitol(),
                "Duració: "+this.getDuracio()+"m","Format: "+this.getFormat());
        if (this.getUsuariPrestat()==null) {
            System.out.print("DISPONIBLE");
        } else {
            System.out.print("Prestat a " + this.getUsuariPrestat().getNom()+".");
        }
    }

}
    //Marc Martínez Sanchis