import model.restaurante.ListaPedidos;
import model.restaurante.Pedido;
import model.tarefas.ListaTarefas;
import model.tarefas.Tarefa;

class Main {

    public static void main(String[] args) {
        Main.listaTarefas();
        Main.pedidosRestaurante();
    }

    static void listaTarefas() {
        var listaTODOS = new ListaTarefas();
        for (int i = 0; i < 5; i++) {
            var titulo = String.format("tarefa n - %d", i);
            var descricao = String.format("%d⁰ tarefa!", i);
            var tarefa = new Tarefa(titulo, descricao);
            listaTODOS.addTarefa(tarefa);
        }
        System.out.println("->> Tarefas Pendentes: ");
        for (Tarefa tarefa : listaTODOS.getTarefasPendentes()) {
            System.out.println(tarefa);
        }
        listaTODOS.finishTarefa(0);
        listaTODOS.finishTarefa(2);
        listaTODOS.finishTarefa(3);
        listaTODOS.removeTarefa(2);
        System.out.println("->> Tarefas Concluidas: ");
        for (Tarefa tarefa : listaTODOS.getTarefasConcluidas()) {
            System.out.println(tarefa);
        }
    }

    static void pedidosRestaurante() {
        var listaPedidos = new ListaPedidos();
        for (int i = 0; i < 5; i++) {
            var pedido = new Pedido(i);
            pedido.addItems("Pizza", "Coca cola");
            listaPedidos.addPedido(pedido);
        }
        System.out.println("->> Pedidos Pendentes: ");
        for (Pedido pedido : listaPedidos.getPedidosPendentes()) {
            System.out.println(pedido);
        }
        listaPedidos.finishPedido(0);
        listaPedidos.finishPedido(3);
        System.out.println("->> Pedidos Concluidas: ");
        for (Pedido pedido : listaPedidos.getPedidosEntregues()) {
            System.out.println(pedido);
        }
    }
}
