import java.util.Scanner;

//Code for testing in development
public class TestLoan {
   public static void main(String[] args) {      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter interest rate e.g. 8.5: ");
      double annualInterestRate = input.nextDouble();
      System.out.print("Enter number of years as an integer: ");
      int numberOfYears = input.nextInt();

      System.out.print("Enter loan amount e.g. 120000.80: ");
      double loanAmount = input.nextDouble();

      Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);
      System.out.printf("The loan was created on %s\n Monthly payment is: %.2f\n", loan.getLoanDate().toString(), 
         loan.getMonthlyPayment(), loan.getTotalPayment());
   } //End of main method
} //End of class