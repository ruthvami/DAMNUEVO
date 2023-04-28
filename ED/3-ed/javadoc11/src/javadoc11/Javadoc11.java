/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javadoc11;

import javax.swing.JOptionPane;

/**
 *
 * @author rutvac
 */
public class Javadoc11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int idioma=0, nativo=0,numeroAlumnos;
        String nombre="";
        Profesor profe = new Profesor(nombre, idioma, nativo);
        String[] idiomas = {"Frances","Ingles","aleman"};
        
        String niv, n;
        Alumno alums[];
        Alumno a;
  
            nombre = JOptionPane.showInputDialog(null, "Introduce el nombre del Profesor, por favor");
            nativo = JOptionPane.showConfirmDialog(null, "¿Es nativo?", "Seleccione la opcion deseada", JOptionPane.YES_NO_OPTION);
            idioma = JOptionPane.showOptionDialog(null, "Introduce el idioma del profesor, por favor ", "Genero ", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, idiomas, idiomas[0]);
            profe.SetNombre(nombre);
            profe.SetIdioma(idioma);
            profe.SetNativo(nativo);
            
            numeroAlumnos=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el numero de alumnos del profesor, por favor"));
            alums = new Alumno[numeroAlumnos];
            
            for (int i=0; i<numeroAlumnos; i++)
            {
                n = JOptionPane.showInputDialog(null, "Introduce el nombre del alumno, por favor");
                niv = JOptionPane.showInputDialog(null, "Introduce el nivel del alumno, por favor");
               
                a = new Alumno(niv, n);
                alums[i]= a;               
                
            }
            
        JOptionPane.showMessageDialog(null, profe);
        for(int i = 0; i<numeroAlumnos; i++){
        
            JOptionPane.showMessageDialog(null, alums[i]);
        }
                    
    }
    
}


