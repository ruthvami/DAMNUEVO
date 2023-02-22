/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test2;

/**
 *
 * @author rutvac
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Test<String, Integer> obj = new Test("GFG",15);
        Test<String, Integer> object = new Test("asdfghjklñ",1234567890);
        obj.print();
        object.print();
    }

}
