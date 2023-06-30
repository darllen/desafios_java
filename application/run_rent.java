package application;

import entities.Rent;

import java.util.Scanner;

public class run_rent {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        Rent[] vetor = new Rent[10];

        System.out.print("How many rooms will be rented?");
        int n = leia.nextInt();

        for (int i = 1; i< n+1; i++){
            System.out.println("\nRent #" + i + ": ");
            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Email: ");
            String email = leia.next();
            System.out.print("Room: ");
            int roomNumber = leia.nextInt();

            Rent rent = new Rent(name,email);

            vetor[roomNumber] = rent;
        }
        System.out.println("Busy rooms: ");
        for (int i = 1; i< n+1; i++){
            if (vetor[i] != null){
                System.out.println( i +": " + vetor[i] );
            }
        }

        leia.close();
    }
}
