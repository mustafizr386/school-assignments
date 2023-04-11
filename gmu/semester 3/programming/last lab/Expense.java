//IT 206
//Mustafiz Rahman
//Professor Bidhan
//11/28/2021

//this is all the stuff that the objects must have
public abstract class Expense
{
   public String employee, date, client, type;
   
   public String getEmployee()
   {
      return employee;
   }
   public String getDate()
   {
      return date;
   }
   public String getClient()
   {
      return client;
   }
   public String getType()
   {
      return type;
   }
   public abstract double calculate();

}

//this is the same for every other class below this as well, but this is just the special parameters for each class
class Airfare extends Expense
{
   private String destination;
   private double ticket, baggage;

   public Airfare(String employee,String date,String client,String destination,double ticket,double baggage)
   {
      this.employee = employee;
      this.date = date;
      this.client = client;
      this.type = "Airfare";
      this.destination = destination;
      this.ticket = ticket;
      this.baggage = baggage;
   }

   public double calculate()
   {
      return ticket + baggage;
   }

}

class Hotel extends Expense
{
   private double tax, rate;
   private int numOfNights;
   private String city;

   public Hotel(String employee,String date,String client,String city,double tax,double rate, int numOfNights)
   {
      this.employee = employee;
      this.date = date;
      this.client = client;
      this.type = "Hotel";
      this.city = city;
      this.tax = tax;
      this.rate = rate;
      this.numOfNights = numOfNights;
   }
   
   public double calculate()
   {
      return (numOfNights * rate) * (tax + 1);
   }
}

class CarRental extends Expense
{
   private double rate, gas;
   private int days;

   public CarRental(String employee,String date,String client,double rate,double gas,int days)
   {
      this.employee = employee;
      this.date = date;
      this.client = client;
      this.type = "CarRental";
      this.rate = rate;
      this.gas = gas;
      this.days = days;
   }
   
   public double calculate()
   {
      return (rate * days) + gas;
   }
}

class PersonalCar extends Expense
{
   private double distance, rate;
   
   public PersonalCar(String employee,String date,String client,double distance,double rate)
   {
      this.employee = employee;
      this.date = date;
      this.client = client;
      this.type = "PersonalCar";
      this.distance = distance;
      this.rate = rate;
   }
   
   public double calculate()
   {
      return distance * rate;
   }
}