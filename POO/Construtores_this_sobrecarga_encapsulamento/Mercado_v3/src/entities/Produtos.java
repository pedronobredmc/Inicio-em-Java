package src.entities;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    //*Constructors
    public Produtos(){
    }
    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //*Getters and Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //*Methods
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