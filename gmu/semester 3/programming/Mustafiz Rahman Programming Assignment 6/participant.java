//IT 206
//Mustafiz Rahman
//Professor Bidhan
//10/24/2021

public class participant
{
   private String name;
   private int age;
   private boolean male;
   private String phonenum;
   private String email;
   private boolean sponsored;
   private double cost;
   private int enrolled;
   
   participant(String name, int age, boolean male, boolean sponsored)
   {
      this.name = name;
      this.age = age;
      this.male = male;
      this.sponsored = sponsored;
      cost = 0;
      email = "empty@email.com";
      phonenum = "000-000-0000";
      enrolled = 0;
   }
   public double getCost()
   {
      return cost;
   }
   public int getEnrolled()
   {
      return enrolled;
   }
   public String getName()
   {
      return name;
   }
   public void setEnrolled(int enrolled)
   {
      this.enrolled = enrolled;
   }
   public void setCost(double cost)
   {
      this.cost = cost;
   }
   
   public void setPhonenum(String phonenum)
   {
      if(checkPhone(phonenum))
      {
         this.phonenum = phonenum;
      }
      else
      {
         System.out.println("incorrect phone number input, phone number should look like this xxx-xxx-xxxx (x = number)");
      }
   }
   
   public void setEmail(String email)
   {
      if(checkEmail(email))
      {
         this.email = email;
      }
      else
      {
         System.out.println("incorrect email input, email should look like this xxxx@xxxx.yyy (x = character, number, or _ | y = character only)");
      }
   }
   
   public int getAge()
   {
      return age;
   }
   public boolean getSponsored()
   {
      return sponsored;
   }
   public Boolean checkEmail(String email)
   {
      boolean atused = false;
      boolean periodafterat = false;
      int counter = 0;
      boolean passed = true;
      if((email.length() > 0)&&(checkLetter(email.charAt(0)) || checkNumber(email.charAt(0))))
      {
         for(int x = 1; x < email.length(); x++)
         {
            if(email.charAt(x) == '@')
            {
               if(atused)
               {
                  passed = false;
                  break;
               }
               atused = true;
            }
            else if(email.charAt(x) == '.')
            {
               if(atused)
               {
                  periodafterat = true;
               }
            }
            else if(!(checkLetter(email.charAt(x)) || checkNumber(email.charAt(x)) || email.charAt(x) == '_'))
            {
               passed = false;
               break;
            }
            if(periodafterat && checkLetter(email.charAt(x)))
            {
               counter++;
            }
                       
         }
         if(counter < 2)
         {
            passed = false;
         }
      }
      else
      {
         passed = false;
      }
      return passed;
   }
   public boolean checkPhone(String phonenum)
   {
      boolean passed = true;
      if(phonenum.length() == 12)
      {
         for(int x = 0; x < 12; x++)
         {
            if(x == 3 || x == 7)
            {
               if(phonenum.charAt(x) != '-')
               {
                  passed = false;
                  break;
               }
            
            }
            else
            {
               if(!checkNumber(phonenum.charAt(x)))
               {
                  passed = false;
                  break;
               }
            }
         }
      }
      else
      {
         passed = false;
      }
      return passed;
   }
   public boolean checkLetter(char letter)
   {
      return (letter > 64 && letter < 91) || (letter > 96 && letter <123);
   }
   public boolean checkNumber(char number)
   {
      return number> 47 && number < 58;
   }
   public String toString()
   {
      String temp = name + " are ";
      if(male)
      {
         temp += "male";
      }
      else
      {
         temp += "female";
      }
      temp += " and are " + age + " years old and ";
      if(sponsored)
      {
         temp += "are sponsored";
      }
      else
      {
         temp += "are not sponsored";
      }
      return temp + ". They are enrolled in " + enrolled + " classes with a total cost of " + cost + ". Their phone number is:" +phonenum + " their email is:" + email ;
   }
}