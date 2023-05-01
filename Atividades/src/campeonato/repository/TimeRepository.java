package campeonato.repository;

import campeonato.Estado;
import campeonato.Time;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TimeRepository {

    ArrayList<Time> times = new ArrayList<>();

    public void addTime(ArrayList<Integer> pontuacao, String nome, Estado estado, String treinador){
        if(findByName(nome) == null) {

            Time newTime = new Time(pontuacao, nome, estado, treinador);
            times.add(newTime);
        } else {
            System.out.println("Time já existe!");
        }
    }

    public void printTimes() {
        for (Time t : times) {
            System.out.println("[" + t.getNome() + ", " + Estado.PE + ", " + t.getTreinador() + "]");
            System.out.println("Pontuação: " + t.getPontuacao());
            System.out.println("");
        }
    }

    public void printTime(Time t) {
        System.out.println("[" + t.getNome() + ", " + Estado.PE + ", " + t.getTreinador() + "]");
        System.out.println("Pontuação: " + t.getPontuacao());
        System.out.println("------------------------");

    }

    public void deleteTimeByName(String nome) {
        if(findByName(nome) != null){
            times.remove(findByName(nome));
            System.out.println("deleted!");
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


}
