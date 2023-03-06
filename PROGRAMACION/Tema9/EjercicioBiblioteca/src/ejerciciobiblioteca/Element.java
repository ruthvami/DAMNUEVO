/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobiblioteca;

/**
 *
 * @author rutvac
 */
abstract class Element {
    private String titol;
    private Usuario usuariPrestat;

    public Element(String titol, Usuario usuariPrestat) {
        this.titol = titol;
        this.usuariPrestat = usuariPrestat;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public void setUsuariPrestat(Usuario usuariPrestat) {
        this.usuariPrestat = usuariPrestat;
    }

    public String getTitol() {
        return titol;
    }

    public Usuario getUsuariPrestat() {
        return usuariPrestat;
    }
    public void prestar(Usuario us){
       if(this.usuariPrestat==null){
          
       }
    }
    public void tornar(){
        
    }
    public abstract void mostrar(Usuario us);
}
