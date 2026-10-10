package hierarichal;

public class savingaccount extends bank
{
    void checkbalance(int balance)
    {
        if (balance>=10000)
        {
            System.out.println("minimum balance is maintained");

        }
        else
        {
            System.out.println("minimum balance is not maintained");

        }
    }
}
