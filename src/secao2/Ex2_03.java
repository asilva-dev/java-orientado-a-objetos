package secao2;

/*
Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex2_03 {
    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro numero inteiro:");
        int n1 = sc.nextInt();

        System.out.println("Insira o segundo numero inteiro:");
        int n2 = sc.nextInt();

        System.out.println("Insira o terceiro numero inteiro:");
        int n3 = sc.nextInt();

        System.out.println("Insira o quarto numero inteiro:");
        int n4 = sc.nextInt();

        int diferenca = n1 * n2 - n3 * n4;
        System.out.println("Diferenca = " + diferenca);
        sc.close();
    }
}
