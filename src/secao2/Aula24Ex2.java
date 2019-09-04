package secao2;

import java.util.Scanner;

public class Aula24Ex2 {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Insira o primeiro numero inteiro: ");
        int n1 = sc.nextInt();

        System.out.printf("Insira o segundo numero inteiro: ");
        int n2 = sc.nextInt();

        System.out.printf("Insira o terceiro numero inteiro: ");
        int n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("Higher = " + n1);
        } else if (n2 > n3) {
            System.out.println("Higher = " + n2);
        } else {
            System.out.println("Higher = " + n3);
        }

        sc.close();
    }

}
