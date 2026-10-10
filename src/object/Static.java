package object;

public class Static {

    static String name="sathish";
    static String desigenation="tester";
    static double salary=37000;



    public static void personaldetails()
    {
        System.out.println("the name of the person is :"+name);
        System.out.println("the desigenation the person is :"+desigenation);
        System.out.println("the salary of the person:"+salary);
    }

    public static void main(String[] args) {
       personaldetails();
       System.out.println(name);
    }
}
