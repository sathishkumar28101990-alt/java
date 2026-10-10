package constructorelectrictybill;

public class electricitybill
{
    String customername;
    int unitscosumed;
    int billamount;

    public electricitybill(String customername, int unitscosumed)
    {
        this.customername = customername;
        this.unitscosumed=unitscosumed;
        this.billamount=unitscosumed*8;

    }

    void display()
    {
        System.out.println("customer name:"+customername);
        System.out.println("unit consumed:"+unitscosumed);
        System.out.println("bill amount:Rs."+billamount);
        System.out.println("-------------------------");
    }
}
