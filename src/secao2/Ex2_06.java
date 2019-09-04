package secao2;
/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex2_06 {

    public static void main(String[]Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero float: ");
        Double n1 = sc.nextDouble();

        System.out.println("Insira o segundo numero float: ");
        Double n2 = sc.nextDouble();

        System.out.println("Insira o terceiro numero float: ");
        Double n3 = sc.nextDouble();

        double triangulo = n1 * n3 / 2.0D;
        double circulo = 3.14159D * n3 * n3;
        double trapezio = (n1 + n2) / 2.0D * n3;
        double quadrado = n2 * n2;
        double retangulo = n1 * n2;
        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);
        sc.close();
    }
}
