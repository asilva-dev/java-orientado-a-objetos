package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula29_CondicaoTernaria {

    public static void main(String[] Args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o preco: ");
        double preco = sc.nextDouble();

        //Condicao Ternaria
        double desconto = preco < 20.0D ? preco * 0.1D : preco * 0.05D;
        System.out.println("O desconto e: " + desconto);

        sc.close();
    }
}
