package secao2;

import java.util.Scanner;

public class Ex03_2 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um número inteiro");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("O numero é par!");
        }else{
            System.out.println("O número é ímpar!");
        }

        sc.close();
    }
}
