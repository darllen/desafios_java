package application;

import entities.Account;

import java.util.Scanner;

public class run_account {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = leia.nextInt();
        System.out.print("Enter account holder: ");
        leia.nextLine();
        String accountHolder = leia.nextLine();

        System.out.print("Is there na initial deposit[Y/N]? ");
        char c = leia.next().charAt(0);
        leia.nextLine();
        char ask = Character.toUpperCase(c);
        Account conta;
        if (ask == 'Y'){
            System.out.print("Enter initial deposit value: ");
            double initialValue = leia.nextDouble();
            conta = new Account(accountNumber, accountHolder, initialValue);
        } else {
            conta = new Account(accountNumber, accountHolder);
        }

        System.out.println("\nAccount data: \n" + conta.toString());
        System.out.print("testee" + conta.getHolder());

        System.out.print("Enter a deposit value: ");
        double depositValue = leia.nextDouble();
        conta.addBalance(depositValue);
        System.out.println("\nUpdate account data: \n" + conta.toString());

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = leia.nextDouble();
        conta.removeBalance(withdrawValue);
        System.out.println("\nUpdate account data: \n" + conta.toString());

        leia.close();
    }
}
