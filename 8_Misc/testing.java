public class testing {
   public static void main(String[] args) 
   {
      count myCount = new count();
      int times = 0;
      for (int i=0; i<100; i++) 
         increment(myCount, times);
      System.out.println("Count is: " + myCount.count);
      System.out.println("times is: " + times);
   }

   public static void increment(count c, int times) {
      c.count++;
      times++;
   }
} //End of class
