public class Motocicleta extends Veiculo {

    private int cilindradas;
    private String estilo;

    @Override
    public double calcularImposto() {
        return getPotencia() * getCilindradas() * (10/100);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public Motocicleta(String marca, String modelo, int potencia, String placa, short ano, int cilindradas, String estilo) {
        super(marca, modelo, potencia, placa, ano);
        this.cilindradas = cilindradas;
        this.estilo = estilo;
    }

    public Motocicleta(int cilindradas, String estilo) {
        this.cilindradas = cilindradas;
        this.estilo = estilo;
    }

    public Motocicleta() {
    }
}
