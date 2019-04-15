import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

class picpuzzle3 extends JFrame implements ActionListener{

public JButton[] buttons = new JButton[9];
public String[] names = {"b1","b2","b3","b4","b5","b6","b7","b8","b9"};

JButton sample,starB;
Icon star;

Icon ic0=new ImageIcon("pic/starB0.jpg");
Icon ic10=new ImageIcon("pic/starB10.jpg");
Icon ic20=new ImageIcon("pic/starB20.jpg");
Icon samicon1=new ImageIcon("pic/main.jpg");
Icon samicon2=new ImageIcon("pic/main2.jpg");
Icon samicon3=new ImageIcon("pic/main3.jpg");

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

sample=new JButton(samicon1);
sample.setBounds(380,100,200,200);

JLabel l1=new JLabel("Sample:");
l1.setBounds(330,200,70,20);
JLabel l2=new JLabel("NOTE:: icon has power to swap with neighbour icon=>");
l2.setBounds(5,15,500,20);
JLabel l3=new JLabel("click sample picture to next puzzle");
l3.setBounds(380,320,200,20);
l3.setForeground(Color.red);

starB=new JButton(ic0);
starB.setBounds(330,5,50,50);
star=buttons[1].getIcon();

add(sample);add(l1);add(l2);add(starB);add(l3);


sample.addActionListener(this);
setLayout(null);
setSize(600,500);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e){

for (int j=0; j<9; j++)
{

if(e.getSource()==buttons[j])
{
    Icon s1=buttons[j].getIcon();
      if(buttons[j+1].getIcon()==star)
      {
        buttons[j+1].setIcon(s1);
        buttons[j].setIcon(star);
        star = buttons[j+1].getIcon();
      } 
}//end of if
}
   if(e.getSource()==sample)
   {
      Icon s1=sample.getIcon();
      if(s1==samicon3)
      {
      sample.setIcon(samicon1);
      //Set icons and bounds of buttons
      for (int i=0; i<9; i++)
      {
         buttons[i].setIcon(ic[i]);
      }

      star=buttons[8].getIcon();
      starB.setIcon(ic0);
      }//eof if

   }

}//end of actionPerformed

   //Main entry point statements
   public static void main(String args[])
   {
      new picpuzzle3();
   }  //end of main

}//end of class