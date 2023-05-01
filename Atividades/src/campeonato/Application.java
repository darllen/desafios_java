package campeonato;

import campeonato.repository.TimeRepository;

import java.util.ArrayList;
import java.util.Scanner;


public class Application {
    public static void main(String args[]){

        TimeRepository timeRepository = new TimeRepository();
        char opcao;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Nome do time: ");
            String nome = sc.nextLine();

            System.out.print("Estado: ");
            String estado = sc.nextLine();

            System.out.print("Treinador: ");
            String treinador = sc.nextLine();

            System.out.println("---- Pontuação ---- ");
            ArrayList<Integer> pontuacao = new ArrayList<Integer>();
            System.out.print("Pontos ganhos: ");
            pontuacao.add(sc.nextInt());

            System.out.print("Jogos: ");
            pontuacao.add(sc.nextInt());

            System.out.print("Vitórias: ");
            pontuacao.add(sc.nextInt());

            System.out.print("Gols contra: ");
            int golsContra = sc.nextInt();

            System.out.print("Gols pró: ");
            int golsPro = sc.nextInt();

            int saldoGols = golsPro - golsContra;
            pontuacao.add(golsContra);
            pontuacao.add(golsPro);
            pontuacao.add(saldoGols);

            timeRepository.addTime(pontuacao, nome, Estado.valueOf(estado), treinador);

            System.out.print("Inserir outro time? [S/N]: ");
            opcao = sc.next().charAt(0);

            if(opcao != 'S' || opcao == 's'){
                break;
            }

        } while(opcao == 'S' || opcao == 's');

        Scanner sc = new Scanner(System.in);
        System.out.println("\n --- Todos os times --- ");
        timeRepository.printTimes();
        System.out.println(" -- Fim todos os times -- \n");

        System.out.println(" -- Removendo time -- ");
        System.out.print("Nome do time: ");
        timeRepository.deleteTimeByName(
                timeRepository.findByName(
                        sc.nextLine()
                ).getNome()
        );

        System.out.println("\n -- Procurar time -- ");
        System.out.print("Nome do time: ");
        timeRepository.printTime(timeRepository.findByName(sc.nextLine()));


        sc.close();
    }
}
