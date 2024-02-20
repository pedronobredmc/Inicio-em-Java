package Codigos;

import java.util.Scanner;

public class pares_v2 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int count = 0;
        for(int i=0;i<5;i++){
            int n = ler.nextInt();
            if(n%2==0){
                count++;
            }
        }

        System.out.println(count + " valores pares");

        ler.close();
    }
}
