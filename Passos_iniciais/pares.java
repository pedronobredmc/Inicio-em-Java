import java.util.Scanner;

public class pares {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        int n4 = ler.nextInt();
        int n5 = ler.nextInt();
        
        int count = 0;
        if(n1%2==0){
            count++;
        }
        if(n2%2==0){
            count++;
        }
        if(n3%2==0){
            count++;
        }
        if(n4%2==0){
            count++;
        }
        if(n5%2==0){
            count++;
        }
        
        System.out.println(count + " valores pares");
        ler.close();
    }
    
}
