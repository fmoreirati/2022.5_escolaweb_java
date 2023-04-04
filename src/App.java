import javax.swing.JOptionPane;

import br.com.escolaweb.controller.AlunoController;
import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.model.Funcionario;

public class App {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        try {
            AlunoController alunoController = new AlunoController();
            Aluno aluno = new Aluno();

            // Cadastrar alunos
            aluno.setId("a9fuwqQbEesGihT8/cgGLjmCPA82MPN/9OBaeWF9WGQ=");
            aluno.setNome("Pedro Costa");
            aluno.setEmail("pedro@email.com");
            aluno.setSenha("123456");
            aluno.setMatricula("123456");
            alunoController.cadastrar(aluno);

            // alunoController.remove(aluno);

            JOptionPane.showMessageDialog(null, "Cadastrado!");

            // Listar Alunos
            String result = "";
            for (Aluno a : alunoController.list()) {
                result += ""
                        + a.getId() + "; "
                        + a.getNome() + "; "
                        + a.getEmail() + "; "
                        + a.getMatricula() + "; "
                        + a.getDataNasc() + "; "
                        + a.getSenha() + "; "
                        + a.getMatricula() + ";"
                        + "\n";
            }
            JOptionPane.showMessageDialog(null, result);
        } catch (Exception e) {
            System.err.println("Erro >>> " + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.getMessage());
        }
    }
}
