package secao2;

import java.util.Locale;
import java.util.Scanner;

public class Aula18EntradaDadosII {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //31
        sc.nextLine();
        String name = sc.nextLine(); //Amanda
        char gender = sc.next().charAt(0); //F
        String s = sc.next(); //b5
        char letter = s.charAt(0); //pegando só o b  charAt() retorna o caractere especificado a partir de uma string.
        int digit = Integer.parseInt(s.substring(1)); //pegando só o 5 da string s "b5"
        double n2 = sc.nextDouble(); //4.32
        String name2 = sc.next(); //pegando segundo nome
        char ch = sc.next().charAt(0);
        int age = sc.nextInt(); //idade 2
        double height = sc.nextDouble(); //1.58
        System.out.println(n1);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(n2);
        System.out.println(name2);
        System.out.println(ch);
        System.out.println(age);
        System.out.println(height);
        sc.close();
    }
}


//Digitar 35 , Bob Brown, F, 5, 4,32, Maria F 23 1.68
