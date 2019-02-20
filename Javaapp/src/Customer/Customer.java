package Customer;

public class Customer {

    public static void main(String[] args) {
        CheckingAccount ac = new CheckingAccount(101);
        System.out.println("Depositing $500.");
        ac.deposit(500.0);
        try {
            System.out.println("\n withdrawing $100..");
            ac.withdraw(100.0);
                 System.out.println("\n withdrawing $600..");
            ac.withdraw(600.0);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry you short $" + e.getAmount());
            //e.printStackTrace();
        }
    }

}
