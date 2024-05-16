package model.restaurante;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ListaPedidos {
    private List<Pedido> pedidos = new ArrayList<>();

    public ListaPedidos() {
    }

    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(this.pedidos);
    }

    public List<Pedido> getPedidosPendentes() {
        return Collections.unmodifiableList(
                this.pedidos
                        .stream()
                        .filter(t -> !t.isEntregue())
                        .collect(Collectors.toList()));
    }

    public List<Pedido> getPedidosEntregues() {
        return Collections.unmodifiableList(
                this.pedidos
                        .stream()
                        .filter(t -> t.isEntregue())
                        .collect(Collectors.toList()));
    }

    public void addPedido(Pedido pedido) {
        this.pedidos.add(pedido);
    }

    public int getIndexOf(int id) {
        for (int i = 0; i < this.pedidos.size(); i++) {
            if (pedidos.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public boolean finishPedido(int index) {
        this.pedidos.get(index).entregar();
        return true;
    }

    public boolean getStatusPedido(int index) {
        return this.pedidos.get(index).isEntregue();
    }

    public void removePedido(int index) {
        this.pedidos.remove(index);
    }

    public Pedido getPedido(int index) {
        return this.pedidos.get(index);
    }

    public int size() {
        return this.size();
    }

}
