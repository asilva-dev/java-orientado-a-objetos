package secao2;

import java.util.Scanner;

public class Ex2_01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o 1° numero inteiro:");
        int som1 = sc.nextInt();

        System.out.println("Informe o 2° numero:");
        int som2 = sc.nextInt();

        int resultado = som1 + som2;
        System.out.printf("A soma dos numeros é: %d ]!", resultado);
        sc.close();
    }
}
