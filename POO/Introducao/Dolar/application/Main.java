package application;
import util.CurrencyConverter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("What is the dollar price ? ");
            double precoDolar = sc.nextDouble();
            System.out.print("How many dollars will be bought ? ");
            double quantidadeDolar = sc.nextDouble();
            System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.dollarToReal(quantidadeDolar, precoDolar));
        }
    }
}
