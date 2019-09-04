package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula32_Funcoes {

    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c); //max é uma funcao que traz o maior
        showResult(higher);
        sc.close();
    }

    //funcao max
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;
    }

    //funcao que exibe o resultado
    public static void showResult(int value) {

        System.out.println("Higher = " + value);

    }


}
