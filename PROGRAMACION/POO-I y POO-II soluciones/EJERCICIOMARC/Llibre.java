package biblioteques;

import java.util.ArrayList;

public class Llibre extends Element {
    
    private int isbn;
    private String editorial;
    private static ArrayList<Integer> isbns = new ArrayList<>();

    public Llibre(String titol, int isbn, String editorial) {
        super(titol);
        this.editorial = editorial;
        if (comprovarIsbn(isbn)) {
            this.isbn = isbn;
        } else {
            System.out.println("***L'ISBN ja existeix.\n");
            this.isbn = 0;
        }
    }

    public int getIsbn() {
        return isbn;
    }

    public String getEditorial() {
        return editorial;
    }
    
    private boolean comprovarIsbn(int isbn) {
        for (int i = 0; i < isbns.size(); i++) {
            if (isbn==isbns.get(i)) {
                return false;
            }
        }
        isbns.add(isbn);
        return true;
    }
    
    @Override
    public void mostrar() {
        System.out.printf(this.getClass().getSimpleName()+"\t%-25s%-25s%-25s","Titol: "+this.getTitol(),
                "ISBN: "+this.getIsbn(),"Editorial: "+this.getEditorial());
        if (this.getUsuariPrestat()==null) {
            System.out.print("DISPONIBLE");
        } else {
            System.out.print("Prestat a "+this.getUsuariPrestat().getNom());
        }
    }

}
    //Marc Martínez Sanchis