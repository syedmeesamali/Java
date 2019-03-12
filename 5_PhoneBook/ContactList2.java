/**
*/

import java.util.*;
import java.io.*;

public class ContactList2
{
   /**
   Contact list file name 
   */
   private String filename;
   
   /**
   ContactList constructor accepts a String parameter
   */
   public ContactList2(String inFileName)
   {
      filename = inFileName;
   }
   
   /**
      3) add a new record to the file. Open the file for writing in append mode(there is a FileWriter constructor with the appropriate parameters).
         a) prompt the user to enter data for each field in the record. Each field is a String.
            The last name is required. If the last name is the empty string(""), return to the menu.
         b) when the user has completed entering data(i.e., all the fields have been prompted), re-display the user choices
         c) do not overwrite existing data
   */
   public void new_record()
   {
    /*
      Prompt for data:
         Last name
         First name
         Phone

    */
      //Craete a scanner object
      Scanner input = new Scanner(System.in);     
      
      //prompt for the last name
      System.out.println("Enter last name: ");
      
      //input the last name
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
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception opening the file for writing");
          }
          //try to wrtie the data
          try
          {
            out.write("\n");
            out.write(details);
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception writing to the file");
          }
          //try to close the file
          try
          {
             out.close();         
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception closing the file");
          }
          
       }//end of test of Last_name
    
    }//end of new_record
    
    /**
    2) display all last names and first names in the file. 
    Open the file for reading, read each record and 
    display the field values.
      a) display all the lastName, firstName paired fields in the file; 
      display with the format lastName, firstName
      b) when all records have been displayed, display the record count  - the record count is the number of records read and should equal the number of records in the file
      c) after all the records and the count have been displayed, display the user choices
      
    */
    public void display_names()
    {
      //try to open the file for reading
      BufferedReader br = null;
      try
      {
         //delare variables to hold file types
         br = new BufferedReader(new FileReader(filename));
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception opening the file");
      }
      /*
      try to read each record and display the field values.
      a) display all the lastName, firstName paired fields in the file; 
      display with the format lastName, firstName
      count each record that is read 
      */
      int counter = 0; //record counter
      String line = null;
      try
      {
         //read the first record
         line = br.readLine();         //while the record is not null, display the record, count the record
         while (line != null)
         {
            counter++;
            System.out.println("Record # " + counter + " is: " + line);
            line = br.readLine();
         }
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception reading the file");
      }
      
      //try to close the file
      try
      {
         br.close();
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception closing the file");
      }
      //dislay a count of the records read
      
    }//end of display_names
    
        /**
          1) search an address file for a particular last name 
          and then display the Last name, the first name, and 
          the phone for each match
          2) display the count of records which match the last name
   
       */
    public void search(String LastName)
    {
      //delare variables to hold file types
      
      FileReader br = null;
      //try to open the file for reading
      try
      {
        br = new FileReader(filename);
        int d;
        d = br.read();   
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception opening the file");
      }
      
      //try to read each record
      //if the value of the Last_name field equals the value
      /*
        create a counter to count the number of
        matching records
      */
      int counter = 0;
      
      try
      {
         //read the first record
         int line2;
         line2 = br.read();
         
         //while the record is not null
            //split the record into fields
            //test if the field equals the LastName parameter
               //display the record and increment the counter
            //read the next record
         
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception reading the file");
      }

      // try to close the file
      try
      {
        br.close();
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception closing the file");
      }
      
      //dislay a count of the records found
      
      
    }//end of search

}//end of class