package Vetores.Pares.src.application;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Quantos numeros voce vai digitar ? ");
            int n = sc.nextInt();
            int[] vect = new int[n];
            for(int i=0; i<vect.length; i++){
                System.out.print("Digite um numero: ");
                sc.nextLine();
                vect[i]=sc.nextInt();
            }
            int quant_pares=0;
            for(int i=0; i<vect.length; i++){
                if(vect[i]%2==0){
                    quant_pares+=1;
                    System.out.print(vect[i] + "   ");
                }
            }
            System.out.println();
            System.out.println("QUANTIDADE DE PARES = " + quant_pares);
        }
    }
}
