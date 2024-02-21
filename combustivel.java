package Codigos;

import java.util.Scanner;

public class combustivel {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n=0;
        int alcool=0, gasolina=0, diesel=0;
        while(n != 4){
            n = ler.nextInt();
            
            switch(n){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                case 4:
                    break;
                default:
                    break;

            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcool);
        System.out.printf("Gasolina: %d\n", gasolina);
        System.out.printf("Diesel: %d\n", diesel);

        ler.close();
    }

    
}
