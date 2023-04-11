//Mustafiz Rahman
//5/18/2020
//ITP 120 040A
//Professor Gonchar

import java.util.*;

public class Loops_Assignment{

   
   public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      //--------------------------Program 1------------------------
      System.out.println("Enter in the starting number for the loop:"); 
      System.out.println(loopsum(input.nextInt()));
      //--------------------------Program 2------------------------
      System.out.println("Enter in your test score:"); 
      System.out.println(gradecalc((int)input.nextFloat()));
   }
   //--------------------------Program 1------------------------
   public static int loopsum(int start){
      int temp = 0;
      for(int x = start ;x > 0; x--){
         temp = x + temp;
      }
      return temp;
   }
   //--------------------------Program 2------------------------
   private static String [] grades = {"F","D","C","B","A","A"};
      
   public static String gradecalc(int gradenum){
      int temp = gradenum/10 - 5;
      if(temp >= 0){
         return grades[temp];
      }
      return "F
   }

}