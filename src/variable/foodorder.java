package variable;

public class foodorder {
    String name="sathish";
    String fooditem="dosa";

    public void placeorder()
    {
        //local variable
        int deliverytime=30;
        System.out.println("display the customer details");
        System.out.println("name of the customer is:"+name);
        System.out.println("customer food item is:"+fooditem);
        System.out.println("delivery time is:"+deliverytime);
    }

    public static void main(String[] args) {
        foodorder f=new foodorder();
        f.placeorder();
        System.out.println("fooditem:"+f.fooditem);


    }

}
