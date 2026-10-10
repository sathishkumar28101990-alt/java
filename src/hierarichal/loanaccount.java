package hierarichal;

public class loanaccount extends bank{
    void checkloan(int sal)
    {
        if (sal>=100000)
        {
            System.out.println("loan eligiable");

        }
        else
        {
            System.out.println("not eligiable");
        }
    }
}
