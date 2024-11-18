package POO.Aluno.entities;

public class Alunos {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double finalGrade() {
        return grade1 + grade2 + grade3;
    }
    
    public boolean isApproved() {
        return finalGrade() >= 60.0;
    }
    @Override
    public String toString() {
        if(!isApproved()){
            return "Name: "+ name + "\nFinal Grade: " + String.format("%.2f", finalGrade()) + "\n" + (isApproved() ? "PASS" : "FAILED") + "\nMISSING " + String.format("%.2f", 60.0 - finalGrade()) + " POINTS";
        }else{
            return "Name: "+ name + "\nFinal Grade: " + String.format("%.2f", finalGrade()) + "\n" + (isApproved() ? "PASS" : "FAILED");
        }
    }
}
