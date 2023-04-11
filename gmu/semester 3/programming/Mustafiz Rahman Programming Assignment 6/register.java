//IT 206
//Mustafiz Rahman
//Professor Bidhan
//10/24/2021

public class register
{
//i wanted to use an array list but i don't remember if that's been covered yet :(

   private participant[] registered;
   
   public register()
   {
      registered = new participant[1];
   }
   
   public void incEnrolled(participant looking)
   {
      for(int x = 0; x < registered.length-1; x++)
      {
         if(registered[x] == looking)
         {
            registered[x].setEnrolled(registered[x].getEnrolled() + 1);
            break;
         }
         
      }
    
   }
   public void setCost(double cost, participant looking)
   {
      for(int x = 0; x < registered.length-1; x++)
      {
         if(registered[x] == looking)
         {
            if(registered[x].getSponsored())
            {
               registered[x].setCost(registered[x].getCost() + (cost * .9));
            }
            else
            {
               registered[x].setCost(registered[x].getCost() + (cost));
            }
            break;
         }
         
      }
   
   }
   
   public void addRegister(participant newregister)
   {
   //what if they're older than 30 but they identify younger, or vice versa haha.
      if(newregister.getAge() > 7 && newregister.getAge() < 31)
      {
         participant[] temp = new participant[registered.length+1]; 
         registered[registered.length-1] = newregister;
         for(int x = 0; x < registered.length; x++)
         {
            temp[x] = registered[x];
         }
         registered = temp;
      }
      
   }
   
   public participant getRegistered(participant looking)
   {
      for(int x = 0; x < registered.length-1; x++)
      {
         if(registered[x] == looking)
         {
            return registered[x];
         }
         
      }
      System.out.println("student was not found");
      return null;
   }
   
   public String toString()
   {
      String temp = "Students registed:\n";
      for(int x = 0; x < registered.length-1; x++)
      {
         temp += registered[x].toString() + "\n";
      }
      return temp;
   }
}