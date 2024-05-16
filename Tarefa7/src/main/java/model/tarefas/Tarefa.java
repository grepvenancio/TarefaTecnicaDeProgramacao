package model.tarefas;

public class Tarefa {
    private String titulo;
    private String descricao;
    private boolean status = false;

    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinished() {
        return this.status;
    }

    public void finishIt() {
        this.status = true;
    }

    @Override
    public String toString() {
        return String.format(
                "titulo: %s, descricao: %s, completo: %b",
                titulo,
                descricao,
                status);
    }
}
