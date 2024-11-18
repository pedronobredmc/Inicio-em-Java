package src.application;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Quantos numeros voce vai digitar ? ");
            int n = sc.nextInt();
            int[] vect = new int[n];

            for(int i=0; i<vect.length; i++){
                System.out.println("Digite um numero: ");
                sc.nextLine();
                vect[i] = sc.nextInt();
            }
            System.out.println("NUMEROS NEGATIVOS:");
            for(int i=0; i< vect.length; i++){
                if(vect[i]<0){
                    System.out.println(vect[i]);
                }
            }
        }
    }
}