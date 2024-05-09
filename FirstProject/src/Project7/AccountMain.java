package Project7;

public class AccountMain {
    public static void main(String[] args) {
        Account Dane = new Account();
        Account Daniel = new Account(11111111, 500, 4);
        Dane.setBalance(500);
        Dane.deposit(1000);
        Dane.withdraw(400);
        System.out.println(Dane);
        System.out.println("Dane's Interest Rate" + Dane.getInterestRate());
        Daniel.withdraw(300);
        Daniel.deposit(6000);
        System.out.println(Daniel);
    }
    

}
