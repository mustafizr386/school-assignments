//IT 206
//Professor Bidhan
//10/10/2021
//Mustafiz Rahman

public class Vendors
{

   private Vendor[] listOfVendors = new Vendor[49];
//pretty simple for loop that just looks for an empty spot in the array
   public void registerVendors(Vendor newVendor)
   {
      boolean foundslot = false;
      for(int x = 0; x< listOfVendors.length && !foundslot; x++)
      {
         if(listOfVendors[x] == null)
         {
            listOfVendors[x] = newVendor;
            foundslot = true;
         }
      }
      if(!foundslot)
      {
         System.out.println("Sorry, the venue is full, no more vendors may register for this event");
      }
   }
//same works the exact same as above but instead of looking for nulls it looks for the same object
   public void removeVendors(Vendor delVendor)
   {
      boolean foundslot = false;
      for(int x = 0; x< listOfVendors.length; x++)
      {
         if(listOfVendors[x] == delVendor)
         {
            listOfVendors[x] = null;
            foundslot = true;;
         }
      }
      if(!foundslot)
      {
         System.out.println("the venue you tried deleting does not exist");
      }
   }
//to not repeat my self on every single method, they basically all have the same framework
//although this one is more similar to the delete one as it's looking for one specific vendor and just returning a string
   public String visitVendors(Vendor visit)
   {
      boolean interviewed = false;
      if(visit != null)
      {
         for(int x = 0; x< listOfVendors.length; x++)
         {
            if(listOfVendors[x] == visit)
            {
               if(listOfVendors[x].getInterviewNum() < 15)
               {
                  listOfVendors[x].setInterviewNum(listOfVendors[x].getInterviewNum()+1);
                  interviewed = true;
               }
               listOfVendors[x].setVisitorNum(listOfVendors[x].getVisitorNum()+1);
               if(interviewed)
               {
                  return "you sucessfully visited " + listOfVendors[x].getName() + " and were able to be interviewed by them";
               }
               return "you sucessfully visited " + listOfVendors[x].getName() + " and weren't able to be interviewed by them";
            }
         }
      }
      return "the vendor you entered doesn't exist";
   }
//idk how i forgot to add this for my design part, but i figured it was too annoying to make the same exact vendor object so you could delete it or visit it, so instead i made this search up method.
   public Vendor searchTable(int tableID, String name)
   {
      for(int x = 0; x< listOfVendors.length; x++)
      {
         if(listOfVendors[x] != null)
         {
            if(listOfVendors[x].getTableID() == tableID && listOfVendors[x].getName().equals(name))
            {
               return listOfVendors[x];
            }
         }
      }
      
      System.out.println("the table you're looking for doesn't exist");
      return null;
   }
//it's just a report of all the vendors in the table with some extra fluff in the messages so it looks nice
   public String displayVendors()
   {
      String output = "";
     
      for(int x = 0; x< listOfVendors.length; x++)
      {
         if(listOfVendors[x] != null)
         {
            output += listOfVendors[x].getName() + " is a "+ listOfVendors[x].getType() + " and is on table number #" + listOfVendors[x].getTableID() + ". they've had " + listOfVendors[x].getVisitorNum() + " visitors so far and they paid " + listOfVendors[x].getCost() + " for their table. ";
           
            if(listOfVendors[x].getInterviewNum() == 15)
            {
               output += "All 15 of their interview slots have been filled\n";
            }
            else
            {
               output += listOfVendors[x].getInterviewNum() + " out of 15 of their interview slots have been filled.\n";
            }
            
         }
      }
      if(output.equals(""))
      {
         return "there is no vendor data availible";
      }
      return output;
   }
//uhh the assignment wanted an exit command but it also said not to use system.exit, so i'm not too sure what this is really supposed to do, but what i made it do is just do a final report and exit the program. i kinda work on these last day so not much i can do on asking questions beforehand
   public void exitVendors()
   {
      int count = 0;
      int totalCash = 0;
      for(int x = 0; x< listOfVendors.length; x++)
      {
         if(listOfVendors[x] != null)
         {
            count++;
            totalCash += listOfVendors[x].getCost();
         }
      }
      System.out.println(count + " out of 50 possible vendors participated in this event. $" + totalCash + " dollars was raised from this event");
    
      System.exit(0);
   }
}