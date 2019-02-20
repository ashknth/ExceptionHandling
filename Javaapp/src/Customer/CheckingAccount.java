package Customer;

public class CheckingAccount {
    private double balance;
    private  int number;
  public CheckingAccount(int nu)
  {
      this.number=nu;
  }
   public void deposit(double amount)
   {
       balance+=amount;
   }
   public void withdraw(double amount)throws InsufficientFundsException{
       if(amount<=balance)
       {
           balance-=amount;
       }
       else
       {
           double needs=amount-balance;
           throw new InsufficientFundsException(needs);
       }
   }
       public double getBalance()
               {
                   return balance;
     
               }
       public int getNumber()
       {
           return number;
       }
   }
 

