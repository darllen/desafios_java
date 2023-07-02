package application;

import java.util.Arrays;
import java.util.Scanner;

public class run_alturas {
    public static void main(String args[]){
        Scanner leia = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = leia.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Dados da "+ (i+1) +"ª pessoa: ");
            System.out.print("Nome: ");
            nomes[i] = leia.next();

            System.out.print("Idade: ");
            idades[i] = leia.nextInt();

            System.out.print("Altura: ");
            alturas[i] = leia.nextDouble();


        }
        double sum = Arrays.stream(alturas).sum();
        System.out.printf("Altura média: %.2f%n",sum/n);

        int cont = 0;
        for (int i=0;i<n;i++){
            if (idades[i] < 16){
                cont += 1;
            }
        }
        double percent = (cont * 100.0)/n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percent);

        for (int i=0;i<n;i++){
            if (idades[i] < 16){
                System.out.println(nomes[i]);
            }
        }


        leia.close();
    }
}
