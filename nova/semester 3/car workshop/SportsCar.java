public class SportsCar extends Car{
   protected String ModelName;
   protected double ZeroToSixty,Displacement,QuarterMile,topSpeed,Cylinders;
   protected boolean convertible;
  
   public SportsCar()
   {
      ModelName = "Testarossa";
      ZeroToSixty = 5.2;
      Displacement = 4.9;
      Cylinders = 12;
      QuarterMile = 13.5;
      topSpeed = 180;
      convertible = false;
   }
    
   public SportsCar(String type, boolean lux, int y, String br, double fu, boolean el, String m, double z, double d, double c, double q, double t, boolean co)
   {
      super(type,lux,y,br,fu,el);
      ModelName = m;
      ZeroToSixty = z;
      Displacement = d;
      Cylinders = c;
      QuarterMile = q;
      topSpeed = t;
      convertible = co;
   }
   
   public String toString(){
      if(convertible)
      {
         return super.toString() + " This sports car is called a " + ModelName + " and is a convertible with a " + Displacement + "L " + Cylinders + " Cylinder and has a quarter mile of " + QuarterMile + " and a top speed of " + topSpeed +  "mph.";
      }
      return super.toString() + " This sports car is called a " + ModelName + " and is a " + Displacement + "L " + Cylinders + " Cylinder and has a quarter mile of " + QuarterMile + " and a top speed of " + topSpeed +  "mph.";
   }
   
   
   public void setModelName(String a)
   {
      this.ModelName = a;
   }
   public void setZeroToSixty(double a)   
   {
      this.ZeroToSixty = a;
   }
      public void setDisplacement(double a)   
   {
      this.Displacement = a;
   }
      public void setQuarterMile(double a)   
   {
      this.QuarterMile = a;
   }
      public void settopSpeed(double a)   
   {
      this.topSpeed = a;
   }
      public void setCylinders(double a)   
   {
      this.Cylinders = a;
   }
   public void setconvertible(boolean a)
   {
      this.convertible = a;
   }
   
   public String getModelName()
   {
      return ModelName;
   }
   public double getZeroToSixty()
   {
      return ZeroToSixty;
   }
      public double getDisplacement()
   {
      return Displacement;
   }
      public double getQuarterMile()
   {
      return QuarterMile;
   }
      public double gettopSpeed()
   {
      return topSpeed;
   }
      public double getCylinders()
   {
      return Cylinders;
   }
   public boolean getconvertible()
   {
      return convertible;
   }
}