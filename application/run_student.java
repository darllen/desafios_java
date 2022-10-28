package application;

import entities.Student;

import java.util.Scanner;

public class run_student {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);
        Student aluno = new Student();

        aluno.name = leia.nextLine();
        aluno.grade1 = leia.nextDouble();
        aluno.grade2 = leia.nextDouble();
        aluno.grade3 = leia.nextDouble();

        System.out.printf("FINAL GRADE = %.2f%n", aluno.finalGrade());
        System.out.println(aluno.result());

        leia.close();
    }
}
