package constructorecommerce;

public class mainclass {

    public static void main(String[] args) {
        product p1= new product();
        System.out.println("default constructor");
        p1.display();


    product p2=new product("mobilephone", 25000, 2);
    System.out.println("\n parameterized constructor");
    p2.display();

    }
}
