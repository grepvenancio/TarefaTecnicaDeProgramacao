import model.Aluno;
import model.Emprestimo;
import model.Livro;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Teste");
        Livro livro = new Livro("00001", "Livro Bom");
        aluno.pegarEmprestimo(livro, new Date());
        Emprestimo emp = aluno.getEmprestimos().firstElement();
        emp.devolver();
        System.out.println(emp.isFoiDevolvido());
        System.out.println(aluno.getDebito());
    }
}