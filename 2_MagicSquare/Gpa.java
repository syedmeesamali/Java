/**
 * Author: Group 3  Kemo Sonko, Niloufar Kianfar, Shereena AlFaheem <br>
 * Date: February 4, 2019                                           <br>
 * Purpose: this program computes  the Grade Point Average (GPA)    <br> 
   on the grade and credits for each course.                        <br>
 * Caveats: Invalid values will result in an error.(i.e integers for
 * grade) 
 */
import java.util.*;

public class Gpa
{

   /** Defines two parameters
    * @param sumCredits The sum of all courses' credits
    * @param sumWeightedPoints The weighted average of the credits
    */
   public int sumCredits;
   public int sumWeightedPoints;

  //constructor to initialize GPA attributes

  public Gpa(){
   
      sumCredits = 0;
      sumWeightedPoints = 0;
   }
   
   /** Constructs the method calcPoint
    * @param choice which is a character input
    */
   public int calcPoint(char choice) {
      switch(choice)
      {
         //letter grade converted to points for GPA calculation
         case 'A':
         case 'a': return  4;
         
         case 'B':
         case 'b': return  3;
         
         case 'C':
         case 'c': return  2;
         
         case 'D':
         case 'd': return  1;
         
         case 'F':
         case 'f': return  0;
         
         //negative numbers considered invalid
         default : return -1;
         }
        }
     
     /** Defines the method addToTotals
      *@param _lettergrade is character input
      *@param credits Number of credits for each course of type Int
      *Add the credits to the sum of credits
      *Convert the letter grade to points
      *Add the product of the points and credits to the sum of 
      *weighted point
      */
     
     public void addToTotals( char _lettergrade, int credits){
      
         sumCredits += credits;
         int gradepoint = calcPoint(_lettergrade);
         sumWeightedPoints += (gradepoint * credits);
      }
      
      
   /** Defines the method calcGpa
    *@return GPA by dividing the sum of weighted points by the sum of credits
    *as type double
    */
      
      public double calcGpa(){
      
         return (sumWeightedPoints / sumCredits);
      }
   
    
        
}
  

  

         
        
  

  

  
               
  