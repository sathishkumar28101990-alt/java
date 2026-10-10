package methodoverriding;

public class instagrammainclass
{
    public static void main(String[] args)
        {
            instagram i;
            i =new instagram();
            i.features();

            i=new instagramv2();
            i.features();

            i=new instagramv3();
            i.features();

            i=new instagramv4();
            i.features();

        }

}
