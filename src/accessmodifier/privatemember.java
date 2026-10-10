package Accessmodifier;

public class privatemember
{
    private String name = "naveen";
    private int empid = 12234;
    private String domain = "tester";

    void display()
    {
        System.out.println("private access modifer");
        System.out.println("name of the employee is :"+name);
        System.out.println("empolyee name:"+empid);
    }


    public static void main(String[] args) {
        privatemember p = new privatemember();
        p.display();
        System.out.println(p.name);
        System.out.println(p.domain);
    }
}