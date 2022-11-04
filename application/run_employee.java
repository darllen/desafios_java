package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class run_employee {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = leia.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Employee #" + i + ": ");

            System.out.print("Id: ");
            int id = leia.nextInt();
            while (hasId(list, id)) {
                System.out.print("Id already taken. Try again: ");
                id = leia.nextInt();
            }

            System.out.print("Name: ");
            leia.nextLine();
            String name = leia.nextLine();
            System.out.print("Salary: ");
            double salary = leia.nextDouble();
            list.add(new Employee(id, name, salary));
        }

        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = leia.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (emp == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percentage = leia.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("\nList of employees:");
        for (Employee obj : list) {
            System.out.println(obj);
        }

        leia.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }
}
