package methodoverriding;

public class instagramv4 extends instagram
{

    public void features()
    {
        followes +=5000;
        System.out.println("instagram v4 updated");
        System.out.println("boardcast channel features added");
        System.out.println("followers count:"+followes);
        if(followes>=5000)
        {
            System.out.println("blue tick eligible");
        }
    }

}
