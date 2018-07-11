package br.denis.bolao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FabricaConexao {

    private static Connection con;
    private static final String URL_CONNECTION = "jdbc:postresql://localhost/bolao";
    private static final String USER = "root";
    private static final String PASS = "root";

    public static Connection getCon() {
        if (con == null) {
            try {
                Class.forName("com.postgresql.jdbc.Driver");
                con = DriverManager.getConnection(URL_CONNECTION, USER, PASS);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return con;
    }

    public static void fecharConexao() {
        if (con != null) {
            try {
                con.close();
                con = null;
            } catch (SQLException ex) {
                Logger.getLogger(FabricaConexao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
