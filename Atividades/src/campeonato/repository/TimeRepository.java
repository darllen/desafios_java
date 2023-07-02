package campeonato.repository;

import campeonato.Estado;
import campeonato.Time;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TimeRepository {

    private ArrayList<Time> times = new ArrayList<>();

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
            System.out.println(t);

        }
    }

    public void printTime(Time t) {
        System.out.println(t);

    }

    public void deleteTimeByName(String nome) {
        nome = nome.toLowerCase();
        if(findByName(nome) != null){
            if(findByName(nome).getPontuacao().get(1) == 0){
                times.remove(findByName(nome));
                System.out.println("deleted!");
            } else { System.out.println("Time já atuou no campeonato, não é possível remover");}
        } else { System.out.println("Time não existe!");}
    }

    public Time findByName(String nome) {
        for (Time time : times) {
            if(time.getNome().equalsIgnoreCase(nome)) {
                return time;
            }
        }
        return null;
    }

//    public List<Time> findAll() {
//        List<Time> listaTimes = new ArrayList<>();
//        times.sort(Comparator.comparing(Time::getNome));
//        for (Time time : times) {
//            listaTimes.add(time);
//        }
//        return listaTimes;
//    }


}
