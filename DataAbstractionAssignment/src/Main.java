import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer c = new Customer();
        Date d = new Date();
        c.deposit(50.0, d, "Checking");
        c.deposit(400, d, "Savings");
        c.withdraw(300, d, "Checking");
        c.withdraw(100, d, "Savings");
        c.displayDeposits();
        c.displayWithdraws();
        c.displayAccounts(d);
    }
}
