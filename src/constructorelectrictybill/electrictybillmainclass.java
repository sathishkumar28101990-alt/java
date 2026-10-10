package constructorelectrictybill;

public class electrictybillmainclass
{
    public static void main(String[] args) {
        electricitybill customer1=new electricitybill("arun",100);
        electricitybill customer2=new electricitybill("bala",200);
        electricitybill customer3=new electricitybill("raja",300);
        electricitybill customer4=new electricitybill("ramesh",400);
        electricitybill customer5=new electricitybill("malar",544);


        customer1.display();
        customer2.display();
        customer3.display();
        customer4.display();
        customer5.display();
    }
}
