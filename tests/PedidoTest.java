import org.junit.Test; // Importa o suporte ao JUnit para criar testes
import static org.junit.Assert.*; // Importa métodos para asserções

public class PedidoTest {

    @Test
    public void deveAdicionarUmItemAoPedido() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Produto A", 2, 50.0);
        assertEquals(1, pedido.getItens().size());
    }

    @Test
    public void deveCalcularSubtotalDoItem() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Produto A", 3, 20.0);
        Item item = pedido.getItens().get(0);
        assertEquals(60.0, item.getSubtotal());
    }

    @Test
    public void deveCalcularTotalDoPedidoSemDesconto() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Produto A", 2, 50.0); // Subtotal: 100.0
        pedido.adicionarItem("Produto B", 1, 120.0); // Subtotal: 120.0
        assertEquals(220.0, pedido.getTotal());
    }

    @Test
    public void deveAplicarDescontoAoPedido() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Produto A", 2, 100.0); // Subtotal: 200.0
        pedido.aplicarDesconto();
        assertEquals(180.0, pedido.getTotal());
    }
}
