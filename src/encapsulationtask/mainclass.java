package encapsulationtask;

public class mainclass
{
    public static void main(String[] args)
    {
        // Savings Account
        savingaccount s = new savingaccount();
        s.setDetails("sathish",5445,50000);
        s.deposit(10000);
        s.displaySavings();

        // Current Account
        currentaccount c = new currentaccount();
        c.setDetails("Kumar", 1024, 20000);
        c.withdraw(16000);
        c.displayCurrent();
    }


}