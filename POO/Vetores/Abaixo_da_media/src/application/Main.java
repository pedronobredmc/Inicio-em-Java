package src.application;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos elementos vai ter o vetor? ");
            int n = sc.nextInt();
            sc.nextLine();

            double[] vect = new double[n];
            for(int i=0;i<vect.length;i++){
                System.out.print("Digite um numero: ");
                vect[i] = sc.nextDouble();
                sc.nextLine();
            }
            double sum = 0;
            for(int i=0;i<vect.length;i++){
                sum+=vect[i];
            }
            double med = sum/vect.length;
            System.out.println("MEDIA DO VETOR = " + med);
            System.out.println("Elementos abaixo da media:");
            for(int i=0;i<vect.length;i++){
                if(vect[i]<med){
                    System.out.println(vect[i]);
                }
            }

        }
    }
}
