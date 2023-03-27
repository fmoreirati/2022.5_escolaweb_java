import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.model.Funcionario;
import br.com.escolaweb.model.Pessoa;
import br.com.escolaweb.services.DAO;

public class App {
    public static void main(String[] args) throws Exception {

        Aluno aluno = new Aluno();
        Funcionario funcionario = new Funcionario();

        // Pessoa pessoa = new Pessoa();

        DAO dao = new DAO();
        dao.Conectar();

    }
}
