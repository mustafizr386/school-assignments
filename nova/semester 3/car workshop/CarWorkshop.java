//Mustafiz Rahman
//6/23/2020
//ITP 120 040A
//Professor Gonchar

public class CarWorkshop{
   public static void main(String[]args){
      Vehicle defaultvehicle = new Vehicle();
      System.out.println(defaultvehicle);
      Car defaultCar = new Car();
      System.out.println(defaultCar);
      SportsCar defaultSportscar = new SportsCar();
      System.out.println(defaultSportscar);
      Vehicle rando = new Vehicle("sedan", false, 2011);
      System.out.println(rando);
      Car myCar = new Car("sedan", false, 2006, "Toyota", 22, false); 
      System.out.println(myCar);
      SportsCar dreamCar = new SportsCar("coupe", true, 1967, "Ford", 10.1, false, "Thunderbird", 7.9, 7, 8, 15.8, 133, false);
      System.out.println(dreamCar);
      
      //take my word for it, they all have getters and setters.
   }

}