package secao2;

import java.util.Locale;

public class Aula14Exercicio {

    public static void main(String[] args) {
        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 31;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0D;
        double price2 = 650.50D;
        double measure = 53.23456700D;
        System.out.printf("Products:\n%s, which price is: $%.2f\n%s, which price is: $ %.2f\n\n", product1, price1, product2, price2);
        System.out.printf("Record: %d years old, code %d and gender is: %c\n\n", Integer.valueOf(age), Integer.valueOf(code), gender);
        System.out.printf("Measure with eight decimal places: %.8f\nRouded(three decimal  places):%.3f\n", measure, measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f", measure);
    }
}
