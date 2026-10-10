package hierarichal;

public class bankmainclass {
    static void main(String[] args) {
        savingaccount s=new savingaccount();
        //s.displaybankinfo();
      // s.checkbalance(10000);

        currentaccount c=new currentaccount();
        c.displaybankinfo();
        c.checkdraft(false);

        loanaccount l=new loanaccount();
        l.checkloan(100000);
    }
}
