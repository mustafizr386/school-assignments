//Mustafiz Rahman
//5/18/2020
//ITP 120 040A
//Professor Gonchar

import java.util.*;

public class Calculate_Percentage
{

   public static void main(String[]args)
   {
   
   //--------------------------Program 1------------------------
   //for both programs I'm using floats instead of doubles because floats also support decimals, the 32-bit precision is more than enough for this use case, 
   //and it's just convenient to use floats for formatting with printf.
      Scanner input = new Scanner(System.in);
      System.out.println("input number of males:");
      float males = input.nextInt();
      System.out.println("input number of females:");
      System.out.println(Percentage(males,input.nextInt()));
      
   //---------------------------Program 2------------------------
      System.out.println("input temperature in Fahrenheit:");
      
      System.out.printf("%.2f",Conversion(input.nextFloat()));
   }
   
   //--------------------------Program 1------------------------ 
   public static String Percentage(float male, float female)
   {
   return ((male / (female + male))*100) + "% of Males\n" + ((female / (female + male))*100)+ "% of Females";
   }
   
   //--------------------------Program 2------------------------ 
   public static float Conversion(float F)
   {
      return (F-32) * 5/9;
   }
}