package chapter2;

public class Account {
    private String name;
    private double balance;

        public void setName(String name) {
            this.name = name;
        }

    public String getName() {
        return name;

    }

    public double getBalance() {
        return balance;

    }

    public void deposit(double cash) {
        balance += cash;

    }


    public void withdrawal(double amount) {
        balance -= amount;

    }

    public double checkBalance() {
        return balance;
    }
}
