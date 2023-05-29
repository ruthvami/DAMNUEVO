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

            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = stmt.executeQuery("SELECT * FROM venedors");

//            while(rs.next()){
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
//            }
//------------------------
//            rs.last();
//            rs.updateString("Nom", "Kill Bill");
//            rs.updateRow();
//------------------------
//            rs.moveToInsertRow();
//            rs.updateString(2, " Kull Bill");
//            rs.updateInt(4, 156142684);
//            rs.insertRow();
//            rs.moveToCurrentRow();
            rs.absolute(3);
            rs.deleteRow();
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}
