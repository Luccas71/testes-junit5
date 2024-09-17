package one.digitalinnovation.entities;

public class Account {
    public static double DEPOSIT_FEE_PERCENTAGE = 0.02;

    private Long id;
    private double balance;

    public Account() {
    }

    public Account(Long id, double balance) {
        this.id = id;
        balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if (amount > 0) {
            amount -= amount * DEPOSIT_FEE_PERCENTAGE;
            balance = amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException();
        } else {
            balance -= amount;
        }
    }

    public double fullWithdraw() {
        double aux = balance;
        balance = 0F;
        return aux;
    }
}
