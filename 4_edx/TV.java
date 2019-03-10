//This java file will be used to test and work on misc codes from edx course
public class TV
{
   int channel = 1;
   int vol = 1;
   boolean on = false;
   
   public TV  //Constructor
   {
   }
   
   public void turnON() //Turn TV on
   {
      on = true;
   }

   public void turnOFF() //Turn TV off
   {
      on = false;
   }

   public void setChannel(int newChannel) //Change channel
   {
      if (on && newChannel >= 1 && newChannel <= 120)
         channel = newChannel;
   }

   public void channelUp(int newChannel) //Turn up the channel
   {
      if (on && newChannel < 120)
         channel++;
   }


} //End of class