package src.entities;

public class Banco {
    //* Atributos
    private String nome;
    private final int numeroConta;
    private double saldo;

    //* Construtores
    public Banco(String nome, int numeroConta){
        this.nome = nome;
        this.numeroConta = numeroConta;
    }
    public Banco(String nome, int numeroConta, double depositoInicial){
        this.nome = nome;
        this.numeroConta = numeroConta;
        deposito(depositoInicial);
    }

    //* Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }

    //* Métodos
    @Override
    public String toString(){
        return "Account "
            + numeroConta
            + ", Holder: "
            + nome
            + ", Balance: $ "
            + String.format("%.2f", saldo);
    }
    public void deposito(double valor){
        saldo += valor;
    }
    public void saque(double valor){
        saldo -= valor + 5.0;
    }
}
