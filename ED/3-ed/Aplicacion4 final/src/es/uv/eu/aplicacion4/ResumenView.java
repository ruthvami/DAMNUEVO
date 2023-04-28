
package es.uv.eu.aplicacion4;


import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

    public class ResumenView extends JFrame
{
 
    
    private int añosm;
    private int añosmay;
    private PeliculaModel model;
    
    
    
    public ResumenView(PeliculaModel model)
    {
 
     
     JTextArea txt = new JTextArea("El numero total de películas es  " + model.numero_pelis());
     JTextArea texto = new JTextArea("El menor año es  " + model.Anyomen()+ " El mayor año es  " + model.Anyomay());
     JPanel p  =  new  JPanel();
     this.setLayout(new FlowLayout());
     setTitle("Resumen");
     this.setSize(300,300);
     texto.setEditable(false);
     
     add(txt);
     add(texto);
     
    }
 
}