package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula27_2 {

    public static void main(String[] Args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String s = "potato apple lemon";
        String[] vect = s.split(" "); //s.split define o separador, nesse caso é o espaço
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
    }
}
