package methodoverloadandinheritance;

public class deliver
{

    // Calculate charge using distance only
    double calculateDeliveryCharge(double distance)
    {
        return distance * 5;
    }

    // Calculate charge using distance and weight
     double calculateDeliveryCharge(double distance, double weight)
    {
        return distance * weight * 5;
    }

}
