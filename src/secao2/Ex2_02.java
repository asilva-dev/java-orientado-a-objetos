package secao2;

import java.util.Locale;
import java.util.Scanner;
/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio 2 , Considere o valor de π = 3.14159
 */

public class Ex2_02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double pi = 3.14159D;

        System.out.println("Insira o valor do raio do circulo:");
        double R = sc.nextDouble();

        double Area = pi * R * R;

        //System.out.println();
        System.out.printf("Area do circulo= %.4f%n", Area);

        sc.close();
    }
}
