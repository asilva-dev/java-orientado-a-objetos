package secao2;

import java.util.Scanner;

public class Ex03_6 {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        Double vlr = sc.nextDouble();

        if (vlr <= 25.0D) {
            System.out.println("Intervalo 0,25");
        } else if (vlr <= 50.0D) {
            System.out.println("Intervalo 25, 50");
        } else if (vlr <= 75.0D) {
            System.out.println("Intervalo 50, 75");
        } else if (vlr <= 100.0D) {
            System.out.println("Intervalo 75, 100");
        } else {
            System.out.println("Valor fora dos intervalos");
        }

        sc.close();
    }
}
