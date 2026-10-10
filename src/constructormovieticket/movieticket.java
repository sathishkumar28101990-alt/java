package constructormovieticket;

public class movieticket
{
    String moviename;
    int numberoftickets;
    double ticketprice;

    public movieticket(String moviename,int numberoftickets,double ticketprice)
    {
        this.moviename=moviename;
        this.numberoftickets=numberoftickets;
        this.ticketprice=ticketprice;

    }
    double calculateamount()
    {
        return numberoftickets*ticketprice;

    }


}
