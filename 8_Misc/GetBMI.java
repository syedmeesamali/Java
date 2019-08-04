import java.util.Scanner;

//Main code for BMI calculation
public class GetBMI {
   public static void main(String[] args) {      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter Height: ");
      double height = input.nextDouble();
      System.out.print("Enter Weight: ");
      double weight = input.nextDouble();

      BMI myBMI = new BMI("SYED", 30, height, weight);
      System.out.printf("The BMI for " + myBMI.getName() + " is: " + myBMI.getBMI());
      System.out.println("Status is: " + myBMI.getStatus());
   } //End of main method
} //End of class