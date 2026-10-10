package constructormovieticket;

import java.util.Scanner;

public class movieticketmainclass

{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter movie name");
        String moviename= sc.nextLine();
        System.out.println("enter number of tickets:");
        int numberoftickets=sc.nextInt();
        System.out.println("enter ticket price:");
        double ticketprice=sc.nextDouble();

        {
            movieticket t=new movieticket(moviename,numberoftickets,ticketprice);

            System.out.println("\n movie name:"+t.moviename);
            System.out.println("number of tickets:"+t.numberoftickets);
            System.out.println("ticket price:"+t.ticketprice);
            System.out.println("total amount:"+t.calculateamount());


        }



    }
}
