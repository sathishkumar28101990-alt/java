package encapsulation;

public class gettermainclass
{
   public static void main(String[] args)
   {
       gettersetter g=new gettersetter();
       System.out.println(" before set value");
       System.out.println(g.getName());
       System.out.println(g.getaccountno());

       System.out.println("===============");

       System.out.println("after set value");
       g.setName("sathish");
       g.setAccountno(453343347);
       System.out.println(g.getName());
       System.out.println(g.getaccountno());

    }
}
