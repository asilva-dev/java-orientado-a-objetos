package application;

import entities.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class ProgramFuncionario {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario func = new Funcionario();

        System.out.println("Informations of employee: ");
        System.out.printf("Enter name: ");
        func.name = sc.nextLine();
        System.out.printf("Enter Gross Salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.printf("Enter Tax: ");
        func.tax = sc.nextDouble();

        System.out.printf("Funcionario: " + func.name + ", $ " + func.salFim());


    }
}

