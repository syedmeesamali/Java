import java.util.Scanner;

public class MainCode {
   public static void main(String[] args) {      
      Scanner input = new Scanner(System.in);
      System.out.println("How much money do you have? ");
      double money = input.nextDouble();
      System.out.print("I have: " + money + " Dollars");
  } 
}