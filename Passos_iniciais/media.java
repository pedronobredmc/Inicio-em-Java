package Codigos;

import java.util.Scanner;
public class media {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double n1, n2;
        n1 = ler.nextDouble();
        n2 = ler.nextDouble();

        System.out.printf("MEDIA = %.5f\n", (((n1*3.5)+(n2*7.5))/11));

        ler.close();
    }
    
}
