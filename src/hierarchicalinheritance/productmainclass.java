package hierarchicalinheritance;

public class productmainclass
{
    static void main(String[] args) {
        mobile m=new mobile();
        m.moibleinfo("apple");
        m.sellproducts(8,45088);

        laptop l=new laptop();
        l.laptopinfo("acer");
        l.sellproducts(2,45000);

        Ac a=new Ac();
        a.acinfo("lyyod");
        a.sellproducts(2,125000);
    }
}
