package src.application;
import java.util.Scanner;
import src.entities.Banco;
import java.util.Scanner;
public class Main {
    public static void main (String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Banco conta;
            System.out.print("Enter account number: ");
            int numeroConta = sc.nextInt();
            System.out.print("Enter account holder: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Is there an initial deposit (y/n)? ");
            char resposta = sc.next().charAt(0);
            if(resposta == 'y' || resposta == 'Y' || resposta == 's' || resposta == 'S'){
                System.out.print("Enter initial deposit value: ");
                double depositoInicial = sc.nextDouble();
                conta = new Banco(nome, numeroConta, depositoInicial);
            }else{
                conta = new Banco(nome, numeroConta);
            }
            System.out.println("Account data:");
            System.out.println(conta);

            System.out.print("Enter a deposit value: ");
            double deposito = sc.nextDouble();
            conta.deposito(deposito);
            System.out.println("Updated account data:");
            System.out.println(conta);

            System.out.print("Enter a withdraw value: ");
            double saque = sc.nextDouble();
            conta.saque(saque);
            System.out.println("Updated account data:");
            System.out.println(conta);
        }
    }
}
