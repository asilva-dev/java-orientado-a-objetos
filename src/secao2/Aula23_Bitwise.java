package secao2;

import java.util.Scanner;

public class Aula23_Bitwise {

    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mask = 32;
        if ((n & mask) != 0) {
            System.out.println("6th bit is true");
        } else {
            System.out.println("6th bit is false");
        }

        sc.close();
    }
}
