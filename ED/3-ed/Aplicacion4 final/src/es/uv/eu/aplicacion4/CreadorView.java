
package es.uv.eu.aplicacion4;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.FlowLayout;

public class CreadorView extends JFrame{
    
    JTextArea txt = new JTextArea("Los creadores han sido Ruth");  
    
    public CreadorView()
    {
        this.setLayout(new FlowLayout());
        setTitle("Creadores");
        this.setSize(500,200);
        txt.setEditable(false);
        
        add(txt);
    
    }
   
}
