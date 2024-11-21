import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens = new ArrayList<>();
    private boolean aplicarDesconto = false;

    public void adicionarItem(String nome, int quantidade, double precoUnitario) {
        Item item = new Item(nome, quantidade, precoUnitario);
        itens.add(item);
    }

    public List<Item> getItens() {
        return itens;
    }

    public double getTotal() {
        double total = itens.stream().mapToDouble(Item::getSubtotal).sum();
        if (aplicarDesconto && total > 200.0) {
            total *= 0.9; // Aplica 10% de desconto
        }
        return total;
    }

    public void aplicarDesconto() {
        this.aplicarDesconto = true;
    }
}
