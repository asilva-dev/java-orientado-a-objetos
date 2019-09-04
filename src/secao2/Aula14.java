package secao2;

import java.util.Locale;

public class Aula14 {
    public static void main(String[] args) {
        char gender = 'F';
        int age = 31;
        double balance = 10.35784D;
        String name = "Amanda";
        System.out.print("Good Morning!");
        System.out.println("Good Afternoon!");
        System.out.println("Good Night!");
        System.out.println("-----------------------------------");
        System.out.printf("%.2f\n", balance);
        System.out.printf("%.4f\n", balance); //com 4 casas decimais
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", balance); //mudando o separador para ponto
        System.out.println("-----------------------------------");
        System.out.printf("%s is %d years old, gender %c, and got balance =  %.2f bitcoins\n", name, Integer.valueOf(age), gender, balance);
    }
}
