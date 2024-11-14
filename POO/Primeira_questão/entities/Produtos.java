public class Produtos {
    String nome;
    double preco;
    int quantidade;

    /*public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }*/

    public String toString() {
        return ("Product data: " + nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " units, Total: $ " + String.format("%.2f", preco * quantidade));
    }

    public void addProduto(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removeProduto(int quantidade) {
        this.quantidade -= quantidade;
    }
}
