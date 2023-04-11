//Mustafiz Rahman
//6/14/2020
//ITP 120 040A
//Professor Gonchar

public class loops_for_adding_numbers
{

   public static void main(String[]args)
   {
    int [] nums={2,4,5,7,3,4,6,3,5,2};
    int total = 0;
    for(int x = 0; x < nums.length;x++)
    {
      total += nums[x];
    }
    float average = (float)total/nums.length;
    System.out.println("the sum of nums is: " + total);
    System.out.println("the average of nums is: " + average);
   }

}