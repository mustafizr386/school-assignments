//IT 206
//Mustafiz Rahman
//Professor Bidhan
//9/26/2021
//

public class CourseRegistration
{
//--------------variables
   private int number;
   private String name;
   private int creditHour;
   private int currentEnrollment; 

//---------------constructors?? it wasn't part of my first submission and there was no comment about missing it, but i don't want to lose points in case it was required.

   public CourseRegistration()
   {
   }

   public CourseRegistration(int number, String name, int creditHour, int currentEnrollment)
   {
      this.number = number;
      this.name = name;
      this.creditHour = creditHour;
      this.currentEnrollment = currentEnrollment;
   
   }

//---------------getters
   public int getNumber()
   {
      return number;
   }

   public String getName()
   {
      return name;
   }

   public int getCreditHour()
   {
      return creditHour;
   }

   public int getCurrentEnrollment()
   {
      return currentEnrollment;
   }

//-------------setters
   public void setNumber(int number)
   {
      this.number = number;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public void setCreditHour(int creditHour)
   {
      this.creditHour = creditHour;
   }

   public void setCurrentEnrollment(int currentEnrollment)
   {
      this.currentEnrollment = currentEnrollment;
   }

//-----------------functions

   public int availibleSeat()
   {
      return 30 - currentEnrollment;
   }

   public double courseCost()
   {
      return creditHour * 670.00;
   }

//-----------------tostring

   public String toString()
   {
      return "the course id is: " + number + "\nthe name of the course is: " + name + "\nthe number of credit hours the course is worth is: " + creditHour + "\nthe current enrollment is: " + currentEnrollment + "\nthe number of seats availible is: "+ availibleSeat() + "\nthe course cost is: " + courseCost();
      
   }
}
