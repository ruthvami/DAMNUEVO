package es.uv.eu.aplicacion4;

 import java.awt.event.ActionEvent;
 import java.awt.event.ActionListener;
 import java.awt.event.WindowAdapter;
 import java.awt.event.WindowEvent;


 public class PeliculaController {
     
 private PeliculaModel model;
 private PeliculaView view;
 private ResumenView resumen;
 private CreadorView creador;
 
 public void mostrarResumen()
    {
        resumen = new ResumenView(model);
        resumen.setVisible(true);
    }
 public void mostrarCreadores()
 {
     creador = new CreadorView();
     creador.setVisible(true);
 }
 public PeliculaController (PeliculaModel model, PeliculaView view) {
 this .model = model;
 this .view = view;
 

 view.addWindowListener(new PeliculaControllerWindowListener());
 view.setActionListener(new PeliculaControllerActionListener ());
 }

 class PeliculaControllerWindowListener extends WindowAdapter
 {
     
    @Override
    public void windowClosing(WindowEvent e) {
       System.out.println( " PeliculaController : Cerrar ventana.");
       System.exit(0);
    }
 }
 
 
 class PeliculaControllerActionListener implements ActionListener 
 {
     
 @Override
    public void actionPerformed(ActionEvent ae) 
    {
        String command = ae.getActionCommand();
        
        switch (command) {
        case "buttonExit" :
            System.out.println( " PeliculaController : Boton ’ Salir ’. " );
            System.exit(0);
        break;
        case "ItemSalir" :
            System.out.println( " PeliculaController : Menu ’Salir ’. " );
            System.exit(0);
        break;
        case "otra_ventana": //resumen
            System.out.println("PeliculaController : Menu ’otra_ventana'." );
            mostrarResumen();
        break;
        case "otro_frame": //creador
            System.out.println("PeliculaController : Menu ' otro_frame'.");
            mostrarCreadores();
        break;
        default :
            System.out.println( " PeliculaController : Comando ’" + command + "’ no reconocido.");
        break;
    }
    }
    }
}