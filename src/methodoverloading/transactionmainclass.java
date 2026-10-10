package methodoverloading;

import java.util.Scanner;

public class transactionmainclass
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        transaction t=new transaction();

        System.out.println("please select mode of transaction");
        System.out.println("1.cardpayment \n 2.UPIpayment");
        int choice= scan.nextInt();
        if(choice==1)
        {
            System.out.println("enter a cardnumber");
            int cardnumber= scan.nextInt();
            System.out.println("enter a ccv number");
            int ccvnumber= scan.nextInt();
            System.out.println("enter a amount");
            double amount= scan.nextDouble();
            t.makepayment(cardnumber,ccvnumber,amount);
        }
        else if (choice==2)
        {
            System.out.println("enter a UPIpin");
            int upi= scan.nextInt();
            System.out.println("enter a amount");
            double amount= scan.nextDouble();
            t.makepayment(upi,amount);
        }
        else
        {
            System.out.println("invalid statement");
        }

    }
}
