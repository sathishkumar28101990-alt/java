package dayone;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter your salary:");
        double fog=s.nextDouble();
        System.out.println("name of the person:"+fog);

        System.out.println("enter the student id");
        int student=s.nextInt();
        System.out.println("your id is :"+student);

        System.out.println("enter your mobile number");
        float mobilenumber=s.nextFloat();
        System.out.println("your mobile is :"+mobilenumber);




    }
}
