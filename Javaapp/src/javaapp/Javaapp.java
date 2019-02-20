
package javaapp;


public class Javaapp {

    
    public static void main(String[] args)  
    {
     int a[]=new int[2];
     try
     {
         System.out.println("The element at index 3 is ::"+a[3]);    
     }
           catch(ArrayIndexOutOfBoundsException e)
           {
               System.out.println("Fist element value::"+a[0]);  
     
           }
     finally
     {
         a[0]=8;
         System.out.println("First element::"+a[0]);
         System.out.println("The finally satatement is executed::");
     }
    }
}
