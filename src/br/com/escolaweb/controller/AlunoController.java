package br.com.escolaweb.controller;

import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.xdevapi.JsonArray;
import com.mysql.cj.xdevapi.JsonParser;
import com.mysql.cj.xdevapi.JsonValue;

import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.services.AlunoService;

public class AlunoController {

    public void cadastrar(Aluno aluno) throws Exception {
        if (aluno.getNome().equals(null)) {
            throw new Exception("Nome embranco!");
        }

        if (aluno.getEmail().equals(null)) {
            throw new Exception("E-mail embranco!");
        } else if (aluno.getEmail().indexOf("@") == -1
                || aluno.getEmail().indexOf(".") == -1) {
            throw new Exception("E-mail invalida!");
        }

        if (aluno.getSenha().equals(null)) {
            throw new Exception("Senha embranco!");
        } else if (aluno.getEmail().length() < 8) {
            throw new Exception("Senha invalida!");
        }

        // if (aluno.getDataNasc().equals(null)) {
        // throw new Exception("Data de nascimento embranco!");
        // }

        AlunoService alunoservice = new AlunoService();
        alunoservice.add(aluno);
    }

    public List<Aluno> list() throws SQLException {
        AlunoService alunoservice = new AlunoService();
        List<Aluno> alunos = alunoservice.get();
        return alunos;
    }

    public Aluno get(String id) throws SQLException {
        AlunoService alunoservice = new AlunoService();
        return alunoservice.get(id);
    }
}
