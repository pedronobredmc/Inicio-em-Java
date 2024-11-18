package POO.Mercado.entities;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    @Override
    public String toString() {
        return "Product data: " + nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " units, Total: $ " + String.format("%.2f", preco * quantidade);
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
}