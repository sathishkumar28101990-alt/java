package encapsulationtask;

public class currentaccount extends bankaccount
{
    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance = balance - amount;
            System.out.println("Withdrawn Amount: Rs. " + amount);

            if (balance < 5000)
            {
                System.out.println("Warning: Minimum balance is below Rs. 5000");
            }
        }
        else
        {
            System.out.println("Insufficient Balance!");
        }
    }
    public void displayCurrent()
    {
        System.out.println("\n--- Current Account Details ---");
        displayDetails();
    }
}
