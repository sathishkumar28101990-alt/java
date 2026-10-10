package constructorchaining;

public class department extends college
{
    public department(String university, String college, String department)

    {
        super(university,college);
        System.out.println("sub class 2 constructor");
        System.out.println("department name is "+department);
    }
}

