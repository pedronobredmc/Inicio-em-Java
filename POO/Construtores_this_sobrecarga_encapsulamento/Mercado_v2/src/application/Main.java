package src.application;
import java.util.Locale;
import java.util.Scanner;
import src.entities.Produtos;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            String nome = sc.nextLine();
            System.out.print("Price: ");
            double preco = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            int quantidade = sc.nextInt();
            Produtos p1 = new Produtos(nome, preco, quantidade);
            System.out.println(p1);
            System.out.println("Enter the number of products to be added in stock: ");
            p1.addProduto(sc.nextInt());
            System.out.println(p1);
            System.out.println("Enter the number of products to be removed in stock: ");
            p1.removeProduto(sc.nextInt());
            System.out.println(p1);
        }
    }
}