package secao2;

/*
Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex2_05 {

    public static void main(String[]Args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça 01: ");
        int peca01 = sc.nextInt();

        System.out.println("Digite a quantidade da peça 01: ");
        int num01 = sc.nextInt();

        System.out.println("Digite o valor da peça 01: ");
        Double vlr01 = sc.nextDouble();

        System.out.println("Digite o código da peça 02: ");
        int peca02 = sc.nextInt();

        System.out.println("Digite a quantidade da peça 02: ");
        int num02 = sc.nextInt();

        System.out.println("Digite o valor da peça 02: ");
        Double vlr02 = sc.nextDouble();

        Double total = num01 * vlr01 + num02 * vlr02;

        System.out.printf("O total a ser pago é : R$ %.2f%n " , total);

        sc.close();



    }
}
