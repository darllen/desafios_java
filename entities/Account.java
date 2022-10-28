package entities;

public class Account {
    private int number;
    private String holder;
    private double balance;

    //CONTRUTORES
    public Account(int number, String holder, double initialDeposit) {
        this.number = number;
        this.holder = holder;
        addBalance(initialDeposit);
    }

    public Account(int number, String holder) {
        this.number = number;
        this.holder = holder;
        this.balance = 0;
    }

    //GET E SET
    public String getHolder() {
        return holder;
    }

    //MÉTODOS
    public void addBalance(double amount){
        this.balance += amount;
    }

    public void removeBalance(double amount){
        this.balance -= amount + 5;
    }

    public String toString(){
        return "Account "
                + number
                + ", Holder: "
                + getHolder()
                +", Balance: $ "
                + String.format("%.2f", balance);
    }
}
