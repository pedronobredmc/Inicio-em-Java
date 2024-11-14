import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner Ler = new Scanner(System.in);
        int a, b;
        a = Ler.nextInt();
        b = Ler.nextInt();
        System.out.printf("X = %d\n", (a + b));
        Ler.close();
    }
}
