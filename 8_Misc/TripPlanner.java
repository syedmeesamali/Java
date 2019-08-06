import java.util.Scanner;

public class TripPlanner {
   public static void main(String[] args) {      
      greetings();
      Scanner input = new Scanner(System.in);
      System.out.println("What is your name? ");
      String name = input.next();
      System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
      String city = input.next();
      System.out.print("Wow Awesome! " + city + " looks like a great Trip. Enjoy your Trip .... ");
      System.out.print("How many days are you going to travel? ");
      int days = input.nextInt();
      System.out.print("And how much money are you planning to spend? (USD) ");
      double money = input.nextDouble();
      System.out.println("Okay! So that will be around " + Math.round(money/days) + " USD per day. Good luck !");
      spacer();
      
  } //End of main
  
  public static void greetings()
  {
   System.out.println("Welcome to TRIP-PLANNER !");
   System.out.println("-------------------------");
  } //End of greetings
  
  public static void spacer()
  {
   System.out.println("**********************");
   System.out.println("----------------------");
   System.out.println("**********************");
  } //End of greetings
  
} //End of class