package encapsulation;

public class librarymainclass
{
    public static void main(String[] args)
    {
        library L=new library();
        // setting values using setter method
        L.setBookname("java programming");
        L.setAuthorname("james parker");
        L.setBookid(201);
        L.setNumberofcopies(5);
        L.bookdetials();

    }
}
