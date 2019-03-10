//This java file will be used to test and work on misc codes from edx course
public class TVtest
{
   public static void main(String[] args)
   {
      TV tv1 = new TV();
      tv1.turnON();
      tv1.setChannel(30);
      tv1.setVolume(10);
      System.out.println("Tv's channel is: " + tv1.channel + " and volume is: " + tv1.vol);
              
   }  //End of main    
  
} //End of class