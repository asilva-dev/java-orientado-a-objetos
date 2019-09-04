package secao2;


import java.util.Scanner;

public class Ex03_5 {

    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o código do produto de 01 a 05:");
        int cod = sc.nextInt();

        System.out.println("Insira o código do produto de 01 a 05:");
        int qtd = sc.nextInt();

        Double vlr = 0.0D;

        if(cod == 01){
             vlr = qtd * 4.00;
             System.out.println("Cachorro Quente!");
        }else if(cod == 02){
            vlr = qtd * 4.50;
            System.out.println("X-Salada!");
        }else if(cod == 03){
            vlr = qtd * 5.00;
            System.out.println("X-Bacon!");
        }else if(cod == 04){
            vlr = qtd * 2.00;
            System.out.println("Torrada SImples!");
        }else if(cod == 05){
            vlr = qtd * 1.50;
            System.out.println("Refrigerante!");
        }else{
            System.out.print("Código inválido!");
        }

        System.out.printf("Total: R$ %.2f%n", vlr);
        sc.close();
    }
}
