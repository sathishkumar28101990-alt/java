package object;

public class Mobile {
    public static void main(String[] args) {
        int ram=8;
        String colour="white";
        double price=25000;
        Mobile m=new Mobile();
        m.mobilename();
        m.processor();
        m.price();
        m.ram();
        Mobile m1=new Mobile();
        m1.mobilename1();
        m1.price1();
        m1.processor1();
        m1.ram1();



    }
    void mobilename()
    {
        System.out.println("mobile name is samsang");
    }
    void processor()
    {
        System.out.println("proscessor is snapdragon");
    }
    void price() {
        System.out.println("price is 22200");
    }
    void ram()
    {
        System.out.println("ram is 100gb");
    }

    {
        System.out.println("+++++++++++++++");
    }
    void mobilename1()
    {
        System.out.println("mobile name is apple");
    }
    void processor1()
    {
        System.out.println("proscessor is ios");
    }
    void price1() {
        System.out.println("price is 222769");
    }
    void ram1()
    {
        System.out.println("ram is 145gb");
    }
}
