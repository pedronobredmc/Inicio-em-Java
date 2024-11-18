package src.application;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Locale.setDefault(Locale.US);
            System.out.print("Quantos numeros voce vai digitar ? ");
            int n = sc.nextInt();
            sc.nextLine();

            double[] vect = new double[n];

            for(int i=0;i<vect.length;i++){
                System.out.print("Digite um numero: ");
                vect[i]= sc.nextDouble();
                sc.nextLine();
            }

            double maior=vect[0];
            for(int i=0;i<vect.length;i++){
               maior =  Math.max(vect[i], maior);
            }
            System.out.println("MAIOR VALOR = " + maior);
            for(int i=0;i<vect.length;i++){
                if(maior==vect[i]){
                    System.out.println("POSICAO DO MAIOR VALOR = " + i);
                }
            }
        }
    }
}
