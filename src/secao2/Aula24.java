package secao2;

import java.util.Scanner;

public class Aula24 {

    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is Odd!");
        }

        sc.close();
    }

}
