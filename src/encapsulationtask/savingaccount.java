package encapsulationtask;

public class savingaccount extends bankaccount
{
    public void deposit(double amount)
    {
        balance = balance + amount;
        System.out.println("Deposited Amount: Rs. " + amount);

        if (balance >= 50000)
        {
            double interest = balance * 0.05;
            balance = balance + interest;
            System.out.println("Interest Added: Rs. " + interest);
        }
    }
    public void displaySavings()
    {
        System.out.println("\n--- Savings Account Details ---");
        displayDetails();
    }
}


