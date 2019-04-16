import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

class picpuzzle3 extends JFrame implements ActionListener{

public JButton[] buttons = new JButton[9];
public String[] names = {"b1","b2","b3","b4","b5","b6","b7","b8","b9"};

JButton sample,starB;
Icon star;
Icon samicon1=new ImageIcon("pic/main.jpg");

ImageIcon[] ic = {new ImageIcon("pic/1.jpg"), new ImageIcon("pic/5.jpg"), new ImageIcon("pic/2.jpg"), new ImageIcon("pic/7.jpg"),
new ImageIcon("pic/4.jpg"), new ImageIcon("pic/6.jpg"), new ImageIcon("pic/3.jpg"), new ImageIcon("pic/8.jpg"), new ImageIcon("pic/9.jpg")};

picpuzzle3(){

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
   buttons[i].setIcon(ic[i]);
   System.out.println("Button name: " + buttons[i].getText());
   System.out.println("Button icon: " + buttons[i].getIcon());
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

//Button to display the full picture
sample=new JButton(samicon1);
sample.setBounds(390,100,200,200);

JLabel l1=new JLabel("Full puzzle");
l1.setBounds(330,180,150,20);

//Make second button in array as star button
star=buttons[1].getIcon();

add(sample);add(l1);
sample.addActionListener(this);
setLayout(null);
setSize(650,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

//Below method takes care of the button press event
public void actionPerformed(ActionEvent e)
{

   for (int j=0; j<9; j++)
   {

      if(e.getSource()==buttons[j])
      {
         Icon s1=buttons[j].getIcon();    //Save state of current button pressed
            if(buttons[j+1].getIcon()==star) //If the next button to current is a STAR
            {
            buttons[j+1].setIcon(s1);  //Shuffle the current to next one
            buttons[j].setIcon(star);  //Move the star to the button pressed
            star = buttons[j+1].getIcon();   //Star will be the button next to the one pressed
            } 
      }//end of if

   }//End of for loop


}//end of actionPerformed

//Main entry point statements
public static void main(String args[])
   {
      new picpuzzle3();
   }  //end of main

}//end of class