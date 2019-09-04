package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_7 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Insira o primeiro valor: ");
        double n1 = sc.nextDouble();

        System.out.println("Insira o segundo valor: ");
        double n2 = sc.nextDouble();

        if (n1 == 0.0D && n2 == 0.0D) {
            System.out.println("Origem");
        } else if (n1 == 0.0D) {
            System.out.println("Eixo X");
        } else if (n2 == 0.0D) {
            System.out.println("Eixo Y");
        } else if (n1 > 0.0D && n2 > 0.0D) {
            System.out.println("Q1");
        } else if (n1 < 0.0D && n2 > 0.0D) {
            System.out.println("Q2");
        } else if (n1 < 0.0D && n2 < 0.0D) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();

    }

}
