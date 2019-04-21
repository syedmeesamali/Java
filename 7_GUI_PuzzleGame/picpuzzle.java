import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.text.*;

class picpuzzle extends JFrame implements ActionListener
{
public static int countPress = 0;
public JButton[] buttons = new JButton[9];
public String[] names = {"b1","b2","b3","b4","b5","b6","b7","b8","b9"};
public JLabel my_timer;
JButton sample, starB, resetB;

Icon ic0=new ImageIcon("pic/starB0.jpg");
Icon ic10=new ImageIcon("pic/starB10.jpg");
Icon ic20=new ImageIcon("pic/starB20.jpg");
Icon samicon1=new ImageIcon("pic/main.jpg");
Icon samicon2=new ImageIcon("pic/main2.jpg");
Icon samicon3=new ImageIcon("pic/main3.jpg");

ImageIcon[] ic1 = {new ImageIcon("pic/1.jpg"), new ImageIcon("pic/5.jpg"), new ImageIcon("pic/2.jpg"), 
new ImageIcon("pic/7.jpg"), new ImageIcon("pic/4.jpg"), new ImageIcon("pic/6.jpg"), 
new ImageIcon("pic/3.jpg"), new ImageIcon("pic/8.jpg"), new ImageIcon("pic/9.jpg")};

ImageIcon[] ic2 = {new ImageIcon("pic/12.jpg"), new ImageIcon("pic/14.jpg"), new ImageIcon("pic/15.jpg"), 
new ImageIcon("pic/18.jpg"), new ImageIcon("pic/11.jpg"), new ImageIcon("pic/13.jpg"), 
new ImageIcon("pic/17.jpg"), new ImageIcon("pic/16.jpg"), new ImageIcon("pic/19.jpg")};

ImageIcon[] ic3 = {new ImageIcon("pic/22.jpg"), new ImageIcon("pic/24.jpg"), new ImageIcon("pic/25.jpg"), 
new ImageIcon("pic/28.jpg"), new ImageIcon("pic/21.jpg"), new ImageIcon("pic/23.jpg"), 
new ImageIcon("pic/27.jpg"), new ImageIcon("pic/26.jpg"), new ImageIcon("pic/29.jpg")};

picpuzzle()
{
super("Picture Puzzle");

//Add buttons with names from string array
for (int n=0; n<9; n++)
{
   buttons[n] = new JButton(names[n]);
   add(buttons[n]);
   buttons[n].addActionListener(this);
}

//Set icons and bounds of buttons
for (int i=0; i<9; i++)
{
   buttons[i].setIcon(ic1[i]);
}

//Below is definition for setting boundaries of the buttons
buttons[0].setBounds(10,80,100,100);
buttons[1].setBounds(110,80,100,100);
buttons[2].setBounds(210,80,100,100);
buttons[3].setBounds(10,180,100,100);
buttons[4].setBounds(110,180,100,100);
buttons[5].setBounds(210,180,100,100);
buttons[6].setBounds(10,280,100,100);
buttons[7].setBounds(110,280,100,100);
buttons[8].setBounds(210,280,100,100);

sample=new JButton(samicon1); //Big button showing the completed puzzle
sample.setBounds(380,100,200,200);

my_timer=new JLabel("Press any button to begin countdown!"); //New timer label for the timing
my_timer.setBounds(100,50,250,20);
add(my_timer); //Add the timer to scene
Font font1 = new Font("SansSerif", Font.BOLD, 20);
my_timer.setFont(font1);
JLabel l1=new JLabel("Sample:");
l1.setBounds(330,200,70,20);
JLabel l3=new JLabel("Click sample picture for next puzzle");
l3.setBounds(380,320,250,20);
l3.setForeground(Color.red);

sample=new JButton(samicon1); //Big button showing the completed puzzle
sample.setBounds(380,100,200,200);

resetB=new JButton("Reset"); //Button to reset puzzle
resetB.setBounds(450,350,100,50);

add(sample);add(resetB);
add(l1);add(l3);

sample.addActionListener(this);
resetB.addActionListener(this);

setLayout(null);
setSize(600,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

//BELOW METHOD IS FOR ALL THE BUTTON CLICKS AND ACTIONS PERFORMED EVENTS

public void actionPerformed(ActionEvent e)
{
    countPress++;
    System.out.println("Any button pressed: " + String.valueOf(countPress) + " times");
    //public boolean timerstate;
    int seconds = 5;  // supply timer duration in seconds
    final long duration = seconds * 1000;   // calculate to milliseconds
    final javax.swing.Timer timer = new javax.swing.Timer(10, new ActionListener() //Initialize timer for 10 seconds
    {    
        long startTime = -1; 
        public void actionPerformed(ActionEvent event) 
        {
         {  //Start of BLOCK for timer to work
            if (startTime < 0 && countPress < 2) 
            {
                startTime = System.currentTimeMillis();
            }
            long now = System.currentTimeMillis();
            long clockTime = now - startTime;
            if (countPress < 2 && clockTime < duration)
            {
               SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");
               my_timer.setText(df.format(duration - clockTime));
            } else if (clockTime >= duration) //Once clocktime reaches duration seconds 
            {
                clockTime = duration;
                ((javax.swing.Timer)event.getSource()).stop(); // stop the Timer
                my_timer.setText("Time Is UP"); // remove if you want or maybe just ""
                return;
            }
               SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");
               my_timer.setText(df.format(duration - clockTime));
             
          } //END OF block

        } //Timer related actionPerformed block
    });
    timer.setInitialDelay(0);
    timer.start();

for (int j=0; j<9; j++) //Main method to shuffle the puzzle
{
String text = my_timer.getText();
if (text == "Time Is UP")
{
   buttons[j].setEnabled(false);
} else
{
try {
if(e.getSource()==buttons[j])
{
    if (j == 8)
    {
    Icon s1=buttons[j].getIcon();  //Save the icon for last button
    Icon s2=buttons[0].getIcon(); //Save the icon for first button
    buttons[0].setIcon(s1); //Shift the current icon to first
    buttons[j].setIcon(s2);   //Shift the icon of next button to current
    }
    
    Icon s1=buttons[j].getIcon();  //Save the icon for current button pressed
    Icon s2=buttons[j+1].getIcon(); //Save the icon for button next to current
    buttons[j+1].setIcon(s1); //Shift the current icon to next button
    buttons[j].setIcon(s2);   //Shift the icon of first to last button

}//end of main if
}

catch (Exception err) {} 
} // End of for loop
}
//METHOD TO MOVE TO NEXT PUZZLE
if(e.getSource()==sample)
{
   if (sample.getIcon() == samicon1)
   {
      sample.setIcon(samicon2); //Show next puzzle icon
      for (int i=0; i<9; i++)
      {
      buttons[i].setIcon(ic2[i]); //Shift the button icons to new puzzle icons
      }  
   } else if (sample.getIcon() == samicon2)
   {
      sample.setIcon(samicon3); //Show next puzzle icon
      for (int i=0; i<9; i++)
      {
      buttons[i].setIcon(ic3[i]); //Shift the button icons to new puzzle icons
      }  
   } else //end of second if
   {
      sample.setIcon(samicon1); //Show next puzzle icon
      for (int i=0; i<9; i++)
      {
      buttons[i].setIcon(ic1[i]); //Shift the button icons to new puzzle icons
      }  
      
   } 
}

//METHOD TO RESET ICONS
if(e.getSource()==resetB) 
{
   if (sample.getIcon() == samicon2)
   {
      for (int i=0; i<9; i++)
      {
       buttons[i].setIcon(ic2[i]); //Shift the button icons to new puzzle icons
      }  
   }
   else if (sample.getIcon() == samicon3)
   {
      for (int i=0; i<9; i++)
      {
       buttons[i].setIcon(ic3[i]); //Shift the button icons to new puzzle icons
      }  
   
   } else 
   {
      for (int i=0; i<9; i++)
      {
       buttons[i].setIcon(ic1[i]); //Shift the button icons to new puzzle icons
      }  
   
   }
}

}//end of actionPerformed

//Main entry point statements
public static void main(String args[])
{
  SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new picpuzzle();
            }
  
 // new picpuzzle3());
});  //end of main
}
}//end of class