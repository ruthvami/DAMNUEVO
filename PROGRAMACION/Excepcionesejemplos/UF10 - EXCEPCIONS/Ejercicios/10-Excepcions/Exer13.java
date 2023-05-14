/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Luis José Sánchez González
 */
public class Exer13 {

public static void main(String[] args) {
    ArrayList<Exception> excepciones = new ArrayList<Exception>();
    
    excepciones.add(new NumberFormatException());
    excepciones.add(new IOException());
    excepciones.add(new FileNotFoundException());
    excepciones.add(new IndexOutOfBoundsException());
    excepciones.add(new ArithmeticException());
    
    try {
      throw excepciones.get((int)(Math.random() * excepciones.size()));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
}