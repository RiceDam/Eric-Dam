import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws = new ArrayList<>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Savings";
    private final int OVERDRAFT = -100;

    //Default Constructor
    Customer(){
        this.name = "Dylan";
        this.accountNumber = 12;
        this.checkBalance = 200;
        this.savingBalance = 500;

    }

    //Overloaded Constructor
    Customer(String name, int accountNumber, double checkBalance, double savingBalance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkBalance;
        this.savingBalance = savingBalance;

    }

    //Requires double, date, string
    //Modifies: this
    //Effects: Adds amt to the balance depending on the account and adds the deposit info to a list
    public double deposit(double amt, Date date, String account){
        Deposit d = new Deposit(amt, date, account);
        if (account.equals(CHECKING)) {
            checkBalance += amt;

        }
        if (account.equals(SAVING)) {
            savingBalance += amt;

        }
        deposits.add(d);
        return amt;
    }

    //Requires double, date, string
    //Modifies: this
    //Effects: Subtracts amt from the balance depending on the account and adds the withdrawal info to a list
    public double withdraw(double amt, Date date, String account){
        Withdraw w = new Withdraw(amt, date, account);
        if (account.equals(CHECKING)) {
            checkBalance -= amt;
            checkOverdraft(checkBalance, CHECKING);
        }
        if (account.equals(SAVING)) {
            savingBalance -= amt;
            checkOverdraft(savingBalance, SAVING);
        }
        withdraws.add(w);
        return amt;
    }

    //Requires: double, string
    //Modifies: this
    //Effects: Subtracts 100 from the balance when boolean == true, only works in the withdraw method
    private boolean checkOverdraft(double amt, String account){
        boolean check = false;
        if (account.equals(CHECKING)) {
            if (checkBalance < 0) {
                check = true;
                checkBalance += OVERDRAFT;
                System.out.println("You have overdrafted, $100 has been deducted from your checking account");
            }
        }
        if (account.equals(SAVING)) {
            if (savingBalance < 0) {
                check = true;
                savingBalance += OVERDRAFT;
                System.out.println("You have overdrafted, $100 has been deducted from your savings account");
            }
        }
        else {
            check = false;
        }
        return check;

    }
    //do not modify
    //Requires: nothing
    //Modifies: nothing
    //Effects: Prints out all the deposits made along with the date
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    //Requires: nothing
    //Modifies: nothing
    //Effects: Prints out all the withdrawals made along with the date
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }
    //Requires: date
    //Modifies: nothing
    //Effects: Prints out the account information of the customer
    public void displayAccounts(Date d) {
        System.out.println("Name: " + name + ", " + " Account Number: " + accountNumber);
        System.out.println("Checking Account Balance: $" + checkBalance + " " + "Savings Account Balance: $" + savingBalance);
        System.out.println(d);
    }

}
