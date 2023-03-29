import javax.swing.JOptionPane;

import br.com.escolaweb.controller.AlunoController;
import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.model.Funcionario;

public class App {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno();
            Funcionario funcionario = new Funcionario();
            aluno.setNome("Ana Maria");
            aluno.setEmail("ana@email.com");
            aluno.setSenha("123456");
            AlunoController alunoController = new AlunoController();
            alunoController.cadastrar(aluno);
            JOptionPane.showMessageDialog(null, "Cadastrado!");
        } catch (Exception e) {
            System.err.println("Erro >>> " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.getMessage());
        }
    }
}
