/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosss;

/**
 *
 * @author rutvac
 */
public class Dosss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
        int num=0,sum=0,total=0,sum2=0;
        int matri[][]=new int[4][5];
        
        for (int i = 0; i <matri.length; i++) {
          for (int j = 0; j < matri[i].length; j++) {
                num=(int)(Math.random()*900)+100;
                matri[i][j]=num;
                System.out.print("\t"+matri[i][j]);
                sum+=matri[i][j];
                
                
            }
            System.out.print(" "+"|");
            System.out.print(" "+sum);
            System.out.print("\n");
            total+=sum;
            sum=0;
            
        }
        
        
        System.out.println(" "+"--------------------------------------------------------");
        for (int j = 0; j <matri.length; j++) {
            for (int i = 0; i < matri.length; i++) {
                sum2+=matri[j][i];
                
            }
            System.out.print("\t"+sum2);
            sum2=0;
        }
    }
    
}
