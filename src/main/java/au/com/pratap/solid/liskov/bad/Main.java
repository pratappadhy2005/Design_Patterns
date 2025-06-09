package au.com.pratap.solid.liskov.bad;

public class Main {
    public static void main(String[] args) {
        LoanClosureService loanClosureService = new LoanClosureService(new HomeLoan());
        loanClosureService.foreCloseLoan();

        //Bad design
        LoanClosureService loanClosureService1 = new LoanClosureService(new CreditCardLoan());
        loanClosureService1.foreCloseLoan(); // This will throw UnsupportedOperationException
    }
}
