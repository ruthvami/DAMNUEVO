/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

/**
 *
 * @author rutvac
 */
public class EJemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic hereString url = "jdbc:mysql://localhost:3306/prova";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            String url = "jdbc:mysql://localhost:3306/prova";
            Connection conn = DriverManager.getConnection(url, "root", "");
            Statement stmt =conn.createStatement();
            conn.close();
            stmt.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
