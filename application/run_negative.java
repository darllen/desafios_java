package application;
import java.util.Scanner;

public class run_negative {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int num = leia.nextInt();
        int[] vet = new int[num];

        for (int i = 0; i < num; i++){
            System.out.print("Digite um número: ");
            vet[i] = leia.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");
        for (int i = 0; i < num; i++){
            if (vet[i] < 0) {
                System.out.println(vet[i]);
            }
        }
        leia.close();
    }



}

