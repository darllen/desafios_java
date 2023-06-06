package polimorfismo.atividade;

import java.util.ArrayList;
import java.util.List;

public class DepartamentoPessoal {

    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    public boolean verificarExistenciaFuncionario(Funcionario func){
        return listaFuncionarios.contains(func);
    }

    public void registrarFuncionario(Funcionario func){
        if (verificarExistenciaFuncionario(func) == false){
            this.listaFuncionarios.add(func);
        }
    }

    public int reajustarValorHoraFuncionariosHorario(double aumento){
        int contador = 0;
        for (Funcionario func : this.listaFuncionarios){
            if (func instanceof FuncionarioHorario){
                ((FuncionarioHorario) func).setValorHora(((FuncionarioHorario) func).getValorHora() + aumento);
                contador++;
            }
        }
        return contador;
    }


    public ArrayList<FuncionarioChefe> pesquisarFuncionariosChefeSemAcessor(){
        ArrayList<FuncionarioChefe> lista = new ArrayList<>();

        for (Funcionario func : this.listaFuncionarios){
            if (func instanceof FuncionarioChefe){
                if (((FuncionarioChefe) func).getFuncionarioAcessor() == null){ lista.add((FuncionarioChefe) func); }
            } 
        }
        return lista;
    }

}
