package Project7;

public class Account {
    private int id = 0123456;
    private double balance = 100;
    private double interestRate = 1;

    public Account(){}

    public Account(int id, double balance, double interestRate) {
        this.id = id;
        setBalance(balance);
        setInterestRate(interestRate);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance >= 100){
            this.balance = balance;
        }else{
            System.out.println("Balance is too low");
        }
    }

    public double getInterestRate() {
        
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate >= 1){
            this.interestRate = interestRate;
        }else{
            System.out.println("Interest rate is too low");
        }
    }
    public void withdraw(double amount){
        if(amount <= (balance-100)){
            balance -= amount;
        }else{
            System.out.println("Balance must be greater than $100");
        }
    }
    public void deposit(double amount){
        if(amount <= 5000){
            balance += amount;
        }else{
            System.out.println("Deposit is capped at 5000, try again");
        }
    }

    @Override
    public String toString() {
        return "Account [id=" + id + ", balance=" + balance + ", interestRate=" + interestRate + "]";
    }


}
