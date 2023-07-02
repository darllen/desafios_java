package aluno;

import java.util.ArrayList;

public class Exercicio02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> anos =
				new ArrayList<>();
		anos.add(2000);
		anos.add(1994);
		anos.add(1998);
		
		for (Integer a : anos) {
			System.out.println(a);
		}
	}
}
