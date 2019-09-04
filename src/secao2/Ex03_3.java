package secao2;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente.

 */

import java.util.Scanner;

public class Ex03_3 {

    public static void main(String[]Args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero inteiro: ");
        int vlr1 = sc.nextInt();

        System.out.println("Insira o segundo numero inteiro: ");
        int vlr2 = sc.nextInt();

        if(vlr1 % vlr2 == 0 || vlr2 % vlr1 == 0){
            System.out.println("São multiplos!");
        }else{
            System.out.println("Não são multiplos!");
        }

        sc.close();

    }
}
