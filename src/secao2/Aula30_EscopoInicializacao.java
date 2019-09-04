package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula30_EscopoInicializacao {

    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double price = 400.00;
        System.out.println(price);

        double discount = 0;

        if(price < 200 ){
            discount = price * 0.1;
        }

        System.out.println(price);
        sc.close();
    }
}
