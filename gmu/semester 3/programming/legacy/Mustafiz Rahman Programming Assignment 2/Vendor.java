//IT 206
//Professor Bidhan
//10/10/2021
//Mustafiz Rahman

public class Vendor
{
   private int tableID;
   private String name;
   private String type;
   private int visitorNum;
   private int interviewNum;
   private int cost;
//basic constructor with some basic error checking so the cost calculation doesn't get all messed up
   public Vendor(int tableID, String name, String type)
   {
      this.tableID = tableID;
      this.name = name;
      type = type.toLowerCase();
      if(type.equals("sponsor"))
      {
         this.type = "Sponsor";
         cost= 1000;
      }
      else if(type.equals("for profit"))
      {
         this.type = "For Profit";
         cost= 550;
      }
      else if(type.equals("nonprofit"))
      {
         this.type = "Nonprofit";
         cost= 300;
      }
      else
      {
         System.out.println("invalid type entered, default set to Sponsor");
         this.type = "Sponsor";
         cost= 1000;
      }
   
   
      interviewNum=0;
      visitorNum=0;
   }
  
//getters, nothing much else to say
   public int getTableID()
   {
      return tableID;
   }

   public String getName()
   {
      return name;
   }

   public String getType()
   {
      return type;
   }

   public int getVisitorNum()
   {
      return visitorNum;
   }
   public int getInterviewNum()
   {
      return interviewNum;
   }
   public int getCost()
   {
      return cost;
   }
//setters, and same comment as before
   public void setVisitorNum(int visitorNum)
   {
      this.visitorNum = visitorNum;
   }
   public void setInterviewNum(int interviewNum)
   {
      this.interviewNum = interviewNum;
   }
}