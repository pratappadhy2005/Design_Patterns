package au.com.pratap.solid.liskov.good;

import au.com.pratap.solid.liskov.bad.CreditCardLoan;
import au.com.pratap.solid.liskov.bad.LoanClosureService;

public class Main {

    public static void main(String[] args) {
        LoanClosureService loanClosureService = new LoanClosureService(new CreditCardLoan());
        loanClosureService.foreCloseLoan();
    }
}
