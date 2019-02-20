
package javaapp.except;
import java.util.Scanner;

public class Except {
    public static void main(String[] args) {
            int a,b,ans=0;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter two numbers::");
            try
            {
              a=scanner.nextInt();
              b=scanner.nextInt();    
              ans=a/b;
                System.out.println("The ans is::"+ans);
            }
            catch(ArithmeticException ae)
            {
                System.out.println("The denominator need not to be zero.");
            }
            catch(Exception e)
            {
                System.out.println("Enter the valid number.");
            }
    }
}
