package application;

import entities.Retangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRetangle {

    public static void main(String[] Args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle novo;
        novo = new Retangle();

        System.out.println("Enter the width of triangle: ");
        novo.width = sc.nextDouble();

        System.out.println("Enter the height of triangle: ");
        novo.height = sc.nextDouble();

        double xArea = novo.area();
        double xPerimeter = novo.perimeter();
        System.out.printf("Retangle area: %.2f%n", xArea);
        System.out.printf("Retangle perimeter: %.2f%n", xPerimeter);
    }
}
