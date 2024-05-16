package model.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id;
    private boolean status = false;
    private List<String> items = new ArrayList<>();

    public Pedido(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<String> getItems() {
        return items;
    }

    public void addItems(String... items) {
        for (String item : items) {
            this.items.add(item);
        }
    }

    public boolean isEntregue() {
        return status;
    }

    public void entregar() {
        this.status = true;
    }

    @Override
    public String toString() {
        return String.format(
                "id: %d, items: %s, entregue: %b",
                id,
                items.toString(),
                status);
    }

}
