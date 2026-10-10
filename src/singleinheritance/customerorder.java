package singleinheritance;

public class customerorder extends restaurant
{

    String customername="sathish";
    String fooditem="burger";

    public void orderdetails()
    {
        System.out.println("customer name:"+customername);
        System.out.println("customer fooditem:"+fooditem);

    }


}
