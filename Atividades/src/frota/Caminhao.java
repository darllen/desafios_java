public class Caminhao extends Veiculo {
    private int capacidade;

    @Override
    public double calcularImposto() {
        return 500 + ((5/100) * getCapacidade());
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Caminhao(String marca, String modelo, int potencia, String placa, short ano, int capacidade) {
        super(marca, modelo, potencia, placa, ano);
        this.capacidade = capacidade;
    }

    public Caminhao(int capacidade) {
        this.capacidade = capacidade;
    }

    public Caminhao() {
    }
}
