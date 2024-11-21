public class Item {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Item(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal() {
        return quantidade * precoUnitario;
    }
}
