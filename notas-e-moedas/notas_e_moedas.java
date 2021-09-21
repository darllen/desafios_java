package Atividade_uri;

import java.util.Scanner;

public class notas_e_moedas {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double valor, nt10, nt5, nt2, nt100, nt50, nt20,
		m1, m50, m25, m10, m5, m01;
		System.out.print("Digite o valor: ");
		valor = read.nextDouble();
		final double valorC = valor;

		//NOTAS
		nt100 = (valor/100);
		valor %= 100;
		nt50 = (valor/50);
		valor %= 50;
		nt20 = (valor/20);
		valor %= 20;
		nt10 = (valor/10);
		valor %= 10;
		nt5 = (valor/5);
		valor %= 5;
		nt2 = (valor/2);
		valor %= 2;
		
		System.out.println("\nPara: R$ "+ valorC);
		System.out.println("\nNOTAS: ");
		System.out.println((int) nt100 + " nota(s) de R$ 100.00");
		System.out.println((int) nt50 + " nota(s) de R$ 50.00");
		System.out.println((int) nt20 + " nota(s) de R$ 20.00");
		System.out.println((int) nt10 + " nota(s) de R$ 10.00");
		System.out.println((int) nt5 + " nota(s) de R$ 5.00");
		System.out.println((int) nt2 + " nota(s) de R$ 2.00");
		
		//MOEDAS
		m1 = (valor/1);
		valor %= 1;
		m50 = (valor/0.50);
		valor %= 0.50;
		m25 = (valor/0.25);
		valor %= 0.25;
		m10 = (valor/0.10);
		valor %= 0.10;
		m5 = (valor/0.05);
		valor %= 0.05;
		m01 = (valor/0.01);
		System.out.println("\nMOEDAS: ");
		System.out.println((int) m1 + " moedas(s) de R$ 1.00");
		System.out.println((int) m50 + " moedas(s) de R$ 0.50");
		System.out.println((int) m25 + " moedas(s) de R$ 0.25");
		System.out.println((int) m10 + " moedas(s) de R$ 0.10");
		System.out.println((int) m5 + " moedas(s) de R$ 0.05");
		System.out.println((int) m01 + " moedas(s) de R$ 0.01");

	}

}

//1021
