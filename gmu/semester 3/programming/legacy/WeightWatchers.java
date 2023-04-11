//IT 206
//Mustafiz Rahman
//Professor Bidhan
//9/12/2021
//

public class WeightWatchers
{
   private String name;
   private double weight;
   private double idealWeight;

   public WeightWatchers(double idealWeight)
   {
      if(idealWeight > 200)
      {
         this.idealWeight = 200;
         System.out.println("Ideal weight out of range, ideal weight has been reduced to 200 lbs");
      }
      else if(idealWeight < 120)
      {
         this.idealWeight = 120;
         System.out.println("Ideal weight out of range, ideal weight has been increased to 120 lbs");
      }
      else
      {
         this.idealWeight = idealWeight;
      }
   }
   
   public void setName(String name)
   {
      this.name = name;
   }

   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   public void setIdealWeight(double idealWeight)
   {
      if(idealWeight > 200)
      {
         this.idealWeight = 200;
         System.out.println("Ideal weight out of range, ideal weight has been reduced to 200 lbs");
      }
      else if(idealWeight < 120)
      {
         this.idealWeight = 120;
         System.out.println("Ideal weight out of range, ideal weight has been increased to 120 lbs");
      }
      else
      {
         this.idealWeight = idealWeight;
      }
   }
   
   public String getName()
   {
      return name;
   }

   public double getWeight()
   {
      return weight;
   }
   
   public double getIdealWeight()
   {
      return idealWeight;
   }
   
   public boolean isInShape()
   {
      return weight <= idealWeight;
   }
}