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

    private final Connection conn;
    private ResultSet prod;
    private ResultSet tot;

    /**
     * Constructor de la clase InterficieBBDD.
     *
     * @param conn conexión a la base de datos.
     */
    public InterficieBBDD(Connection conn) {
        this.conn = conn;
    }

    /**
     * Calcula la suma de los precios de los productos de magatzem.
     *
     * @param bien Indica si se deben considerar todos los productos o solo los
     * activos.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     * @return La suma de los precios de los productos.
     */
    public int suma(boolean bien) {
        int sum = 0;
        try {
            Statement stmt = conn.createStatement();
            prod = stmt.executeQuery("SELECT * FROM productes");

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

        } catch (SQLException e) {
            System.out.println("\nError al introduir la base de dades: " + e.getMessage());
        }
        return sum;
    }

    /**
     * Calcula la suma de los precios de los productos de magatzem.
     *
     * @return La suma de los precios de los productos activos.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    public int suma() {
        int sum = 0;
        try {
            Statement stmt = conn.createStatement();
            prod = stmt.executeQuery("SELECT * FROM productes");

            while (prod.next()) {
                if (prod.getInt(4) == 1) {
                    sum += prod.getInt("preu");
                }
            }

        } catch (SQLException e) {
            System.out.println("\nError al introduir la base de dades: " + e.getMessage());

        }
        return sum;
    }

    /**
     * Inserta un nuevo registro en la tabla 'totals'.
     *
     * @param suma valor a insertar en la tabla 'totals'.
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    public void inserir(int suma) {
        try {
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            tot = stmt.executeQuery("SELECT * FROM totals");

            tot.moveToInsertRow();
            tot.updateString("total", String.valueOf(suma));
            tot.insertRow();

            tot.close();
        } catch (SQLException e) {
            System.out.println("\nError al introduir la base de dades: " + e.getMessage());
        }
        System.out.println("\nTOTALS s'ha actualitzat amb un total de: " + suma);
    }

    /**
     * Muestra los productos almacenados en el magatzem.
     *
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    public void mostrarProductes() {
        try {
            Statement stmt = conn.createStatement();
            prod = stmt.executeQuery("SELECT * FROM productes");

            System.out.println("|----- PRODUCTES DEL MAGATZEM");
            System.out.printf("| %-6s | %-10s | %-6s | %-6s%n", "ID", "NOM", "PREU", "ACTIU");

            while (prod.next()) {
                int id = prod.getInt("id");
                String nom = prod.getString("nom");
                int preu = prod.getInt("preu");
                int actiu = prod.getInt("actiu");
                System.out.printf("| %-6s | %-10s | %-6s | %-6s%n", id, nom, preu, actiu);

            }
        } catch (SQLException e) {
            System.out.println("\nError al introduir la base de dades: " + e.getMessage());
        }

    }

    /**
     * Muestra los registros de la tabla 'totals'.
     *
     * @throws SQLException Si ocurre un error al acceder a la base de datos.
     */
    public void mostrarTotals() {
        try {
            Statement stmt = conn.createStatement();
            tot = stmt.executeQuery("SELECT * FROM totals");
            System.out.println("|----- TAULA TOTALS");
            System.out.printf("| %-6s | %-10s | %-6s%n", "ID", "DATA", "TOTAL");

            while (tot.next()) {
                int id = tot.getInt("id");
                String data = tot.getString("data");
                int total = tot.getInt("total");
                System.out.printf("| %-6s | %-10s | %-6s%n", id, data, total);

            }
        } catch (SQLException e) {
            System.out.println("\nError al introduir la base de dades: " + e.getMessage());
        }
    }

}
