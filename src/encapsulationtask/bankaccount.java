package encapsulationtask;

public class bankaccount
{
    private String accountHolder;
    private int accountNumber;
    protected double balance;

    // Method to set account details
    public void setDetails(String name, int number, double amount)
    {
        accountHolder = name;
        accountNumber = number;
        balance = amount;
    }

    // Method to display account details
    public void displayDetails()
    {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: Rs. " + balance);
    }
}


