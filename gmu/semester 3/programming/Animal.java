public abstract class Animal {
   private String name;
   private int age;
   private double healthRating;
   private static int numAnimals = 0;

   public Animal(String name, int age, double healthRating) {
      this.name = name;
      this.age = age;
      this.healthRating = healthRating;
      ++numAnimals;
   }

   public String getName() { 
      return this.name; }
   public int getAge() { 
      return this.age; }
   public double getHealthRating() { 
      return this.healthRating; }
   public static int getNumAnimals() { 
      return numAnimals; }

   /** START: BLOCK #1
     * Create a method that will enforce all classes that inherit from the Animal class
     * will need to implement a getNoise() method
     */
   public abstract String getNoise();
    
     /** END: BLOCK #1 **/

   public String toString() {
      return "Name: " + this.name + "\n"
         + "Age: " + this.age + "\n"
         + "Health Rating: " + this.healthRating;
   }
}



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
   }
  
   /** END: BLOCK #3 **/  

  
   public String toString() {
      return super.toString()
         + "\nHas Claws: " + (this.hasClaws ? "Yes" : "No");
   }
}

import javax.swing.JOptionPane;
public class VeterinaryClinic {
   public static void main(String[] args) {
      final int MAX_NUM_ANIMALS = 10;
   
      Animal[] patients = new Animal[MAX_NUM_ANIMALS];
      admit(patients);
   
      displayAll(patients);
   }

   private static void admit(Animal[] patients) {
      JOptionPane.showMessageDialog(null, "Adding animals to the list of patients");
      patients[0] = new Cat("Felix", 12, false, 4.5);
      patients[1] = new Bird("Polly", 3, 8.3);
   }

   private static void displayAll(Animal[] patients) {
   
      String output = "**Patient Summary**\n\n";
   
      /** START: BLOCK #4
       * Write a loop that will append the object details and noise of each animal to the output string
      */
       
      for(int x = 0; x < patients.length; x++)
      {
      output += patients[x].toString() + patients[x].getNoise();
      }
      
      /** END: BLOCK #4 **/
   
     
      JOptionPane.showMessageDialog(null, output);
   }
}