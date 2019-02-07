/**
 * Author: Syed Meesam Ali                                          <br>
 * Date: February 6, 2019                                           <br>
 * Purpose: this program reads in the numbers from 1 to n2 from the <br>
   keyboard and tests whether they form a magic square.             <br>
 * Caveats: Non-numeric values will result in an invalid response. 
 */
 
import java.util.Scanner;
import java.util.*;

//public entry point
public class testSquare{
public static void main(String[] args){

//initialize ArrayList variable numbers
ArrayList<Integer> numbers = new ArrayList<>(3);
Scanner input = new Scanner(System.in);

///initialize the 2D array Square
int[][] square = new int[3][3];
Square test1 = new Square();

int a;
do { 
   //input loop for program until user presses 'x'
   System.out.println("Enter a number (x to exit): ");
   a = input.nextInt(); //get input as integer
   numbers.add(a); //append integer to ArrayList
   } while (!input.hasNext("x"));
   
        //check if ArrayList is Square
        if (test1.isSquare(numbers.size()) == true) {
             System.out.println("Step 1. Numbers make a square ***");
             
             //check if ArrayList is Unique
             if (test1.isUnique(numbers)) {
                  System.out.println("Step 2. Numbers are unique ***");
                  int size = (int) Math.sqrt(numbers.size());
                  for (int i=0; i< numbers.size(); i++) {
                        square[i / size ][i % size] = numbers.get(i);
                  }
                  
                  //check if array square is Magic Square 
                  if (test1.isMagic(square) == true) { 
                     System.out.println("Step 3. It is MAGIC SQUARE ***");
                  } else {
                     System.out.println("Step 3. But it is NOT magic square.");
                     }
              
              //Else when numbers are not unique
              } else {
                  System.out.println("Step 2. Numbers are not unique. Program stopped..");
                  System.exit(0);
                  }

         //Main else (numbers are not square)
         } else {
             System.out.println("Step 1. Numbers donot make square! Program stopped..");
             System.exit(0);
         }
      
  }
}