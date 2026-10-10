package encapsulation;

public class citizenmainclass
{
   public static void main(String[] args)
   {
       citizen c=new citizen();

       c.setCitizenName("rahul");
       c.setAadhaarNumber("1234-4564-9810");

       System.out.println("citizen name:"+c.getCitizenName());
       System.out.println("aadhaar number:"+c.getaadhaarnumber());

    }
}
