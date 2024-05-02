package model;

public class Nota {
    private Disciplina disciplina;
    private float nota;


    public Nota(Disciplina disciplina, float nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "disciplina=" + disciplina +
                ", nota=" + nota;
    }
}
