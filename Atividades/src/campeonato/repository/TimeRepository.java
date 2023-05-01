package campeonato.repository;

import campeonato.Estado;
import campeonato.Time;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TimeRepository {

    ArrayList<Time> times = new ArrayList<>();


    //aqui vai chegar uma lista de pontos e vai add ao novo time que tá sendo criado
    public void addTime(ArrayList<Integer> pontuacao, String nome, Estado estado, String treinador){
        if(findByName(nome) == null) {

            Time newTime = new Time(pontuacao, nome, estado, treinador);
            times.add(newTime);
        } else {
            System.out.println("Time já existe!");
        }
    }

    public Time findByName(String nome) {
        for (Time time : times) {
            if(time.getNome().equals(nome)) {
                return time;
            }
        }
        return null;
    }

    public List<Time> findAll() {
        List<Time> listaTimes = new ArrayList<>();
        times.sort(Comparator.comparing(Time::getNome));
        for (Time time : times) {
            listaTimes.add(time);
        }
        return listaTimes;
    }

    public void printTimes() {
        for (Time t : times) {
            System.out.println("Nome: " + t.getNome());
            System.out.println("Estado: " + Estado.PE);
            System.out.println("Treinador: " + t.getTreinador());
            System.out.println("Pontuação: " + t.getPontuacao());
            System.out.println("------------------------");
        }
    }

    public void deleteTimeByName(String name) {
        for (Time t : times) {
            System.out.println("Nome: " + t.getNome());
            System.out.println("Estado: " + Estado.PE);
            System.out.println("Treinador: " + t.getTreinador());
            System.out.println("Pontuação: " + t.getPontuacao());
            System.out.println("------------------------");
        }
    }


}
