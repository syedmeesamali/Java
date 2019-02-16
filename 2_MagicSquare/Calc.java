import java.lang.*;
import java.util.Scanner;
import java.util.Random;

public class Calc{
   public static void main(String args[]) {
   Random rand = new Random();
   int freq[] = new int[7];
     for (int roll=1; roll<1000; roll++) {
        ++freq[1+rand.nextInt(6)];
      } //End of for loop
 
   System.out.println("Face \n Frequency");
   for (int face=0; face<freq.length; face++) {
      System.out.println(face + "\n" + freq[face]);
      change(freq);
      System.out.println("New Value is: " + freq[face]);
    } // End of for to print freq
   }// End of main method

   public static void change(int x[]) {
      for (int counter=0; counter<x.length; counter++) {
         x[counter] += 5; //Increment elements by 5
      }
   
   }//End of New method called change

}