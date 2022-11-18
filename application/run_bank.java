package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {
    public static void main(String[] args){
        System.out.print("");


        Account acc = new Account(1001, "Alex",1000.0 );
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 10.0, 200.0);

        //UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0 ,500.0);
        Account acc3 = new SavingAccount(1004, "Anna", 1000.0, 0.01);


        //DOWNCASTRING
        BusinessAccount bacc1 = (BusinessAccount) acc2;

        
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc4 = (BusinessAccount) acc3;
            acc4.loan(12);
            System.out.print("Loan!");
        } else if (acc3 instanceof SavingAccount){
            SavingAccount acc4 = (SavingAccount) acc3;
            acc4.updateBalace();
            System.out.println("Update!");
        }

        acc.withDraw(200.0);
        System.out.println("conta normal: " + acc.getBalance());

        acc3.withDraw(200.0);
        System.out.println("conta poupança: " + acc3.getBalance());

        acc2.withDraw(200.0);
        System.out.print("conta business: " + acc2.getBalance());
    }




}
