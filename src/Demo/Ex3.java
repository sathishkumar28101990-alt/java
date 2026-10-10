package Demo;

public class Ex3 {
public static String fullname(String firstname,String lastname)

{
    return firstname+lastname;
}

    public static void main(String[] args)
    {
        String newname=fullname("sathish","kumar");
        System.out.println("my full name  is:"+newname);
        sal(34.43,34343);
        double finalamount= salary(3444,56);
        System.out.println("my final amount is:"+finalamount);
    }

    public static void sal(double salary,double increment )
    {
     double newsal=salary+increment;
     System.out.println("my new sal is:"+newsal);
    }
    public static double salary(double amount, double decrement)
    {
        double newsal=amount-decrement;
        return newsal;


    }





}