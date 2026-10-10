package encapsulation;

public class gettersetter
{
    private String  name        =       "arun";
    private long    accountno   =  876540930867L;


    // getter method
    public String getName()
    {
        return name;
    }

    public long getaccountno()
    {
        return accountno;
    }

    //setter method

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAccountno(long accountno)
    {
        this.accountno = accountno;
    }
}
