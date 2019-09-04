package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Ex03_8 {

    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o salario: ");
        double sal = sc.nextDouble();

        if (sal <= 2000.0D) {
            System.out.println("Voce esta isento de pagar imposto!");
        } else {
            double salTotal;
            if (sal <= 3000.0D) {
                salTotal = (sal - 2000.0D) * 0.08D;
                System.out.printf("O desconto eh: %.2f%n", salTotal);
            } else if (sal <= 4500.0D) {
                salTotal = (sal - 3000.0D) * 0.18D + 80.0D;
                System.out.printf("O desconto eh: %.2f%n", salTotal);
            } else if (sal >= 4501.0D) {
                salTotal = (sal - 4500.0D) * 0.28D + 270.0D + 80.0D;
                System.out.printf("O desconto eh: %.2f%n", salTotal);
            }
        }

        sc.close();
    }
}
