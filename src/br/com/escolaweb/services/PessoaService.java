package br.com.escolaweb.services;

import java.sql.PreparedStatement;

import br.com.escolaweb.model.Pessoa;

public class PessoaService extends DAO {

    public void add(Pessoa pessoa) throws Exception {
        String sql1 = "insert into pessoa (_id, nome, email, data_nasc, senha) values (?,?,?,?,?)";
        Conectar();
        PreparedStatement stman = conn.prepareStatement(sql1);
        stman.setString(1, pessoa.getId());
        stman.setString(2, pessoa.getNome());
        stman.setString(3, pessoa.getEmail());
        stman.setDate(4, null, pessoa.getDataNasc());
        stman.setString(5, pessoa.getSenha());
        stman.execute();
        stman.close();
    }

    public void update(Pessoa pessoa) throws Exception {
        String sql1 = "update pessoa set"
                + "_id = ?,"
                + " nome = ?,"
                + " email = ?,"
                + "data_nasc = ?,"
                + "senha = ?"
                + "where _id = ?";
        Conectar();
        PreparedStatement stman = conn.prepareStatement(sql1);
        stman.setString(1, pessoa.getNome());
        stman.setString(2, pessoa.getEmail());
        stman.setDate(3, null, pessoa.getDataNasc());
        stman.setString(4, pessoa.getSenha());
        stman.setString(5, pessoa.getId());
        stman.executeUpdate();
        stman.close();
    }

}
