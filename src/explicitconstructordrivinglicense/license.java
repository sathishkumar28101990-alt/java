package explicitconstructordrivinglicense;

class License
{
    String citizenName;
    int age;

    // Explicit constructor
    License(String citizenName, int age) {
        this.citizenName = citizenName;
        this.age = age;
    }

    // Method to check eligibility
    void checkEligibility() {
        String status;

        if (age >= 18)
        {
            status = "Eligible for Driving License";
        }
        else
        {
            status = "Not Eligible for Driving License";
        }

        // Display details
        System.out.println("Citizen Name: " + citizenName);
        System.out.println("Age: " + age);
        System.out.println("Eligibility Status: " + status);
    }

    public static void main(String[] args)
    {
        // Create object and pass values through constructor
        License l= new License("Aniket", 22);

        // Check eligibility
        l.checkEligibility();
    }
}