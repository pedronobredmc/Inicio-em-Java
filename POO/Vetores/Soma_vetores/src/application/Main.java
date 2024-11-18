package src.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos valores vai ter cada vetor? ");
            int n = sc.nextInt();
            sc.nextLine();

            int[] vect1 = new int[n];
            int[] vect2 = new int[n];
            int[] vect_resul = new int[n];

            System.out.println("Digite os valores do vetor A:");
            for(int i=0; i<vect1.length;i++){
                vect1[i] = sc.nextInt();
                sc.nextLine();
            }
            System.out.println("Digite os valores do vetor B:");
            for(int i=0; i<vect2.length;i++){
                vect2[i] = sc.nextInt();
                sc.nextLine();
            }
            for(int i=0; i< vect_resul.length;i++){
                vect_resul[i] = vect1[i] + vect2[i];
            }
            System.out.println("VETOR RESULTANTE:");
            for(int i=0; i< vect_resul.length;i++){
                System.out.println(vect_resul[i]);
            }
        }
    }
}
