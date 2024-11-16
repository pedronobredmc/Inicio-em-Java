package POO.Aluno.application;
import POO.Aluno.entities.Alunos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Alunos aluno = new Alunos();
            
            System.out.println("Enter the student's name: ");
            aluno.name = sc.nextLine();
            System.out.println("Enter the first grade: ");
            aluno.grade1 = sc.nextDouble();
            System.out.println("Enter the second grade: ");
            aluno.grade2 = sc.nextDouble();
            System.out.println("Enter the third grade: ");
            aluno.grade3 = sc.nextDouble();
            System.out.println(aluno);
        }  
    }
    
}
