package es.uv.eu.aplicacion4;


 import java.awt.Color;
 import java.awt.Font;
 import javax.swing.JScrollPane;
 import javax.swing.JTextArea;
 import java.awt.BorderLayout;


import javax.swing.JPanel;

 public class ListaPanel extends JPanel 
 {
 private PeliculaModel peliculas;
 private JTextArea textArea;
 private JScrollPane scroll ;

    /**
     *
     * @param peliculas
     */
    public ListaPanel(PeliculaModel peliculas) {

 this . peliculas = peliculas ;

 setLayout(new BorderLayout());
 textArea = new JTextArea(20,60);
 textArea.setEditable( false );
 textArea.setBackground(Color.lightGray);
 textArea.setForeground(Color.black);
 textArea.setFont(new Font("Sans", Font.BOLD, 12));
 scroll =new JScrollPane(textArea);

 this.add(scroll, BorderLayout.CENTER);
 this.setVisible(true);

 }

    /**
     *
     */
    public void mostrar() 
    {
        textArea.append(peliculas.toString ());
    }  
}
