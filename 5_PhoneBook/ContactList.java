import java.util.*;
import java.io.*;

public class ContactList
{
  private String filename;
   public ContactList(String inFileName)
   {
      filename = inFileName;
   }
   
   public void new_record()
   {
      Scanner input = new Scanner(System.in);     
      
      System.out.println("Enter last name: ");      
      String lastName = input.nextLine();
      
       if( lastName != "" )
       {
         System.out.println("Enter first name: ");
         String firstName = input.nextLine();
         
         System.out.println("Enter phone number: ");
         String phone = input.nextLine();
         
          String details = firstName + " " + lastName + " :" + phone;
 
          File file = new File(filename);
          FileWriter out = null;
 
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
      
      BufferedReader br = null;
      String line = null;
      int counter2 = 0;
      String id = null;

      try
      {
        br = new BufferedReader(new FileReader(filename));
        line = br.readLine();
        id = LastName;
        while (line != null) //Check till end of file
        {
            //Make parts of each line as separate words
            String[] lineVar = line.toLowerCase().split(" ");
            for (String word: lineVar)
            {
               if(word.equals(id))
               {
                  counter2++;
                  System.out.println(line);
               }
            }
            
            line = br.readLine();
        } //End of while statement
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception opening the file");
      }
      
    }//end of search

}//end of class