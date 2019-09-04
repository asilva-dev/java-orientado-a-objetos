package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula33_Debugging {

    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        for(double n = sc.nextDouble(); n >= 0.0D; n = sc.nextDouble()) {
            double sr = Math.sqrt(n);
            System.out.printf("%.3f%n", sr);
            System.out.print("Enter another number: ");
        }

        System.out.println("Negative Number!");
        sc.close();
    }
}
