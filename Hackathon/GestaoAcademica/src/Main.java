import model.Aluno;
import model.Disciplina;
import model.Nota;
import model.Professor;

public class Main {
    public static void main(String[] args) {
        Disciplina engSoft = new Disciplina("Engenharia de software");
        Disciplina devWeb = new Disciplina("Desenvolvimento web");

        Professor galvao = new Professor(0, "Galvao", 65, engSoft);
        Professor eulaliane = new Professor(1, "Eulaliane", 35, devWeb);

        Aluno rafael = new Aluno(3, "Rafael", 70);

        rafael.matricular(engSoft, 0);
        rafael.matricular(devWeb, 0);

        Nota notaEng = new Nota(engSoft, 8.5F);
        galvao.darNota(0, notaEng, rafael);

        Nota notaWeb = new Nota(devWeb, 1.5F);
        eulaliane.darNota(0, notaWeb, rafael);

        rafael.gerarHistorico();
    }
}