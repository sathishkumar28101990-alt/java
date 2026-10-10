package methodoverriding;

public class instagramv3 extends instagram
{

    public void features()
    {
        followes +=5000;
        System.out.println("instagram v3 updated");
        System.out.println("followers count :"+followes);
        if(followes>=3000)
        {
            System.out.println("monetization features enable");
        }


    }
}
