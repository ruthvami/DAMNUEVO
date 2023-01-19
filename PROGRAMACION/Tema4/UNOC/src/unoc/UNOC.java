/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unoc;

/**
 *
 * @author rutvac
 */
public class UNOC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=1;
        int notes[][] =new int[5][5];
        
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notes[i][j]=num;
                num++;
                System.out.printf("%3d",notes[i][j]);
            }
            System.out.println(" ");
        }
       
    }
    
}
