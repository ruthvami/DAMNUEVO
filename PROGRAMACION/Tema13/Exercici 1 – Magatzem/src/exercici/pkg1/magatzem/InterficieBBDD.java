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
class InterficieBBDD {

    private Connection conn;

    public InterficieBBDD(Connection conn) throws SQLException {
        this.conn = conn;
    }

    Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

    ResultSet prod = stmt.executeQuery("SELECT * FROM productes");
    ResultSet tot = stmt.executeQuery("SELECT * FROM totals");

    public double suma(boolean bien) throws SQLException {
        double sum = 0;
        if (bien == false) {
            while (prod.next()) {
                if (prod.getInt(4) == 1) {
                    sum += prod.getInt("preu");
                }
            }
        } else {
            while (prod.next()) {
                sum += prod.getInt("preu");
            }
        }
        return sum;
    }

    public double suma() throws SQLException {
        double sum = 0;
        while (prod.next()) {
            if (prod.getInt(4) == 1) {
                sum += prod.getInt("preus");
            }
        }
        return sum;
    }

    public void mostrarProductes() {

    }

    public void inserir(double suma) {
        
    }

    public void mostrarTotals() {

    }

}
