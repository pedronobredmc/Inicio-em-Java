import java.util.Scanner;

public class maior {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();
        
        if(n1>=n2 && n1>=n3){
            System.out.println(n1 + " eh o maior");
        }else if(n2>=n1 && n2>=n3){
            System.out.println(n2 + " eh o maior");
        }else{
            System.out.println(n3 + " eh o maior");
        }

        ler.close();
    }
    
}
