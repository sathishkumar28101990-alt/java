package constructor;

public class constructor {


   // constructor()
    {
        System.out.println("non parametoized or default constructor");
        String name="arun";
        double sal=35000;
        System.out.println("the name of the person is :"+name);
        System.out.println("the  person salary:"+sal);

    }



    constructor(String name,int sal)
    {
        System.out.println("parameterized or user defined consrtuctor");
        System.out.println("the name of the person is :"+name);
        System.out.println("the salary of the person is :"+sal);
    }
    constructor(int sal,String name)
    {
        System.out.println("salary of the person:"+sal);
        System.out.println("name of the person is "+name);
    }

    constructor(int sal, String name, double amount)
    {

        System.out.println("salary of the person is :"+sal);
        System.out.println("name of the pesron is :"+name);
        System.out.println("amount is equal to a+b:"+amount);
    }
    public void info()
    {
        System.out.println("i am a normal method");
    }

    public static void main(String[] args) {
        constructor c=new constructor("sathish",50000);
        c.info();

        constructor c1=new constructor(50000,"sathish");
        constructor c2=new constructor(45000,"arun",4569565+54564);

    }

}
