import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        /*String name = leia.next();
        int age = leia.nextInt();
        double wage = leia.nextDouble();
        char gender = leia.next().charAt(0); //pega o primeiro caracter da string

        System.out.printf("Nome: %s %n",name);
        System.out.printf("Gênero: %s %n", gender);
        System.out.printf("Idade: %d %n",age);
        System.out.printf("Salário: %.2f %n",wage);


        //ler até a quebra de linha
        String s1, s2, s3;
        s1 = leia.nextLine();
        s2 = leia.nextLine();
        s3 = leia.nextLine();

        System.out.printf("%s%n%s%n%s%n", s1, s2, s3);

        //como limpar o buffer de leitura
        String x1, x2, x3;
        int x;

        x = leia.nextInt();
        leia.nextLine();
        x1 = leia.nextLine();
        x2 = leia.nextLine();
        x3 = leia.nextLine();

        System.out.printf("%d %n%s%n%s%n%s%n",x, x1, x2, x3);


        // Expressão condicional ternária
        int variavel = (2 > 4)?50:80; // se 2 > 4 então a variavel vai receber 50, senao vai receber 80
        System.out.println(variavel);*/

        leia.close(); //vai desalocar o recurso que eu criei
    }



}
