package conta;

public class Conta {
    private int numero;
    private String cliente;
    private double saldo;
    private double limite;



    public boolean transferir(double valor, Conta destino){
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }
    public boolean sacar(double valor){
        if((saldo + limite) >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }


    public Conta(int numero, String cliente, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }

    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = 100;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
