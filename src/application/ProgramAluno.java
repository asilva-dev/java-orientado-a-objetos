package application;

import entities.Aluno;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        System.out.println("Insira a nota do primeiro semestre: ");
        aluno.nota1 = sc.nextDouble();

        System.out.println("Insira a nota do segundo semestre: ");
        aluno.nota2 = sc.nextDouble();

        System.out.println("Insira a nota do terceiro semestre: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: " + aluno.notaFinal() + "%n");
        aluno.aprovacao();
    }
}
