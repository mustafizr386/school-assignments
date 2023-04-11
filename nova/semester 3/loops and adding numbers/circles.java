import java.util.*;

public class circles{
	
   public static void main(String[]args)
   {
      circles test = new circles(3.5,"nigger");
      System.out.println(test.toString());
      System.out.println(test.getArea());
      System.out.println(test.getCircumference());
   }
	private double radius;
	private String color;
	
	circles(double a,String b)
	{
		radius = a;
		color = b;
	}
	
	public String toString()
	{
		return "Radius of " + radius + " and " + color + " color.";
	}
	
	public double getArea()
	{
		return Math.PI * Math.pow(radius,2);
	}
	
	public double getCircumference()
	{
		return 2 * Math.PI * radius;
	}
}