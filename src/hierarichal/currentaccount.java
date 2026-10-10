package hierarichal;

public class currentaccount extends bank
{
    public void checkdraft(boolean status)
    {
        if (status)
        {
            System.out.println("overdue avaible");
        }
        else
        {
            System.out.println("overdue not avaible");

        }
    }

}
