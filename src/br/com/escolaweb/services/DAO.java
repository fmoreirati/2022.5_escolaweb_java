package br.com.escolaweb.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {
    public Connection conn = null;
    private String USER = "root";
    private String HOST = "127.0.0.1";
    private String BASE = "dbescolaweb";
    private String PASS = "";
    private String URL = String.format("jdbc:mysql://%s/%s", HOST, BASE);

    public void Conectar() {
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