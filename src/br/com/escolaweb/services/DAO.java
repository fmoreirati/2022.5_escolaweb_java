package br.com.escolaweb.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {
    public static Connection conn = null;
    private static String USER = "root";
    private static String HOST = "127.0.0.1";
    private static String BASE = "dbescolaweb";
    private static String PASS = "";
    private static String URL = String.format("jdbc:mysql://%s/%s", HOST, BASE);

    public static void Conectar() {
        System.out.println("Conectando ao banco...");
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conectado.");
            // } catch (ClassNotFoundException ex) {
            // System.out.println("Classe não encontrada, adicione o driver nas
            // bibliotecas.");
            // Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException e) {
            System.out.println(e);
            throw new RuntimeException(e);
        }
    }
}