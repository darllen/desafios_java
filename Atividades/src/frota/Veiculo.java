public abstract class Veiculo implements Ipva{
    private static int ID;
    private String marca;
    private String modelo;
    private int potencia;
    private String placa;
    private short ano;


    @Override
    public boolean equals(String placa) {
        return super.equals(placa);
    }
    public abstract double calcularImposto();

    public Veiculo(String marca, String modelo, int potencia, String placa, short ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.placa = placa;
        this.ano = ano;
    }

    public Veiculo() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }
}
