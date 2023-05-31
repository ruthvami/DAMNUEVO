/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercici.pkg1.magatzem;

import java.sql.*;


/**
 *
 * @author rutvac
 */
class InterficieBBDD  {

    private Connection conn;

    public InterficieBBDD(Connection conn) throws SQLException {
        this.conn = conn;
    }

    Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

        ResultSet rs = stmt.executeQuery("SELECT * FROM productes");
    
  

    public  double suma(boolean bien) throws SQLException {
        if (bien == false) {
            rs.getInt(4);
        }
        return 0;
    }

    public  double suma() {

        return 0;
    }

    public  void mostrarProductes() {

    }

    public  void inserir(double suma) {

    }

    public  void mostrarTotals() {

    }

}
