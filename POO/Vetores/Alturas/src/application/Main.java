package src.application;
import java.util.Locale;
import java.util.Scanner;
import src.entities.Pessoa;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Locale.setDefault(Locale.US);
            System.out.print("Quantas pessoas serao digitadas ? ");
            int n = sc.nextInt();
            sc.nextLine();
            Pessoa[] vect = new Pessoa[n];

            for(int i=0; i<vect.length; i++){
                System.out.println("Dados da " + (i+1) + "a pessoa:");
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Idade: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.print("Altura: ");
                double altura = sc.nextDouble();
                sc.nextLine();
                vect[i] = new Pessoa(nome, idade, altura);
            }
            System.out.println();
            double soma_altura=0;
            double menores=0;
            for(int i=0; i<vect.length; i++){
                soma_altura += vect[i].getAltura();
                if(vect[i].getIdade()<16){
                    menores += 1;
                }
            }

            System.out.printf("Altura média: %.2f%n", (soma_altura/vect.length));
            System.out.println("Pessoas com menos de 16 anos: " + (menores/vect.length)*100 + "%");

            for(int i=0; i<vect.length; i++){
                if(vect[i].getIdade()<16){
                    System.out.println(vect[i].getNome());
                }
            }

        }
    }
}
