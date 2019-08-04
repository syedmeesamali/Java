public class BMI {
   private String name;
   private int age;
   private double weight;
   private double height;
   public static final double KG_PER_Pound = 0.4535;
   public static final double meter_per_inch = 0.0254;

   public BMI(String name, int age, double weight, double height)
   {
      this.name = name;
      this.age = age;
      this.weight = weight;
      this.height = height;
   }
   
   public BMI(String name, double weight, double height) // Main constructor
   {
      this(name, 30, weight, height);
   }

   public double getBMI() 
   {
      double bmi = weight * KG_PER_Pound / ((height * meter_per_inch) * (height * meter_per_inch));
      return Math.round(bmi * 100) / 100.00;
   }

   public String getStatus() // Get BMI status
   {
      double bmi = getBMI();
      if (bmi < 18.5) {
         return "Underweight";
      } else if (bmi < 25) {
         return "Normal";
      } else if (bmi < 30) {
         return "Overweight";
      } else 
         return "OBESE !";
   }

}