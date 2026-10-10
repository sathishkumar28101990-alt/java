package variable;

public class Classvariable {


    // class variable

        static String name = "sathish";
        static String desigenation = "qa tester";
        static String company = "HCL";
        static int employeeid = 123456;
        static double salary = 55000.3;
        static String dob = "28.10.1990";

        public static void personal()
        {
            System.out.println("the name of the company is :"+company);
            System.out.println("salary is :"+salary);
        }

        //instance variable
        String bikemodel="fz";
        String bikecompany ="yamaha";
        String bikecolour="black";
        int mileage=60;
        double price=124300.8;

        public void bike()
        {
            System.out.println("bike colour is :"+bikecolour);
            System.out.println("bike mileage is:"+mileage);
        }


    public static void main(String[] args) {
        System.out.println("the name of the person is:"+name);
        personal();
        Classvariable c=new Classvariable();
        System.out.println("bike name is:"+c.bikemodel);
        c.bike();

    }
}
