public class Car extends Vehicle{
   protected String Brand;
   protected double fuelEconomy;
   protected boolean electric;
  
   public Car()
   {
      Brand = "Ferrari";
      fuelEconomy = 11;
      electric = false;
   }
    
   public Car(String type, boolean lux, int y, String br, double fu, boolean el)
   {
      super(type,lux,y);
      Brand = br;
      fuelEconomy = fu;
      electric = el;
   }
   
   public String toString(){
      if(electric)
      {
         return super.toString() + ". It's an electric car made by " + Brand + ".";
      }
      return super.toString() + ". It's made by " + Brand + " and has a fuel economy of " + fuelEconomy + "mpg.";
   }
   
   public void setBrand(String a)
   {
      this.Brand = a;
   }
   public void setfuelEconomy(double a)   
   {
      this.fuelEconomy = a;
   }
   public void setelectric(boolean a)
   {
      this.electric = a;
   }
   
   public String getBrand()
   {
      return Brand;
   }
   public double getfuelEconomy()
   {
      return fuelEconomy;
   }
   public boolean getelectric()
   {
      return electric;
   }
}