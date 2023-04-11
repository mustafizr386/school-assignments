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
   //variable creation
      String [] Names = {"Joey", "Lisa", "Karen", "Mark", "Christopher"};
      double [] Scores = {78.5, 97.0, 42.5, 86.5, 42.5};
      CalculateLowest(Names, Scores);
   
   }
  //i wasn't trying to over achieve with this first assignment, i just thought there'd be more components so i made a function 
   public static void CalculateLowest(String[] Names, double[] Scores)
   {
    //variable creation
      double Lowest = 100;
      String WorstStudents = "";
      String FinalMessage;
      //loop to find the smallest double in the array
      for(int x =0; x < Scores.length; x++)
      {
         if(Lowest > Scores[x])
         {
            Lowest = Scores[x];
         }
      }
      //loop to make a string for all the names that had the lowest scores
      for(int x =0; x < Scores.length; x++)
      {
         if(Lowest == Scores[x])
         {
            WorstStudents += "\n" + Names[x];
         }
      }
      
      FinalMessage = "The Lowest Midterm Score was " + Lowest + "\n\nThe student(s) that earned this score:" + WorstStudents + "\n\n The student(s) may benefit from extra help";
      //the final print
      JOptionPane.showMessageDialog(null,FinalMessage,"Lowest Midterm Score Results", JOptionPane.DEFAULT_OPTION);   
   }
   
}