//Mustafiz Rahman
//6/10/2020
//ITP 120 040A
//Professor Gonchar

import java.util.*;

public class Sum_and_Factorial
{

   public static void main(String[]args)
   {
      Scanner input = new Scanner(System.in);
      while(true==true)
      {
         System.out.println("enter sum to add up all the numbers preceding the number you enter plus the number you enter.");
         System.out.println("enter factorial to find the factorial of the number you input."); 
         System.out.println("enter quit to exit the program.");
         String userrequest = input.next().toLowerCase();
         if(userrequest.equals("sum"))
         {
            while(true == true)
            {
               System.out.println("enter a positive integer");
               int numrequest = input.nextInt();
               if(numrequest >= 0)
               {
                  System.out.println("the added sum of " + numrequest+ " is " + sum(numrequest));
                  break;
               }
               System.out.println("invalid number");
            }
         }
         else if(userrequest.equals("factorial"))
         {
            while(true == true)
            {
               System.out.println("enter a positive integer");
               int numrequest = input.nextInt();
               if(numrequest >= 0)
               {
                  System.out.println("the factorial of " + numrequest+ " is " + factorial(numrequest));
                  break;
               }
               System.out.println("invalid number");
            }
         }
         else if(userrequest.equals("quit"))
         {
            System.out.println("exiting program");
            break;
         }
         else
         {
            System.out.println("please enter a valid command");
         }
      }
   }
   
   public static int sum(int num)
   {  
      int total = 0;
      for(int x =1; x<= num; x++)
      {
         total += x;
      }
      return total;
   }
   
   public static int factorial(int num)
   { 
      int total = 1;
      for(int x =1; x<= num; x++)
      {
         total *= x;
      }
      return total; 
   }
}