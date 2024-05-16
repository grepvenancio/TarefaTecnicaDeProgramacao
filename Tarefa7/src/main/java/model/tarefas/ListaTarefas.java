package model.tarefas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaTarefas {
    private List<Tarefa> tarefas = new ArrayList<Tarefa>();

    public ListaTarefas() {
    }

    public List<Tarefa> getTarefas() {
        return Collections.unmodifiableList(this.tarefas);
    }

    public List<Tarefa> getTarefasPendentes() {
        return Collections.unmodifiableList(
                this.tarefas
                        .stream()
                        .filter(t -> !t.isFinished())
                        .collect(Collectors.toList()));
    }

    public List<Tarefa> getTarefasConcluidas() {
        return Collections.unmodifiableList(
                this.tarefas
                        .stream()
                        .filter(t -> t.isFinished())
                        .collect(Collectors.toList()));
    }

    public void addTarefa(Tarefa tarefa) {
        this.tarefas.add(tarefa);
    }

    public int getIndexOf(String titulo) {
        for (int i = 0; i < this.tarefas.size(); i++) {
            if (tarefas.get(i).getTitulo() == titulo) {
                return i;
            }
        }
        return -1;
    }

    public boolean finishTarefa(int index) {
        this.tarefas.get(index).finishIt();
        return true;
    }

    public boolean getStatusTarefa(int index) {
        return this.tarefas.get(index).isFinished();
    }

    public void removeTarefa(int index) {
        this.tarefas.remove(index);
    }

    public Tarefa getTarefa(int index) {
        return this.tarefas.get(index);
    }

    public int size() {
        return this.size();
    }

}
