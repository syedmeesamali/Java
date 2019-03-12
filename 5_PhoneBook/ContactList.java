import java.util.*;
import java.io.*;

public class ContactList
{
   /**
   Contact list file name 
   */
   private String filename;
   
   /**
   ContactList constructor accepts a String parameter
   */
   public ContactList(String inFileName)
   {
      filename = inFileName;
   }
   
   public void new_record()
   {
      Scanner input = new Scanner(System.in);     
      
      System.out.println("Enter last name: ");      
      String lastName = input.nextLine();
      
      //the Last_name must not be empty
       if( lastName != "" )
       {
         //get the first name and the phone
         System.out.println("Enter first name: ");
         String firstName = input.nextLine();
         
         System.out.println("Enter phone number: ");
         String phone = input.nextLine();
         
          //create the output string
          String details = firstName + " " + lastName + " :" + phone;
 
          //delare variables to hold file types
          File file = new File(filename);
          FileWriter out = null;
          //try to open the file for writing - append the data
          try
          {
            out = new FileWriter(filename, true);
            out.write("\n");
            out.write(details);
            out.close();
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception opening the file for writing");
          }
          
       }//end of test of Last_name
    
    }//end of new_record
    
    public void display_names()
    {
      //try to open the file for reading
      BufferedReader br = null;
      int counter = 0; //record counter
      String line = null;
      try
      {
         br = new BufferedReader(new FileReader(filename));
         //read the first record
         line = br.readLine();         //while the record is not null, display the record, count the record
         while (line != null)
         {
            counter++;
            System.out.println("Record # " + counter + " is: " + line);
            line = br.readLine();
         }
         
         br.close(); //Close the file after all records have been read.
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception reading the file");
      }
      
      
    }//end of display_names
    
    public void search(String LastName)
    {
      
      FileReader br = null;
      try
      {
        br = new FileReader(filename);
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception opening the file");
      }
      
    }//end of search

}//end of class