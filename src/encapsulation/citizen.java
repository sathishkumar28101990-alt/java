package encapsulation;

public class citizen
{
    // Private variables
    private String citizenName;
    private String aadhaarNumber;

    // Getter for citizen name
    public String getCitizenName()
    {
        return citizenName;
    }
    public String getaadhaarnumber()
    {
        return  aadhaarNumber;
    }

    // Setter for Aadhaar number
    public void setAadhaarNumber(String aadhaarNumber)
    {
        this.aadhaarNumber = aadhaarNumber;
    }
    public  void setCitizenName(String citizenName)
    {
        this.citizenName=citizenName;
    }

}
