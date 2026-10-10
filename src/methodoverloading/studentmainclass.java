package methodoverloading;

import java.util.Scanner;

public class studentmainclass
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        student s=new student();

        System.out.println("please select a search cretiria");
        System.out.println("1.search by name  \n 2.search by rollno");
        int choice=scan.nextInt();
        if(choice==1)
        {
            System.out.println("enter a name");
            String name=scan.next();
            s.searchstudent(name);
        }
        else if (choice==2)
        {
         System.out.println("provide a roll no");
         long rollno= scan.nextLong();
         s.searchstudent(rollno);
        }
        else
        {
            System.out.println("invalid choice");
        }

    }
}
