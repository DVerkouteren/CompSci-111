package Chapter9;

public class Account {

    private int ID = 1;
    private double balance = 100;

    Account() {}

    Account(double UserBalence) {
        balance = UserBalence;
    }

    public int getID() {
        return ID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double Balance) {
        balance = Balance;
    }
}
