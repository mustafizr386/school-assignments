//IT 206
//Professor Bidhan
//9/5/2021

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class UsedCarDealership
{

   public static void main(String[] args)
   {
   ar test = create();
 //     test.setMake("Buick");
      test.setColor("Black");
      test.setModel("GNX");
      test.setBaseCost(15999.99);
      System.out.println(test.getMake());
            System.out.println(test.getColor());

      System.out.println(test.getModel());

      System.out.println(test.getBaseCost());
      System.out.println(test.calculateFinalCost());


      Car pest = create();
//      pest.setMake("Cadillac");
      pest.setColor("Pink");
      pest.setModel("Coupe Deville");
      pest.setBaseCost(9999.99);
      System.out.println(pest.getMake());
            System.out.println(pest.getColor());

      System.out.println(pest.getModel());

      System.out.println(pest.getBaseCost());
      System.out.println(pest.calculateFinalCost());
      System.out.println(pest.biggestvalue());
      
      WeightWatchers newtest = new WeightWatchers(90);
      WeightWatchers anothertest = new WeightWatchers(900);
      WeightWatchers finaltest = new WeightWatchers(155.6);
      finaltest.setWeight(195.5);
      System.out.println(finaltest.isInShape());
      finaltest.setWeight(155.6);
      finaltest.setName("dumb Nigger");
      System.out.println(finaltest.isInShape());
      finaltest.setIdealWeight(1996);
     
     CourseRegistration nigger = new CourseRegistration(13425, "niggerology", 5, 22);
     System.out.println(nigger.toString());
     
     Car pestt = new Car("peener");
     System.out.println(Car.getniggers());
     
     
     
     
     
     Vendors yee = new Vendors();
     
     Vendor peen = new Vendor(123,"niggers","jews");
     
     yee.registerVendors(peen);
     yee.registerVendors(new Vendor(332,"faggots", "nonprofit"));
     yee.registerVendors(new Vendor(3432,"fag3gots", "nonprofit"));
     yee.registerVendors(new Vendor(3632,"peeners", "for Profit"));
     yee.removeVendors(yee.searchTable(123,"niggers"));
     System.out.println(yee.visitVendors(yee.searchTable(332,"faggots")));
     System.out.println(yee.displayVendors());
     yee.exitVendors();
     System.out.println("test");
     
   }
   public static Car create()
   {
      return new Car("Cadillac");
   }
}