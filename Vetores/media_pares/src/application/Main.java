package Vetores.media_pares.src.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Quantos elementos vai ter o vetor? ");
            int n = sc.nextInt();
            sc.nextLine();
            double[] vect = new double[n];
            for(int i=0;i<vect.length;i++){
                System.out.print("Digite um numero: ");
                vect[i] = sc.nextDouble();
                sc.nextLine();
            }
            double sum_par = 0;
            int num_pares = 0;
            for(int i=0;i<vect.length;i++){
                if(vect[i]%2==0){
                    sum_par += vect[i];
                    num_pares += 1;
                }
            }

            if(sum_par!=0){
                System.out.printf("MEDIA DOS PARES = %.2f%n", sum_par/num_pares);
            }else{
                System.out.println("NENHUM NUMERO PAR");
            }
        }
    }
}
