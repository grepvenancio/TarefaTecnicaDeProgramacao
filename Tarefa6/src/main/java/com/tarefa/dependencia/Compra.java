package com.tarefa.dependencia;

public class Compra {
    private int id;
    private String[] produtos;
    private boolean finalizado = false;

    public Compra(int id, String... produtos) {
        this.id = id;
        this.produtos = produtos;
    }

    public void finalizarCompra(Cupom cupom) {
        finalizado = true;
    }

    public boolean isFinalizado() {
        return finalizado;
    }
}
