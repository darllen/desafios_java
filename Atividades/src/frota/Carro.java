public class Carro extends Veiculo {
    private int numPortas;

    @Override
    public double calcularImposto() {
        double imposto;
        if (getAno() <= 2020) {
            imposto = 1000;
        } else {
            imposto = 1200;
        }
        return imposto;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public Carro(String marca, String modelo, int potencia, String placa, short ano, int numPortas) {
        super(marca, modelo, potencia, placa, ano);
        this.numPortas = numPortas;
    }

    public Carro(int numPortas) {
        this.numPortas = numPortas;
    }

    public Carro() {
    }
}
