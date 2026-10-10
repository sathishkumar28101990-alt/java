package Demo;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name:");
        String name=sc.next();
        System.out.println("enter your age:");
        int age=sc.nextInt();
        System.out.print("enter your education :");
        String degree=sc.next();
        System.out.println("my name name is:"+ name);
        System.out.println("my age is:"+age);
        System.out.println("your education:"+degree);

        sc.close();


    }
}
