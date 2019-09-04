package secao5;

import java.util.Locale;
import java.util.Scanner;

public class Aula69_Vetores {

    public static void main(String[]Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o total de alturas a serem lidas: ");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for(int i = 0; i < n; i++){
            System.out.println("Insira a altura: ");
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;

        for (int i=0; i<n; i++){
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.println("Average Height: " + avg);

        sc.close();

    }
}
