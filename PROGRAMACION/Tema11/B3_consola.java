
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @version 5/5/2023
 * @author rutvac
 */
public class B3_consola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        
        File f = new File(args[0]);
        
        File n = new File(args[1]);
        try {
            ArrayList linies = new ArrayList();
            Scanner scanner = new Scanner(f);
            
            while (scanner.hasNextLine()) {
                linies.add(scanner.nextLine());
            }
            scanner.close();
            Collections.sort(linies);
            FileWriter w=new FileWriter(n);
            for (Object a : linies) {
                w.write(a+"\n");
            }
            w.close();
            System.out.println("Fitxer '" + f.getName() + "' escrit correctament");

        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Algo ha ocurrido que no tenias previsto");
        }
    }

}
