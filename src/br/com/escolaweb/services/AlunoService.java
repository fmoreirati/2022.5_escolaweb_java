package br.com.escolaweb.services;

import br.com.escolaweb.model.Aluno;

public class AlunoService extends DAO {

    public void add(Aluno aluno) {
        String sql1 = "insert into pessoa (_id, nome, email, data_nasc, senha) values (?,?,?,?,?)";
        String sql2 = "insert into aluno (matricula) values (?)";
        Conectar();

    }
}
