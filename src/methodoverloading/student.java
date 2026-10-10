package methodoverloading;

public class student
{
    String studentname="banupriya";
    long rollno=430081604;

    void searchstudent(String name)
    {
        if(name.equalsIgnoreCase(studentname))
        {
            System.out.println("student name is:"+studentname);
            System.out.println("student rollno is :"+rollno);

        }
        else
        {
            System.out.println("invalid statement");
        }
    }

    void searchstudent(long rollno)
    {
        if (this.rollno==rollno)
        {
            System.out.println("student name is :"+studentname);
            System.out.println("Student rollno is:"+rollno);
        }
        else
        {
           System.out.println("invalid statement");

        }
    }
}
