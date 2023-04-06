package br.com.escolaweb.services;

import java.sql.SQLException;
import java.util.List;

import br.com.escolaweb.model.Aluno;

public interface AlunoService {
    public void add(Aluno aluno) throws Exception;

    public List<Aluno> get() throws SQLException;

    public Aluno get(String id) throws SQLException;

    public void update(Aluno aluno) throws Exception;

    public void delete(String id) throws Exception;

}
