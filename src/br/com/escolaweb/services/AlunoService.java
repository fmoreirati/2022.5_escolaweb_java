package br.com.escolaweb.services;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.escolaweb.model.Aluno;

public class AlunoService extends DAO {

    public void add(Aluno aluno) throws SQLException {
        PreparedStatement stman = null;
        String sql1 = "insert into pessoa (_id, nome, email, data_nasc, senha) values (?,?,?,?,?)";
        String sql2 = "insert into aluno (matricula) values (?)";

        Conectar();
        stman = conn.prepareStatement(sql1);
        stman.setString(1, aluno.getNome());
        stman.execute();
        stman.close();
        conn.close();
    }
}
