package src.entities;

public class Produtos {
    public String nome;
    public double preco;
    public int quantidade;

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

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