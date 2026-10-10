package methodoverloading;

public class transaction
{
    int cardnumber=12345;
    int ccvnumber=6789;
    int upipin=123;

    void makepayment(int Cardnumber,int Ccvnumber, double amount)
    {

        if (Cardnumber == cardnumber && Ccvnumber == ccvnumber)
        {
            System.out.println("order successfull");
            System.out.println("payment recieved from card:" + amount);
        }
        else
        {
            System.out.println("invalid statement");
        }
    }
    void makepayment(int upipin,double amount)
    {
        if(this.upipin==upipin)
        {
            System.out.println("order successful");
            System.out.println("payment done by UPI:"+amount);
        }
        else
        {
            System.out.println("invalid statement");
        }
    }


}
