package array;

public class empid
{
   public static void main(String[] args)
   {
       int [] empid = new int[5];
       empid[0]=101;
       empid[1]=102;
       empid[2]=103;
       empid[3]=104;
       empid[4]=105;

       System.out.println("the empid array length is :"+empid.length);

       for(int i=0; i<=empid.length;i++)
       {
           System.out.println("the empid array value is :"+empid[i]);
       }

    }
}
