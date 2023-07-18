import java.util.ArrayList;

public class Frota {
    private ArrayList<Veiculo> veiculos;


    public void cadastrarVeiculo(Veiculo veiculo) {
        if (veiculo.equals(veiculo.getPlaca())){
            veiculos.add(veiculo);
        } else {
            System.out.println("Veículo não pode ser cadastrado");
        }
    }

    public double calcularImpostoTotal(Veiculo veiculo) {
        double total = 0;
        for (Veiculo v : veiculos){
            total += v.calcularImposto();

        }
        return total;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }
}
