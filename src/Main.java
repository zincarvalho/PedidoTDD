public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.adicionarItem("Produto A", 2, 50.0);
        pedido.adicionarItem("Produto B", 1, 120.0);

        System.out.println("Itens do Pedido:");
        pedido.getItens().forEach(item -> {
            System.out.println("- " + item.getSubtotal());
        });

        System.out.println("Total sem desconto: " + pedido.getTotal());

        pedido.aplicarDesconto();
        System.out.println("Total com desconto: " + pedido.getTotal());
    }
}
