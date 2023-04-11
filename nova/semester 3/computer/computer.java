//Mustafiz Rahman
//6/17/2020
//ITP 120 040A
//Professor Gonchar

import java.util.*;

public class computer{
	
   public static void main(String[]args)
   {
      computer firstLaptop = new computer(1,40,1.2,1,"my first laptop", "gray");
      System.out.println(firstLaptop.toString());
      computer firstDesktop = new computer(.256,10,.6,1,"my first desktop", "beige");
      System.out.println(firstDesktop.toString());
      computer currentDesktop = new computer(8,1000,3.6,4,"my current desktop", "black");
      computer currentLaptop = new computer(32,500,3.8,4,"my current laptop", "black");
      computer emptyComputer = new computer();
      System.out.println(emptyComputer);
      emptyComputer.setRam(256);
      emptyComputer.setColor("orange");
      System.out.println(emptyComputer);
      System.out.println(currentDesktop.getColor());
      System.out.println(currentLaptop.getRam());
   }
   private double ram;
   private double storage;
   private double cpuspeed;
   private int cores;
   private String name;
   private String color;
	
   computer(double a, double b, double c, int d, String e, String f)
   {
      ram = a;
      storage = b;
      cpuspeed = c;
      cores = d;
      name = e;
      color = f;
   }
   
   computer()
   {
      ram = 0;
      storage = 0;
      cpuspeed = 0;
      cores = 0;
      name = "none";
      color = "none";
   }
   
   public String toString()
   {
      return "The computer named "+ name + " is the color " + color + ", has " + ram + "GB of ram, has " + storage + "GB of storage, runs at "+ cpuspeed +"GHz and had " + cores +" core/s.";
   }
	
   public String getColor()
   {
      return color;
   }
	
   public double getRam()
   {
      return ram;
   }
   
   public void setColor(String newColor)
   {
      color = newColor;
   }
	
   public void setRam(double newRam)
   {
      ram = newRam;
   }
}