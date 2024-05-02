package model;

import java.util.Date;

public class Emprestimo {
    private Locatario locatario;
    private Livro livro;
    private Date dtEmprestimo;
    private Date dtDevolucao;
    private Date previsaoDevolução;
    private boolean foiDevolvido = false;

    public Emprestimo(Livro livro, Locatario locatario, Date dtEmprestimo, Date previsaoDevolução) {
        this.livro = livro;
        this.locatario = locatario;
        this.dtEmprestimo = dtEmprestimo;
        this.previsaoDevolução = previsaoDevolução;
    }

    public void devolver() {
        Date dtDevolucao = new Date();
        if (this.locatario instanceof Aluno && dtDevolucao.getTime() > this.previsaoDevolução.getTime()) {
            ((Aluno) this.locatario).multar(10);
        }
        this.dtDevolucao = dtDevolucao;
        this.foiDevolvido = true;
    }

    public Livro getLivro() {
        return livro;
    }

    public boolean isFoiDevolvido() {
        return foiDevolvido;
    }
}
