package campeonato;

import campeonato.repository.TimeRepository;

import java.util.ArrayList;


public class Application {
    public static void main(String args[]){

        TimeRepository timeRepository = new TimeRepository();

        ArrayList<Integer> pontuacaoTimeA = new ArrayList<Integer>();
        pontuacaoTimeA.add(7);
        pontuacaoTimeA.add(3);
        pontuacaoTimeA.add(2);
        pontuacaoTimeA.add(8);
        pontuacaoTimeA.add(15);
        pontuacaoTimeA.add(7);
        timeRepository.addTime(pontuacaoTimeA, "Flamengo", Estado.PE, "Theo");

//===================================================
        ArrayList<Integer> pontuacaoTimeB = new ArrayList<Integer>();
        pontuacaoTimeB.add(6);
        pontuacaoTimeB.add(3);
        pontuacaoTimeB.add(2);
        pontuacaoTimeB.add(8);
        pontuacaoTimeB.add(18);
        pontuacaoTimeB.add(10);
        timeRepository.addTime(pontuacaoTimeB, "Corintias", Estado.SP, "Juan");

        timeRepository.printTimes();

//
    }
}
