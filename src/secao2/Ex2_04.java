package secao2;

import java.util.Locale;
import java.util.Scanner;

/*
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.
 */

public class Ex2_04 {
    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo do funcionario:");
        int cod = sc.nextInt();

        System.out.println("Horas trabalhadas no mês: ");
        int hrs = sc.nextInt();

        System.out.println("Valor recebido por hora: ");
        double vlr = sc.nextDouble();

        double salario = (double)hrs * vlr;
        System.out.println("Funcionario N°: " + cod);
        System.out.printf("Salario = U$ %.2f%n ", salario);
        sc.close();
    }
}
