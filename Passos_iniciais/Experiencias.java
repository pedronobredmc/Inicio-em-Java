package Codigos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args){

        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int c=0, r=0, s=0, total=0;
        for(int i=0; i<n; i++){
            int quant = ler.nextInt(); 
            String S = ler.next().toUpperCase();
            switch(S){
                case "C":
                    c+=quant;
                    break;
                case "R":
                    r+=quant;
                    break;
                case "S":
                    s+=quant;
                    break;
                default:
                
            }
            total+=quant;
        }
        DecimalFormat formato = new DecimalFormat("0.00");
        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);
        System.out.println("Percentual de coelhos: " + formato.format((double) c / total * 100) + " %");
        System.out.println("Percentual de ratos: " + formato.format((double) r / total * 100) + " %");
        System.out.println("Percentual de sapos: " + formato.format((double) s / total * 100) + " %");
        ler.close();
    }
}
