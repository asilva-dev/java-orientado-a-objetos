package secao2;

import java.util.Scanner;

public class Aula17EntradaDeDados {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //declarando o recebimento de dados
        String sentence = sc.nextLine(); //Pegando uma sentença
        String x = sc.next(); //coletando valores e amarrando nas variáveis
        String y = sc.next();
        String z = sc.next();
        System.out.println(sentence); //imprimindo esses valores
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        x = sc.next(); //coletando mais tres valores na mesma linha Yellow Pink Orange                                                                  
        y = sc.next();
        z = sc.next();
        System.out.println(x); //imprimindo os 3 separados
        System.out.println(y);
        System.out.println(z);
        sc.close();
    }
}
