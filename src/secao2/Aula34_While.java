package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula34_While {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Insira um número: ");
        Double n1 = sc.nextDouble();

        while(n1 > 0.0){ //Enquanto n1 for maior que 0.0

            Double sr = Math.sqrt(n1); //raiz quadrada
            System.out.printf("%.3f%n", sr);
            System.out.print("Insira outro número: ");
            n1 = sc.nextDouble();
        }

        System.out.print("Número Negativo! ");
    }
}
