package ejfile;

import java.io.File;
import java.util.Date;

/**
 *
 * @author rutvac
 */
public class Ejfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        File rel1 = new File("/PROGRAMACION/MATH.RANDOM");
//        File rel2 = new File("/DAMNUEVO/LM");
//
//        File abs1 = new File("/home/rutvac/Escritor/DAMNUEVO/PROGRAMACION/a.txt");
//        File abs2 = new File("/home/rutvac/Escritori/DAMNUEVO/LM/3-lm");
//
//        System.out.println("Ruta element:" + rel1.getParent());
//        System.out.println("Nom element:" + rel1.getName());
//        System.out.println("Ruta absoluta:" + rel1.getAbsolutePath() + "\n");
//
//        System.out.println("Ruta element:" + rel2.getParent());
//        System.out.println("Nom element:" + rel2.getName());
//        System.out.println("Ruta absoluta:" + rel2.getAbsolutePath() + "\n");
//
//        System.out.println("Ruta element:" + abs1.getParent());
//        System.out.println("Nom element:" + abs1.getName());
//        System.out.println("Ruta absoluta:" + abs1.getAbsolutePath() + "\n");
//
//        System.out.println("Ruta element:" + abs2.getParent());
//        System.out.println("Nom element:" + abs2.getName());
//        System.out.println("Ruta absoluta:" + abs2.getAbsolutePath() + "\n");

        File a1 = new File("/home/rutvac/Temporal/Fotos");
        File a2 = new File("/home/rutvac/Temporal/Document.txt");

        mostrarEstat(a1);
        mostrarEstat(a2);
        
        codigo(a2);
    }

    public static void mostrarEstat(File f) {
        System.out.println("L'arxiu '" + f.getAbsolutePath() + "' existeix? " + f.isFile());
        System.out.println("La carpeta '" + f.getAbsolutePath() + "' existeix? " + f.isDirectory());
        System.out.println(" ");
    }
    public static void codigo(File f){
        System.out.println(f.length());
        Date fecha=new Date(f.lastModified());
        System.out.println(fecha);
    }
}
