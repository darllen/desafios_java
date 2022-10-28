package application;

import entities.Product;

import java.util.Scanner;

public class run_product {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        System.out.println("Enter product data: ");
        String name = leia.nextLine();
        double price = leia.nextDouble();


        Product produto = new Product(name, price);
        produto.setName("Radio");

        System.out.println("Product data: " + produto.toString());
        System.out.println();

        System.out.print("Enter the number of product to be added in stock: ");
        int quantAdd = leia.nextInt();
        produto.addProducts(quantAdd);
        System.out.println("Updated data: " + produto.toString());

        System.out.println();
        System.out.print("Enter the number of product to be removed from stock: ");
        int quantRemove = leia.nextInt();
        produto.removeProducts(quantRemove);
        System.out.println("Updated data: " + produto.toString());
        System.out.println("Updated name: " + produto.getName());

        leia.close();
    }
}
