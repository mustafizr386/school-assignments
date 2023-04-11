//IT 206
//Mustafiz Rahman
//Professor Bidhan
//10/24/2021
public class skateCamp
{

   private participant [] participants;
   private int max;
   private double price;
   private String courseType;
   private int size;
   public skateCamp(int max, String courseType)
   {
      this.max  = max;
      this.courseType = courseType;
      if(courseType.equals("figure skating"))
      {
         price = 200;
      
      }
      else
      {
         price = 100;
      }
      size = 0;
      participants = new participant[max];
   }
   
   public void enroll(participant student, register registered)
   {
      if(registered.getRegistered(student) != null && student.getEnrolled() != 3)
      {
         if(size == max)
         {
            System.out.println("sorry the class is full");
         }
         else
         {
            registered.incEnrolled(student);
            registered.setCost(price, student);
         
         
            for(int x = 0; x < max; x++)
            {
               if(participants[x] == null)
               {
                  participants[x] = student;
                  break;
               }
                 
            }
            
            size++;
         }
      
      }
      else
      {
         System.out.println("sorry, this student is enrolled in too many courses");
      }
   }
   
   public void remove(participant student)
   {
      boolean found = false;
      for(int x = 0; x < max; x++)
      {
         if(participants[x] == student)
         {
            participants[x] = null;
            found = true;
            break;
         }
                 
      }
      if(found)
      {
         size--;
      }
      else
      {
         System.out.println("student wasn't found");
      }
   }
   
   public String printParticipant(participant student)
   {
      return student.toString();
   }
   
   public void Quit()
   {
      System.out.println(toString());
      System.exit(0);
   
   }
   public String toString()
   {
      String temp = "Students participating in "+ courseType +" class:\n";
      for(int x = 0; x < participants.length; x++)
      {
         if(participants[x] != null)
         {
            temp += participants[x].toString() + "\n";
         }
      }
      temp += size + "/" + max + " are filled";
      return temp;
   }

}