import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

class picpuzzle3 extends JFrame implements ActionListener
{

private final static int FIVE_SECONDS = 5000;
private final static int count = 0;
private javax.swing.Timer timer = null;
public JButton[] buttons = new JButton[9];
public String[] names = {"b1","b2","b3","b4","b5","b6","b7","b8","b9"};

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

picpuzzle3()
{

super("picture puzzle 3");

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

JLabel my_timer=new JLabel("Timer!");
my_timer.setBounds(100,50,70,20);

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
add(l1);add(l3);add(my_timer);

sample.addActionListener(this);
resetB.addActionListener(this);

setLayout(null);
setSize(600,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//Below is implementation of javax timer
timer = new javax.swing.Timer(FIVE_SECONDS, new ActionListener() 
{
   public void actionPerformed(ActionEvent evt) 
   {
         long startTime = System.currentTimeMillis();
         int counter = 0;
         counter++;
         if (counter > 100000)
         {
            timer.stop();
         }
         my_timer.setText(String.valueOf(counter));
   }
});
timer.start();
}

//BELOW METHOD IS FOR ALL THE BUTTON CLICKS AND ACTIONS PERFORMED EVENTS
public void actionPerformed(ActionEvent e)
{

for (int j=0; j<9; j++) //Main method to shuffle the puzzle
{
try {
if(e.getSource()==buttons[j])
{
    if (j == 8)
    {
    Icon s1=buttons[j].getIcon();  //Save the icon for last button
    Icon s2=buttons[0].getIcon(); //Save the icon for first button
    System.out.println(buttons[j].getText() + " pressed");
    buttons[0].setIcon(s1); //Shift the current icon to first
    buttons[j].setIcon(s2);   //Shift the icon of next button to current
    }
    
    Icon s1=buttons[j].getIcon();  //Save the icon for current button pressed
    Icon s2=buttons[j+1].getIcon(); //Save the icon for button next to current
    System.out.println(buttons[j].getText() + " pressed");
    buttons[j+1].setIcon(s1); //Shift the current icon to next button
    buttons[j].setIcon(s2);   //Shift the icon of first to last button

}//end of error
}

catch (Exception err) {} 
} // End of for loop

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
   System.out.println("reset pressed");
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
  new picpuzzle3();
}  //end of main

}//end of class