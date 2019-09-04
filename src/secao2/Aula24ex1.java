package secao2;

import java.util.Scanner;

public class Aula24ex1 {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What time is it?");
        int time = sc.nextInt();
        if (time < 12) {
            System.out.println("Good Morning!");
        } else if (time < 18) {
            System.out.println("Good Afternoon!");
        } else {
            System.out.println("Good night!");
        }

        sc.close();
    }
}
