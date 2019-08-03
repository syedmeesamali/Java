import java.util.Date;

public class Loan {
   private double loanInterestRate;
   private int numberOfYears;
   private double loanAmount;
   private java.util.Date loanDate;

   //Constructor
   public Loan() 
   {
      this(2.5, 1, 1000); //Put some default values
   }

   public Loan(double loanInterestRate, int numberOfYears, double loanAmount) 
   {
      this.loanInterestRate = loanInterestRate;
      this.numberOfYears = numberOfYears;
      this.loanAmount = loanAmount;
      loanDate = java.util.Date();
   }

   public double getAnnualInterestRate() 
   {
      return annualInterestRate;
   }

   

}