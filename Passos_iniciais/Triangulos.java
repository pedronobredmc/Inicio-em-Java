import java.util.Scanner;

public class Triangulos {
    public static void main(String[] args) {
        double a=0, b=0, c=0;
        double aux=0;
        Scanner ler = new Scanner(System.in);
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        if(c>a){
            aux = a;
            a = c;
            c = aux;
        }
        if(b>a){
            aux = a;
            a = b;
            b = aux;
        }
        if(c>b){
            aux = c;
            c = b;
            b = aux;
        }
        
        if(a >= (b+c)){
            System.out.println("NAO FORMA TRIANGULO");
        }else if((a*a) == ((b*b)+(c*c))){
            System.out.println("TRIANGULO RETANGULO");
        }else{
            if((a*a) > ((b*b)+(c*c))){
                System.out.println("TRIANGULO OBTUSANGULO");
            }else if((a*a) < ((b*b)+(c*c))){
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if(a == b && b == c){
                System.out.println("TRIANGULO EQUILATERO");
            }else if(a == b || b == c || a == c){
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    
        ler.close();
    }
    
}
