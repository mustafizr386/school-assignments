public class ExpenseCalculate
{
   private Expense [] expenses;
//basic constructor
   public ExpenseCalculate()
   {
      expenses = new Expense[1];
   }
   //adding stuff into the array
   //also it was supposed to do error checking, but eh
   public void addExpenseItem(Expense item)
   {
   
      if(expenses[expenses.length-1] != null)
      {
         Expense [] temp = new Expense[expenses.length + 1];
         for(int i = 0; i < expenses.length; i++)
         {
            temp[i] = expenses[i];
         }
         expenses = temp;
      }
      expenses[expenses.length-1] = item;
   
   }
   //calculates the average based off what type it's given
   public double average(String type)
   {
      double average = 0;
      if(expenses[0] == null)
      {
         return 0;
      }
      else
      {
         for(int i = 0; i <expenses.length; i++)
         {
            if(expenses[i].getType().equals(type))
            {
               average += expenses[i].calculate();
            }
         }
      }
      return average / expenses.length;
   }
   //creates a report based off the parameter
   public String report(String param)
   {
      String info = "";
      for(int i = 0; i < expenses.length && expenses[i] != null; i++)
      {
         if(param.equals("") || param.equals(expenses[i].getEmployee()))
         {
            if(info != "")
            {
               info += "\n";
            }
            info += expenses[i].getDate() + " - " + expenses[i].getEmployee() + " - " + expenses[i].getType() + " - " + expenses[i].calculate();
         }
      }
      return info;
   }
   //self explanatory
   public void quit()
   {
      System.exit(0);
   }
}