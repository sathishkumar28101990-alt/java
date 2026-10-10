package methodoverloadandinheritance;

public class mainclassdeliver
{
    public static void main(String[] args)
    {

     expressdeliver e =new expressdeliver();

    double distance = 12;
    double weight = 5;

    // Using distance only
    double charge1 = e.calculateDeliveryCharge(distance);

    // Using distance and weight
    double charge2 = e.calculateDeliveryCharge(distance, weight);

    System.out.println("Delivery charge (Distance only): " + charge1);
    System.out.println("Delivery charge (Distance and Weight): " + charge2);
}
}
