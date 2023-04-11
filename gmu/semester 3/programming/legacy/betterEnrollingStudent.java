//IT 206
//Mustafiz Rahman
//Professor Bidhan
//9/26/2021

import java.util.*;
public class betterEnrollingStudent
{
   public static void main(String[]args)
   {
   //input & variables to be used in end report
      Scanner input = new Scanner(System.in);
      CourseRegistration largestEnrollment = null;
      int totalCourses = 0;
      int totalEnrollment = 0;
   
   //the loop for making all 5 courses
      for(; totalCourses < 5;)
      {
         CourseRegistration temp = new CourseRegistration();
      
         System.out.println("enter the course number");
         temp.setNumber(input.nextInt());   
         
            //temp.setNumber(((int)(Math.random()*9999+1)));   
      
         System.out.println("enter the course name");
         temp.setName(input.next());   
       
            //temp.setName("abc" + ((int)(Math.random()*99 +1)));   
      
         System.out.println("enter the number of course credit hours");
         int testvalid = input.nextInt();
         
            //int testvalid = ((int)(Math.random()*10+1));
        
    //loops for making sure the inputs are valid.    
         while(testvalid > 4 || testvalid <=0)
         {
            System.out.println("invalid input, please enter a number between 1 and 4 for the Credit Hours");
            testvalid = input.nextInt();
            
               //testvalid = ((int)(Math.random()*10+1));
         }
         temp.setCreditHour(testvalid); 
               
         System.out.println("enter the number of students enrolled");
         
         testvalid = input.nextInt();
         
            //testvalid = (((int)(Math.random()*50)));
         
         while(testvalid > 30 || testvalid <0)
         {
            System.out.println("invalid input, please enter a number between 1 and 30 for the students enrolled");
            testvalid = input.nextInt();
            
               //testvalid = (((int)(Math.random()*50)));
         }
         
         temp.setCurrentEnrollment(testvalid);   
          
      //report printout and background incrementing and setting for the final report
         System.out.println(temp.toString());
         if(largestEnrollment == null || largestEnrollment.getCurrentEnrollment() < temp.getCurrentEnrollment())
         {
            largestEnrollment = temp;
         }
         totalEnrollment += temp.getCurrentEnrollment();
         totalCourses++;
         System.out.println("----------End of report for course number " + totalCourses + " -------------");
      }
   
   
   //final report
      System.out.println("this is the class with the largest enrollment: \n" + largestEnrollment.toString() + "\n----------End of largest course report-------------");
      System.out.println("The total number of courses is: " + totalCourses + "\nThe total enrollment is: " + totalEnrollment + "\nThe average enrollment is: " + ((double)totalEnrollment) / ((double)totalCourses));  
   }
}