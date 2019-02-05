/**
 * Author: Group 3  Kemo Sonko, Niloufar Kianfar, Shereena AlFaheem <br>
 * Date: February 4, 2019                                           <br>
 * Purpose: this is a tester class that prompts for the students    <br>
 * grade and credits for each course.                               <br>
 * Caveats: Invalid values will result in an error.( i.e integers for
 * grade) 
 */
import java.util.*;

public class ComputeGpa{

   //main entry point for program
   public static void main (String[] args){ 
   
      //define Gpa as a new object
      Gpa obj = new Gpa();
      Scanner scan = new Scanner(System.in);
      int numbc;
      int points;
      String lettergrade;
      char _lettergrade;
      int creditscourse;
      
      /**
       * Ask user to input one or more number of courses
       * Input saved as Integer numbc
       */    
      do{
         System.out.println("Please enter a number of courses: ");
         numbc = scan.nextInt();
         
         if( numbc < 0 ){
            System.out.println("Please enter a number of courses greater than 0");
           }
         
         }while (numbc <= 0);
      
      /**
       * Input grades as characters
       * @return error if input is invalid
       */  
      for(int i = 0; i < numbc; i++){
   
         do{
            System.out.println("Please enter a grade: ");
            lettergrade = scan.next();
            _lettergrade = lettergrade.charAt(0);
            points = obj.calcPoint(_lettergrade); //convert grades to points
            if (points == -1){
               System.out.println("You have entered an invalid grade");
            }
         }while(points == -1);
         
        /**
         * Input credits score as Integer which should be between 0 and 9
         * @return error if input is not in range
         */
         do{
         
            System.out.println("Please enter the credits: ");
            creditscourse = scan.nextInt();
            
            if( creditscourse < 0 || creditscourse > 9){
               System.out.println("Please enter credits between 0 and 9");
            }
           }while (creditscourse < 0 || creditscourse > 9);
      
         System.out.println("\n"); //add new line to accept input
         
         //add inputs to _lettergrade and creditscourse
         obj.addToTotals(_lettergrade, creditscourse);
      
      }
      //calculate and display total GPA as type double
      System.out.printf("The total GPA is : %.2f",obj.calcGpa());
   }
}