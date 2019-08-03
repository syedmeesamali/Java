import java.util.Date;

public class Loan {
   private double annualInterestRate;
   private int numberOfYears;
   private double loanAmount;
   private java.util.Date loanDate;

   //Constructor
   public Loan() 
   {
      this(2.5, 1, 1000); //Put some default values
   }

   public Loan(double annualInterestRate, int numberOfYears, double loanAmount) 
   {
      this.annualInterestRate = annualInterestRate;
      this.numberOfYears = numberOfYears;
      this.loanAmount = loanAmount;
      loanDate = new java.util.Date();
   }

   public double getAnnualInterestRate() 
   {
      return annualInterestRate;
   }

   public void settleAnnualInterestRate(double annualInterestRate)
   {
      this.annualInterestRate = annualInterestRate;
   }

   public int getNumberOfYears() 
   {
      return numberOfYears;
   }
   
   public void setNumberOfYears(int numberOfYears) 
   {
      this.numberOfYears = numberOfYears;
   }

   public void setLoanAmount(double loanAmount) //Set total loan amount
   {
      this.loanAmount = loanAmount;
   }

   public double getMonthlyPayment()  //Monthly payment amount
   {
      double monthlyInterestRate = annualInterestRate / 1200;
      double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
      return monthlyPayment;
   }
   
   public double getTotalPayment()  //Total payment amount
   {
      double totalPayment = getMonthlyPayment() * numberOfYears * 12;
      return totalPayment;
   }

   public java.util.Date getLoanDate() 
   {
      return loanDate;
   }
   

}