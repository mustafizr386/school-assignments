

public class Cat extends Animal {
   boolean hasClaws;

   /** START: BLOCK #2
    *  Create a constructor that takes in and sets a cat's name, age, if it has claws
    *  and its health rating
    */
   
   public Cat(String name, int age, boolean hasClaws, double healthRating)
   {
      super(name,age,healthRating);
      this.hasClaws = hasClaws;
   }
   
   /** END: BLOCK #2 **/


   /** START: BLOCK #3
    * Create an overridden getNoise() method that returns the noise a cat will make based
    * on its health rating
    */
   
   public String getNoise()
   {
      if(super.getHealthRating() < 8.0)
      {
         return "Hiss";
      }
      return "Meow";
   }
  
   /** END: BLOCK #3 **/  

  
   public String toString() {
      return super.toString()
         + "\nHas Claws: " + (this.hasClaws ? "Yes" : "No");
   }
}

