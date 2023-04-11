//IT 206
//Professor Bidhan
//10/10/2021
//Mustafiz Rahman

import javax.swing.JOptionPane;
public class VendorFair
{
   public static void main(String[]args)
   {
   //just the arrays for the drop down and some variables since java wasn't happy with how i normally set it up
      Vendors example = new Vendors();
      String[] commands = { "Add Vendor", "Remove Vendor", "Show Vendors", "Visit Vendors", "Exit"};
      String[] types = { "Sponsor", "For Profit", "Nonprofit"};
      String input= "";
      String name = "";
      String type = "";
      int tableID = 0;

      while(true==true)
      {
         try
         {
            input = JOptionPane.showInputDialog(null, "Welcome to the fair, what would you like to do?", "Input",JOptionPane.INFORMATION_MESSAGE, null,commands, commands[0]).toString();
         }
         catch(Exception e)
         {
            example.exitVendors();
         }
         //i was going to add more error checking but i don't even think this is part of the grade
         if(input.equals("Add Vendor"))
         {
            try
            {
               tableID = Integer.parseInt(JOptionPane.showInputDialog("Please input the tableID (numbers only)"));
            }
            catch(Exception e)
            {
               System.out.println("invalid tableID, Please enter only numbers");
            }
            name = JOptionPane.showInputDialog("Please enter the company name");
            type = JOptionPane.showInputDialog(null, "Choose the Vendor type", "Input",JOptionPane.INFORMATION_MESSAGE, null,types, types[0]).toString();
            example.registerVendors(new Vendor(tableID, name, type));
         }
         //i was also going to do the drop down thing here as well but ehh. also it makes my searchTable function uselss as well if i was to do that.
         else if(input.equals("Remove Vendor"))
         {
            tableID = Integer.parseInt(JOptionPane.showInputDialog("Please input the tableID of the vendor you want to delete (numbers only)"));
            name = JOptionPane.showInputDialog("Please enter the name of the company you want to delete");
            example.removeVendors(example.searchTable(tableID, name));
         
         }
         
         else if(input.equals("Show Vendors"))
         {
            System.out.println(example.displayVendors());
         }
         
         else if(input.equals("Visit Vendors"))
         {
            tableID = Integer.parseInt(JOptionPane.showInputDialog("Please input the tableID of the vendor you want to visit (numbers only)"));
            name = JOptionPane.showInputDialog("Please enter the name of the company you want to visit");
            System.out.println(example.visitVendors(example.searchTable(tableID, name)));
         }
         else
         {
            example.exitVendors();
         }
      }
   }
}