package Vetores.Soma_vetor.src.application;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos numeros voce vai digitar ? ");
            int n = sc.nextInt();
            double[] vect = new double[n];

            for(int i=0; i< vect.length; i++){
                System.out.print("Digite um numero: ");
                sc.nextLine();
                vect[i]=sc.nextDouble();
            }
            double sum = 0;
            System.out.print("VALORES = ");
            for(int i=0; i<vect.length;i++){
                sum += vect[i];
                System.out.printf("%.2f   ", vect[i]);
            }
            System.out.println();
            System.out.printf("SOMA = %.2f%n", sum);
            System.out.printf("MEDIA = %.2f%n", (sum/vect.length));
        }
    }
}
