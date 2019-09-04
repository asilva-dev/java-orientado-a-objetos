package secao2;

import java.util.Scanner;

public class Ex03_1 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro:");
        int n1 = sc.nextInt();

        if(n1 < 0){
            System.out.println("O numero inserido é negativo");
        }else
        {
            System.out.println("O número inserido é positivo");
        }

        sc.close();

    }
}

