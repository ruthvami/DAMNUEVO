 package es.uv.eu.aplicacion4;

 import java.awt.BorderLayout;
 import java.awt.Font;
 import java.awt.event.ActionListener;
 import javax.swing.JButton;
 import javax.swing.JFrame;
 import javax.swing.JLabel;


public class PeliculaView extends JFrame {

 private PeliculaModel peliculas;
 private ListaPanel listaPanel ;
 private JButton exit ;
 private PeliculaMenu peliculaMenu;
 private ResumenView intermedio;

 public PeliculaView(PeliculaModel peliculas) {
 // Invoca al constructor de la superclase Frame
 super("Aplicacion 1: Lista de peliculas" );

 this . peliculas = peliculas ;
 this .setLayout(new BorderLayout());

 // Tamano del Frame
 this .setSize(700,400);

 // Menu de la aplicacion
 peliculaMenu = new PeliculaMenu();
 this.setJMenuBar(peliculaMenu);

 // Cabecera identificativa de la aplicacion
 JLabel label = new JLabel("Lista de pelculas:" );
 label .setFont(new Font("Sans", Font.BOLD, 14));

 // El panel con la lista de peliculas
 listaPanel = new ListaPanel(peliculas);
 listaPanel .mostrar();

 // El boton de salida se anyade en la aplicacion 2
 exit = new JButton("Salir" );
 exit .setActionCommand("buttonExit");

 // ñAade todos los componentes al frame
 this .add(label, BorderLayout.NORTH);
 this .add(listaPanel,BorderLayout.CENTER);
 this .add(exit , BorderLayout.SOUTH);


 this . setVisible (true );
 }
 public void setActionListener(ActionListener actionListener) {
 exit .addActionListener(actionListener);
 peliculaMenu.setActionListener(actionListener);
 }
}