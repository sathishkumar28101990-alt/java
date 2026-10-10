package constructorecommerce;

public class product {
    String productname;
    double productprice;
    int quantity;

    public product()
    {
        productname="laptop";
        productprice=55000;
        quantity=1;
    }

    public product(String name,double price, int qty)
    {
        productname=name;
        productprice=price;
        quantity=qty;

    }

    public void display()
    {
        System.out.println("product name:"+productname);
        System.out.println("product price:"+productprice);
        System.out.println("quantity:"+quantity);
    }
}
