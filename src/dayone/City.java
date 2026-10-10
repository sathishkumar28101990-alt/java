package dayone;

import java.util.Scanner;

public class City {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Select the plan:");
            System.out.println("1. 199");
            System.out.println("2. 299");
            System.out.println("3. 399");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("your plan is 1gb \n 100 sms");
                    break;

                case 2:
                    System.out.println("Your plan is 2gb \n 200sms.");
                    break;

                case 3:
                    System.out.println("Your plan 3gb \n 300 sms");
                    break;



                default:
                    System.out.println("Invalid choice.");
            }

            sc.close();
        }
    }

