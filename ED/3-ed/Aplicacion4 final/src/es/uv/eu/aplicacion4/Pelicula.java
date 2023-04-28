
package es.uv.eu.aplicacion4;

/**
 *
 * @author rutvac
 */
public class Pelicula {
    public final static int TERROR=0, CIENCIA_FICCION=1, ACCION=2, SUSPENSE=3, COMEDIA=4;
    private static final String[] generos = { "Terror", "Ciencia ficcion", "Accion", "Suspense", "Comedia" };

    private String titulo;
    private String director;
    private int anyo;
    private int codigo;
    private int genero;
    private static int proximoCodigo=0;

    /**
     *
     * @param titulo titulo de la pelicula
     * @param director director de la pelicula
     * @param anyo  año de estreno de la pelicula
     * @param genero genero de la pelicula
     */
    public Pelicula(String titulo, String director, int anyo, int genero) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.genero = genero;
        codigo = proximoCodigo;
        proximoCodigo++;
    }    
    
    /**
     *
     * @return introduce el siguiente codigo
     */
    public int getProximocodigo()
    {
        return proximoCodigo;
    }
    
    /**
     *
     * @return introduce el año de estreno de la pelicula
     */
    public int getAnyo() {
      return anyo;
    }

    /**
     *
     * @param anyo  el año de estreno de la pelicula
     */
    public void setAnyo(int anyo) {
      this.anyo = anyo;
    }
    
    /**
     *
     * @return introduce el director de la pelicula
     */
    public String getDirector() {
      return director;
    }
    
    /**
     *
     * @param director  el director de la pelicula
     */
    public void setDirector(String director) {
      this.director = director;
    }

    /**
     *
     * @return introduce el titulo de la pelicula
     */
    public String getTitulo() {
      return titulo;
    }

    public void setTitulo(String titulo) {
      this.titulo = titulo;
    }
  
    /**
     *
     * @return
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     *
     * @return
     */
    public int getGenero(){
        return genero;
    }    
  
    /**
     *
     * @param genero
     */
    public void setGenero(int genero) {
        this.genero=genero;
    }

    /**
     *
     * @return
     */
    public String getGeneroComoCadena(){
        return generos[genero];
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Codigo:"+codigo+"\n"+"Pelicula: "+titulo+"\n"+"Director: "+director+
            "\n"+"Anyo: "+anyo+"\n"+"Genero: "+generos[genero]+"\n";
    }

}