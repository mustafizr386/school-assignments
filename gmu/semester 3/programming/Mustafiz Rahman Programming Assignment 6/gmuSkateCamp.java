//IT 206
//Mustafiz Rahman
//Professor Bidhan
//10/24/2021
import javax.swing.JOptionPane;
public class gmuSkateCamp
{
//yeah... i kinda screwed up and made this too complicated and didn't have enough time to finish it :( at least you can use the register button though. 
   public static void main(String[]args)
   {
      skateCamp figure = new skateCamp(30,"figure skating");
      skateCamp shorttrack = new skateCamp(30,"short track skating");
      skateCamp speed = new skateCamp(30,"speed skating");
      skateCamp ice = new skateCamp(30,"ice skating");
      register list = new register();
      skateCamp selected = figure;
      String[] commands = { "Enroll Participant", "Register Participant", "Remove Participant", "Participant Info", "Exit"};
      String[] types = { "figure skating", "short track skating", "speed skating", "ice skating"};
      String[] tf = {"True","False"};
      participant[] names;
      String input= "";
   
      while(true==true)
      {
         try
         {
            input = JOptionPane.showInputDialog(null, "Welcome to the GMU skate camp, what would you like to do?", "Input",JOptionPane.INFORMATION_MESSAGE, null,commands, commands[0]).toString();
         }
         catch(Exception e)
         {
            selected.Quit();
         }
         if(input.equals("Register Participant"))
         {
            String name = JOptionPane.showInputDialog("Please enter the name");                    
            int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter the age"));
            boolean male;
            boolean Sponsored;
            if(JOptionPane.showInputDialog(null, "Are they male?", "Input",JOptionPane.INFORMATION_MESSAGE, null,tf, tf[0]).toString().equals("True"))
            {
               male = true;
            
            }
            else
            {
               male = false;
            
            }
            if(JOptionPane.showInputDialog(null, "Are they Sponsored?", "Input",JOptionPane.INFORMATION_MESSAGE, null,tf, tf[0]).toString().equals("True"))
            {
               Sponsored = true;
            
            }
            else
            {
               Sponsored = false;
            
            }
            list.addRegister(new participant(name, age, male, Sponsored));
         
         }
         else if(input.equals("Enroll Participant"))
         {
            try
            {
               input = JOptionPane.showInputDialog(null, "which skating program would you like to enroll into", "Input",JOptionPane.INFORMATION_MESSAGE, null,types, types[0]).toString();
            }
            catch(Exception e)
            {
               selected.Quit();
            }
            if(input.equals("figure skating"))
            {
               selected =figure;
            }
            else if(input.equals("short track skating"))
            {
               selected =shorttrack;
            }
            else if(input.equals("speed skating"))
            {
               selected =speed;
            }
            else
            {
               selected =ice;
            }
           // for(int x = 0; x < selected; x++)
            //{
              // names[x] = 
            //}
         }
         else if(input.equals("Remove Participant"))
         {
         
         }
         else if(input.equals("Participant Info"))
         {
         
         }
         else
         {
            selected.Quit();
         
         }
      }
   }


}