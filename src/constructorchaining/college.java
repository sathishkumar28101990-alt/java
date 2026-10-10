package constructorchaining;

public class college extends university
{
      college(String university,String college)
    {
        super(university);
        System.out.println("subclass 1 constructor");
        System.out.println("college name is :"+college);

    }
}
