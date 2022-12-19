package tdd;

public class Account {

    private int balance;

    public void deposit(int amount) {
        if (amount >= 0) balance += amount;
    }

    public <balance> void withdrawer(int amount) {
        if (amount > 0) balance -= amount;
    }


    public int getBalance() {
        return balance;
    }

}