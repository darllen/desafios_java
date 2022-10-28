package application;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class run_employee {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);
        Employee funcionario = new Employee();

        funcionario.name = leia.nextLine();
        funcionario.grossSalary = leia.nextDouble();
        funcionario.tax = leia.nextDouble();

        System.out.println("Employee: " + funcionario.toString());

        System.out.println("Which porcentage to increase salary? ");
        funcionario.increaseSalary(leia.nextDouble());

        System.out.println("Update data: " + funcionario.toString());


        leia.close();
    }


}
