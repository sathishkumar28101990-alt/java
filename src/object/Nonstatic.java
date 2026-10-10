package object;

public class Nonstatic {

    //data member
    String mobilename="samsaung m52";
    String processor="snapdragon 453";
    int ram = 8;
    String colour="black";
    double price= 544340;

    //non static method
    public void mobilename()
    {
        System.out.println("the mobile name is :"+mobilename);
    }
    public void processor()
    {
        System.out.println("the processor is :"+processor);

    }
    public void colour()
    {
        System.out.println("the mobile colour is :"+colour);
    }
    public void ram()
    {
        System.out.println("the mobile ram is :"+ram);
    }
    public void price()
    {
        System.out.println("the mobile price is :"+price);
    }

    public static void main(String[] args) {
        Nonstatic n=new Nonstatic();
        n.price();
        n.ram();
        n.processor();
        n.mobilename();
        n.colour();

            System.out.println("the mobile name is :" + n.mobilename);
            System.out.println("name of the processor is:"+n.processor);
            System.out.println("mobile ram is:"+n.ram);
            System.out.println("mobile colour is :"+n.colour);
            System.out.println("price of the mobile is :"+n.price);



    }
}
