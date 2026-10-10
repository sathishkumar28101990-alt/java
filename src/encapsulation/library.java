package encapsulation;

public class library
{
    private String bookname;
    private String authorname;
    private int bookid;
    private int numberofcopies;

    //getter

    public String getBookname()
    {
        return bookname;
    }

    public String getAuthorname()
    {
        return authorname;
    }

    public int getBookid()
    {
        return bookid;
    }

    public int getNumberofcopies()
    {
        return numberofcopies;
    }

    //setter

    public void setBookname(String bookname)
    {
        this.bookname = bookname;
    }

    public void setAuthorname(String authorname)
    {
        this.authorname = authorname;
    }

    public void setBookid(int bookid)
    {
        this.bookid = bookid;
    }

    public void setNumberofcopies(int numberofcopies)
    {
        this.numberofcopies = numberofcopies;
    }

    //check book avaibility

    public  void checkavailability()
    {
        if(numberofcopies>0)
        {
            System.out.println("book available");
        }
        else
        {
            System.out.println("book not available");
        }
    }

    // method to display

    public void bookdetials()
    {
        System.out.println("book name:"+bookname);
        System.out.println("Author name:"+authorname);
        System.out.println("Book ID:"+bookid);
        System.out.println("number of copies:"+numberofcopies);
        checkavailability();
    }
}
