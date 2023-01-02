import java.util.*;
import java.lang.*;

class tests1
{
  public static void main(String args[])
  {
   int a,b;
   double c;
   Scanner obj=new Scanner(System.in);
   System.out.println("Welcome to Calculator App");
   while(true)
   {
     System.out.println("Enter 1 for addition");
     System.out.println("Enter 2 for subtraction");
     System.out.println("Enter 3 for multiplication");
     System.out.println("Enter 4 for division");
     System.out.println("Enter 5 to exit");
     int n=obj.nextInt();
     if(n==5)
     {
        System.out.println("Program Terminates");
        System.exit(0);
     }             
     else
     {
      System.out.println("Enter the value of a and b");
      a=obj.nextInt();
      b=obj.nextInt();
     switch(n)
     {
       case 1:c=a+b;
              System.out.println("Sum="+c);
              break;
            
       case 2:c=a-b;
              System.out.println("Difference="+c);
              break;
            
       case 3:c=a*b;
              System.out.println("Product="+c);
              break;
     
       case 4:try
              {
                c=a/b;
                System.out.println("Quotient="+c);
              }
              catch(ArithmeticException e)
              {
                System.out.println("b value is 0");
              }             
              break;
                                              
     default:System.out.println("Invalid Choice");
    }
   }
  }
 }
}