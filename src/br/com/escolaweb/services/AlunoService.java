package br.com.escolaweb.services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.util.Encrypt;

public class AlunoService extends DAO {

    public void add(Aluno aluno) throws Exception {
        String id = Encrypt.sha256(aluno.getEmail(), true);
        String matricula = String.valueOf(new Date().getTime());
        aluno.setId(id);
        aluno.setMatricula(matricula);
        // Pessoa
        PessoaService pessoaService = new PessoaService();
        pessoaService.add(aluno);
        // Aluno
        String sql = "insert into aluno (_id, _id_pessoa, matricula) values (?, ?, ?)";
        Conectar();
        PreparedStatement stman = conn.prepareStatement(sql);
        stman.setString(1, Encrypt.sha256(aluno.getId()));
        stman.setString(2, aluno.getId());
        stman.setString(3, matricula);
        stman.execute();
        stman.close();
    }

    public List<Aluno> getAll() throws SQLException {
        List<Aluno> alunos = new ArrayList<>();
        String sql = "SELECT pessoa._id, pessoa.nome, pessoa.email, pessoa.data_nasc, pessoa.cadastro, pessoa.ativo, aluno.matricula, aluno._id as _id_aluno FROM aluno, pessoa WHERE aluno._id_pessoa = pessoa._id;";
        Conectar();
        PreparedStatement stman = conn.prepareStatement(sql);
        ResultSet result = stman.executeQuery();
        while (result.next()) {
            Aluno aluno = new Aluno();
            aluno.setId(result.getString("_id"));
            aluno.setNome(result.getString("nome"));
            aluno.setEmail(result.getString("email"));
            aluno.setMatricula(result.getString("matricula"));
            alunos.add(aluno);
        }
        stman.close();
        return alunos;
    }

}
