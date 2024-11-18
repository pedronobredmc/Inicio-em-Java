package src.application;
import java.util.Scanner;
import java.util.Locale;
import src.entities.Circle;
public class Main {

    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            Locale.setDefault(Locale.US);
            System.out.println("Enter the radius: ");
            double radius = sc.nextDouble();
            System.out.printf("Circumference: %.2f%n", Circle.circumference(radius));
            System.out.printf("Volume: %.2f%n", Circle.volume(radius));
            System.out.printf("Volume: %.2f%n", Circle.PI);

        }
    }
}