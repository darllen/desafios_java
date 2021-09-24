package Atividade2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class imc {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		DecimalFormat deci = new DecimalFormat("0.0");
		double peso, imc, quilos, pesoIdeal;
		double altura;
		String opcao = "S";

		while (opcao == "S"){
			System.out.print("Peso em Kg: ");
			peso = leia.nextDouble();
			System.out.print("Altura em m: ");
			altura = leia.nextDouble();

			imc = (peso / Math.pow(altura, 2));
			System.out.println("\nIMC =  " + deci.format(imc));

			if (imc < 18.5) {
				System.out.println("\nSituação: Abaixo do peso");
				pesoIdeal = 19 * Math.pow(altura, 2);
				quilos = pesoIdeal - peso;
				System.out.println("Para peso ideal faltam " + deci.format(quilos) + " Kg");

			} else if ((imc > 18.9) && (imc < 24.9)) {
				System.out.println("\nSituação: Peso ideal");

			} else if ((imc > 25) && (imc < 29.9)) {
				System.out.println("\nSituação: Sobrepeso");
				pesoIdeal = 24.8 * Math.pow(altura, 2);
				quilos = peso - pesoIdeal;
				System.out.println("Para peso ideal perder " + deci.format(quilos) + " Kg");

			} else if ((imc > 30) && (imc < 34.9)) {
				System.out.println("\nSituação: Obesidade grau I");
				pesoIdeal = 24.8 * Math.pow(altura, 2);
				quilos = peso - pesoIdeal;
				System.out.println("Para peso ideal perder " + deci.format(quilos) + " Kg");

			} else if ((imc > 35) && (imc < 39.9)) {
				System.out.println("\nSituação: Obesidade severa grau II");
				pesoIdeal = 24.8 * Math.pow(altura, 2);
				quilos = peso - pesoIdeal;
				System.out.println("Para peso ideal perder " + deci.format(quilos) + " Kg");

			} else if (imc >= 40) {
				System.out.println("\nSituação: Obesidade mórbida grau III");
				pesoIdeal = 24.8 * Math.pow(altura, 2);
				quilos = peso - pesoIdeal;
				System.out.println("Para peso ideal perder " + deci.format(quilos) + " Kg");
			}
			System.out.print("\nCalcular novamente? [S/N] ");
			opcao = leia.next();
		}
	}

}
