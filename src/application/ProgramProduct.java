package application;

import entities.Product;


import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter products data:");
        System.out.println("Name: ");
        product.name = sc.nextLine();
        System.out.println("Price: ");
        product.price = sc.nextDouble();
        System.out.println("Quantify: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product Data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        //Atualizando a quantidade de produtos
        System.out.println();
        System.out.println("Updated data: " + product);

        //Removendo produtos do estoque
        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        //Atualizando novamente a quantidade de produtos
        System.out.println();
        System.out.println("Updated data: " + product);

        sc.close();
    }
}
