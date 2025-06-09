package au.com.pratap.solid.liskov.good;


public interface SecureLoan extends LoanPayment {
    public void foreCloseLoan();
}
