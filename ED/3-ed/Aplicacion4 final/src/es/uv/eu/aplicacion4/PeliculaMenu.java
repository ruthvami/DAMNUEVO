package es.uv.eu.aplicacion4;
import java.awt.event.ActionListener;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


 public class PeliculaMenu extends JMenuBar
 {
 private JMenu file,file_, file_1;
 private JMenuItem numero,años;
 private JMenuItem salir,ver,consultar;
 private PeliculaModel p;

 public PeliculaMenu() {
  
    
 file = new JMenu("Archivo");
    salir = new JMenuItem("Salir");
    salir.setActionCommand("ItemSalir");
    file.add(salir );
 this .add( file );
 
 file_=new JMenu("Resumen");
    ver=new JMenuItem("ver");
    ver.setActionCommand("otra_ventana");
    file_.add(ver);
 this.add(file_);
 
 file_1=new JMenu("Creador");
    consultar=new JMenuItem("consultar");
    consultar.setActionCommand("otro_frame");
    file_1.add(consultar);
 this.add(file_1);
 
 }

 public void setActionListener(ActionListener actionListener) {
 salir.addActionListener(actionListener);
 ver.addActionListener(actionListener);
 consultar.addActionListener(actionListener);

 }
 }