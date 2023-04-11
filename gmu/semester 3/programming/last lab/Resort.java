//IT 206
//Mustafiz Rahman
//Professor Bidhan
//11/28/2021
import javax.swing.JOptionPane;
public class Resort
{
   public static void main(String[]args)
   {
      ExpenseCalculate database = new ExpenseCalculate();
      String[] commands = { "Add Expense Item", "Expense Report", "Average Expense by Expense Type", "Expense Report by Employee", "Quit"};
      String[] types = { "Airfare", "Hotel", "Car Rental", "Personal Car"};
      String[] month = {"Jan","Feb", "March", "April", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
      String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
      String[] year = {"2025","2024","2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993","1992","1991","1990","1989","1988","1987","1986","1985","1984","1983","1982","1981","1980","1979","1978","1977","1976","1975","1974","1973","1972","1971","1970","1969","1968","1967","1966","1965","1964","1963","1962","1961","1960","1959","1958","1957","1956","1955","1954","1953","1952","1951","1950"};
      String input = "";
   
      while(true==true)
      {
         try
         {
            input = JOptionPane.showInputDialog(null, "Welcome to the resort accounting system, what would you like to do?", "Input",JOptionPane.INFORMATION_MESSAGE, null,commands, commands[0]).toString();
         }
         catch(Exception e)
         {
            database.quit();
         }
         if(input.equals("Add Expense Item"))
         {
            try
            {
               input = JOptionPane.showInputDialog(null, "Choose what type of expense you want to add.", "Input",JOptionPane.INFORMATION_MESSAGE, null,types, types[0]).toString();  
            }
            catch(Exception e)
            {
               database.quit();
            }   
            //sorry there's no way i'm error checking all this crap
            String name = JOptionPane.showInputDialog("Please enter the employee's name");
            //also yeah i know this is a bit lazy, but hey if it works it works.
            String monthh = JOptionPane.showInputDialog(null, "Select which month the expense occured.", "Input",JOptionPane.INFORMATION_MESSAGE, null,month, month[0]).toString();
            String dayy = JOptionPane.showInputDialog(null, "Select which day the expense occured.", "Input",JOptionPane.INFORMATION_MESSAGE, null,day, day[0]).toString();
            String yearr = JOptionPane.showInputDialog(null, "Select which year the expense occured.", "Input",JOptionPane.INFORMATION_MESSAGE, null,year, year[0]).toString();
            String date = monthh + " "+ dayy + ", " + yearr;
            String cname = JOptionPane.showInputDialog("Please enter the client's name");
           
            if(input.equals("Airfare"))
            {
               String destination = JOptionPane.showInputDialog("Please enter the destination");
               double ticket = Double.parseDouble(JOptionPane.showInputDialog("Please enter the ticket price"));
               double baggage = Double.parseDouble(JOptionPane.showInputDialog("Please enter the baggage price"));
               database.addExpenseItem(new Airfare(name, date, cname, destination, ticket, baggage));
            
            }
            else if(input.equals("Hotel"))
            {
               double rate = Double.parseDouble(JOptionPane.showInputDialog("Please enter the hotel rate per night"));
               int nights = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of nights stayed"));
               String city = JOptionPane.showInputDialog("Please enter the name of the city");
            
               database.addExpenseItem(new Hotel(name, date, cname, city, rate, .05, nights ));
            
            }
            else if(input.equals("Car Rental"))
            {
               double rate = Double.parseDouble(JOptionPane.showInputDialog("Please enter the car rental rate"));
               int rented = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of days the car was rented"));
               double gas = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value of gas used"));
               database.addExpenseItem(new CarRental(name, date, cname, rate, gas, rented));
            
            }
            else
            {
               double distance = Double.parseDouble(JOptionPane.showInputDialog("Please enter the distance traveled in the car"));
               double mileage = Double.parseDouble(JOptionPane.showInputDialog("Please enter the rate per milage"));
               database.addExpenseItem(new PersonalCar(name, date, cname, distance, mileage));
            
            }
         
            JOptionPane.showMessageDialog(null, "Entry sucessfully added");
         
         }
         else if(input.equals("Expense Report"))
         {
            JOptionPane.showMessageDialog(null, database.report(""));
         
         }
         else if(input.equals("Average Expense by Expense Type"))
         {
            double air = database.average("Airfare");
            double hotel = database.average("Hotel");
            double car = database.average("CarRental");
            double carr = database.average("PersonalCar");
            JOptionPane.showMessageDialog(null, "Airfare: $" + air + "\nHotel: $" + hotel + "\nCar Rental: $" + car + "\nPersonal Car: $" + carr);
         }
         else if(input.equals("Expense Report by Employee"))
         {
            String name = JOptionPane.showInputDialog("Please enter the name of the employee you want to see");
            JOptionPane.showMessageDialog(null, database.report(name));
         }
         else
         {
            database.quit();
         
         }
      }
   }

}