//IT 206
//Mustafiz Rahman
//Professor Bidhan
//9/5/2021
//sorry no detailed/dumb comments, this is too bare bones of an assignment to write much. 


public class Car
{
   private String make;
   private String model;
   private String color;
   private double baseCost;
   public double max;
   
   public static int nigger = 123; 
   public int gook;
   
   public Car(){
      gook = nigger++;
   
   }
   public Car(String make){
      this();
      this.make = make;
   }
   public Car(String make, String model){
      this();
      this.make = make;
       
       //this(model);
   }
   public String getMake()
   {
      return make;
   }
   public String getModel()
   {
      return model;
   
   }
    public static int getniggers()
   {
      return nigger;
   
   }
   public String getColor()
   {
      return color;
   }
   public double getBaseCost()
   {
      return baseCost;
   }
   public void setMake(String make)
   {
      this.make = make;
   }
   public void setModel(String model)
   {
      this.model = model;
   
   }
   public void setColor(String color)
   {
      this.color = color;
   
   }
   public void setBaseCost(Double baseCost)
   {
      if(max < baseCost)
      {
         max=  baseCost;
      }
      this.baseCost = baseCost;
   
   }
   public double calculateFinalCost()
   {
      return baseCost * 1.05;
   } 
   public double biggestvalue()
   {
      return max;   
   }
}

