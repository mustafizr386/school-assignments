public class Vehicle{
   protected String VehicleType;
   protected boolean luxury;
   protected int year;
  
   public Vehicle()
   {
      VehicleType = "coupe";
      luxury = true;
      year = 1984; 
   }
    
   public Vehicle(String type, boolean lux, int y)
   {
      VehicleType = type;
      luxury = lux;
      year = y; 
   }
   
   public String toString(){
      if(luxury)
      {
         return "this is a luxury " + VehicleType + " from " + year;
      }
      return "this is a " + VehicleType + " from " + year;
   }
   
   public void setVehicleType(String a)
   {
      this.VehicleType = a;
   }
   public void setluxury(boolean a)   
   {
      this.luxury = a;
   }
   public void setyear(int a)
   {
      this.year = a;
   }
   
   public String getVehicleType()
   {
      return VehicleType;
   }
   public boolean getluxury()
   {
      return luxury;
   }
   public int getyear()
   {
      return year;
   }
}