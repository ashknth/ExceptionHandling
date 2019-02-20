
package Customer;

public class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double am)
    {
      this.amount=am;   
    }
    public double getAmount()
            {
                return amount;
            }
}
