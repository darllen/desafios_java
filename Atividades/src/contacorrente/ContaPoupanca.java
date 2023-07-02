package contacorrente;

/**
 *
 * @author salmo
 */
public class ContaPoupanca extends Conta {
    
    /**
     *
     * @param taxa
     */
    public void reajustar(double taxa){
        this.depositar(this.getSaldo()*(taxa/100));
    }
    
    public void reajustar(){
        this.depositar((this.getSaldo()*0.1));
    }
    
    /**
     *
     * @return
     */
    @Override
    public String tipoConta(){
        return "Poupança";
    }
}
