public class covert {
   private boolean x;
   
   public static void main(String[] args) 
   {
      covert c = new covert();
      System.out.println(c.x);
      System.out.println(c.convert());
   }

   private int convert() {
      return x ? 1 : -1;
   }
} //End of class