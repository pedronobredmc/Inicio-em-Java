package POO.Mercado.application;
import java.util.Locale;
import java.util.Scanner;
import POO.Mercado.entities.Produtos;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        try (Scanner sc = new Scanner(System.in)) {
            Produtos p1 = new Produtos();
            System.out.println("Enter product data: ");
            System.out.print("Name: ");
            p1.nome = sc.nextLine();
            System.out.print("Price: ");
            p1.preco = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            p1.quantidade = sc.nextInt();
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
