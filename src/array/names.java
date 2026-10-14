package array;

public class names
{
    public static void main(String[] args)
    {

        // Declare and initialize an array of 5 names
        String[] names = {"Ravi", "Sathish", "Kumar", "Arun", "Priya","aravind"};

        // Display the names
        System.out.println("The five names are:");

        for (int i = 0; i<names.length; i++)
        {
            System.out.println(names[i]);
        }
    }
}
