import java.util.Scanner;

public class area_circulo {
    public static void main(String[] args) {
        double pi = 3.14159;
        Scanner ler = new Scanner(System.in);
        double raio, area;
        raio = ler.nextDouble();
        area = ((raio*raio)*pi);
        System.out.printf("A=%.4f\n", area);
        ler.close();
    }

}
