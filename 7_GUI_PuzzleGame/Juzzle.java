/*
 *@authors: Niloufar Kianfar, Shereena Al Faheem, Yusra Zvavi
 *@version: 2.1
 *purpose: Juzzle is a game in which a user rearrange the buttons according to the sample image i 

*/
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.text.*;
import java.awt.Font;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.*;

class Juzzle extends JFrame implements ActionListener
{

public static int countPress = 0; // variable that counts the times a button has been pressed
public JButton[] buttons = new JButton[9];//declaring 
public String[] names = {"b1","b2","b3","b4","b5","b6","b7","b8","b9"}; //declaring the names of buttons in a list 
public JLabel my_timer; // declaring Jlabel for the time 
      JLabel Score;
   JLabel scoreArea;
JButton sample,GIF,resetB; // declaring variables for buttons

Icon sampleImage1=new ImageIcon("juzzle/main.jpg");//get the first sampleImage
Icon sampleImage2=new ImageIcon("juzzle/main2.jpg");//get the second sampleImage
Icon sampleImage3=new ImageIcon("juzzle/main3.jpg");//get the third sampleImage
Icon gif =new ImageIcon("juzzle/gif.gif");

//getting the pieces of the first image
ImageIcon[] ic1 = {new ImageIcon("juzzle/1.jpg"), new ImageIcon("juzzle/2.jpg"),
                   new ImageIcon("juzzle/3.jpg"), new ImageIcon("juzzle/4.jpg"),
                   new ImageIcon("juzzle/5.jpg"),new ImageIcon("juzzle/6.jpg"), 
                   new ImageIcon("juzzle/7.jpg"), new ImageIcon("juzzle/8.jpg"),
                   new ImageIcon("juzzle/9.jpg")};
                   
//getting the pieces of the second image
ImageIcon[] ic2 = {new ImageIcon("juzzle/11.jpg"), new ImageIcon("juzzle/12.jpg"), 
                   new ImageIcon("juzzle/13.jpg"), new ImageIcon("juzzle/14.jpg"), 
                   new ImageIcon("juzzle/15.jpg"), new ImageIcon("juzzle/16.jpg"), 
                   new ImageIcon("juzzle/17.jpg"), new ImageIcon("juzzle/18.jpg"), 
                   new ImageIcon("juzzle/19.jpg")};
                   
//getting the pieces of the third image
ImageIcon[] ic3 = {new ImageIcon("juzzle/21.jpg"), new ImageIcon("juzzle/22.jpg"), 
                   new ImageIcon("juzzle/23.jpg"), new ImageIcon("juzzle/24.jpg"),
                   new ImageIcon("juzzle/25.jpg"), new ImageIcon("juzzle/26.jpg"), 
                   new ImageIcon("juzzle/27.jpg"), new ImageIcon("juzzle/28.jpg"), 
                   new ImageIcon("juzzle/29.jpg")};

Juzzle() //constructor 
{
   super("juzzle"); 
   try { //to implement background music
      URL url = this.getClass().getClassLoader().getResource("music.wav");
      AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
      Clip clip = AudioSystem.getClip();
      clip.open(audioIn);
      clip.loop(Clip.LOOP_CONTINUOUSLY);
      clip.start();
      } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         } catch (LineUnavailableException e) {
            e.printStackTrace();
         }
      
   Score=new JLabel("Score: ");
   Score.setBounds(380,410,100,20);
   Font f0 = new Font("Comic sans ms",Font.BOLD,14);//creating font 1
   Score.setFont(f0);//implementing
   
   scoreArea=new JLabel("0");
   scoreArea.setBounds(430,410,100,20);
   scoreArea.setVisible(true);
   add(scoreArea);
   
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
      buttons[i].setText(" ");
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
   
   sample=new JButton(sampleImage1); //Big button showing the completed juzzle
   sample.setBounds(380,100,200,200);
   
   my_timer=new JLabel("Press any button to begin countdown!"); //New timer label for the timing
   my_timer.setBounds(30,400,250,20); // setting the x,y,width,length of the timer
   Font f1 = new Font("Comic sans ms",Font.BOLD,14);//creating font 1
   my_timer.setFont(f1);//implementing font 1 for sample
   add(my_timer); //Add the timer to scene
   
   JLabel S =new JLabel("Sample"); //creating a sample JLabel S
   S.setBounds(450,60,70,50);// setting the x,y,width,length of the sample 
   Font f2 = new Font("Comic sans ms",Font.BOLD,20);// creating font 2
   S.setFont(f2);//implementing font 2 for sample
   S.setForeground(Color.black);//definig the color of sample
   JLabel C =new JLabel("Click on pic for next juzzle");//creating a sample JLabel C
   C.setBounds(380,320,200,20);//setting the x,y,width,length of click on juzzle 
   C.setForeground(Color.black);//definig the color of click on juzzle
   Font f3 = new Font("Comic sans ms",Font.PLAIN,15);// creating font 3
   C.setFont(f3);//implementing font 3 for Click on juzzle
   
   GIF= new JButton(gif); // getting the GIF (pic with animation)
   GIF.setBounds(200,5,200,70);//settng the  x,y,width,length for GIF
      
   sample=new JButton(sampleImage1); //Big button showing the completed juzzle
   sample.setBounds(380,100,200,200); //setting the x,y,width,length for sampleImage1
   
   resetB=new JButton("Reset"); //Button to reset juzzle
   resetB.setBounds(450,350,100,50);
   
   add(sample);add(resetB);add(GIF);
   add(S);add(C);add(my_timer);add(Score);
   
   sample.addActionListener(this);
   resetB.addActionListener(this);
   
   setLayout(null); // set the layout
   setSize(600,500); //set the size of the juzzle
   setVisible(true); //set the juzzle to visible 
   getContentPane().setBackground(Color.pink);//sets the background color
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//closes the operation  
}

//BELOW METHOD IS FOR ALL THE BUTTON CLICKS AND ACTIONS PERFORMED EVENTS
public void actionPerformed(ActionEvent e)
{
    countPress++;
    System.out.println("Any button pressed: " + String.valueOf(countPress) + " times");
    //public boolean timerstate;
    int seconds = 25;  // supply timer duration in seconds
    final long duration = seconds * 1000;   // calculate to milliseconds
    final javax.swing.Timer timer = new javax.swing.Timer(10, new ActionListener() //Initialize timer for 10 seconds
    {    
        long startTime = -1; //This will make sure start time is always current as it will never be less than 0
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
                my_timer.setText("Time Is UP"); 
                return;
             }
               SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");
               my_timer.setText(df.format(duration - clockTime));
          } //END OF block
        } //Timer related actionPerformed block
   });
   timer.setInitialDelay(0);
   timer.start();
   
   for (int j=0; j<9; j++) //Main method to shuffle the juzzle
   {
   String text = my_timer.getText(); //Check what my_timer text says
   if (text == "Time Is UP")
   {
      buttons[j].setEnabled(false); //To disable the puzzle buttons
      resetB.setEnabled(true);
      sample.setEnabled(true);
      scoreArea.setText("LOST");
   } else if (text != "Time Is UP")  //While the counter is running make other buttons disabled
   {
      resetB.setEnabled(false);
      sample.setEnabled(false);
   }
   
   try {
   //when puzzle is in correct place, user wins
   if(e.getSource()==buttons[j])
   {
       
       if(buttons[0].getIcon() == ic2[8] && buttons[1].getIcon() == ic2[7] && buttons[2].getIcon() == ic2[6] && buttons[3].getIcon() == ic2[5] && 
          buttons[4].getIcon() == ic2[4] && buttons[5].getIcon() == ic2[3] && buttons[6].getIcon() == ic2[2] && buttons[7].getIcon() == ic2[1] &&
          buttons[8].getIcon() == ic2[0])
          {
            for (int x=0; x<9; x++)
            {
               buttons[x].setEnabled(false);
            }
            int finalCount = countPress;
            int finalScore = (25 / finalCount)*1000;
            scoreArea.setText(String.valueOf(finalScore));
            System.out.println("You won the puzzle");
          }
          
       if (j == 8) //Our array boundary is 0 - 8
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
      
      }//end of error
   }
   catch (Exception err) {} 
   } // End of for loop
   
//METHOD TO MOVE TO NEXT PUZZLE
   if(e.getSource()==sample)
   {
      resetB.doClick();
      if (sample.getIcon() == sampleImage1)
      {
         sample.setIcon(sampleImage2); //Show next juzzle icon
         for (int i=0; i<9; i++)
         {
         buttons[i].setIcon(ic2[i]); //Shift the button icons to new juzzle icons
         }  
      } else if (sample.getIcon() == sampleImage2)
      {
         sample.setIcon(sampleImage3); //Show next juzzle icon
         for (int i=0; i<9; i++)
         {
         buttons[i].setIcon(ic3[i]); //Shift the button icons to new juzzle icons
         }  
      } else //end of second if
      {
         sample.setIcon(sampleImage1); //Show next juzzle icon
         for (int i=0; i<9; i++)
         {
         buttons[i].setIcon(ic1[i]); //Shift the button icons to new juzzle icons
         }  
         
      } 
  }
   //METHOD TO RESET ICONS
   if(e.getSource()==resetB) 
   {
      countPress = 0;      //Reset the press button counter to zero
      scoreArea.setText("0");
      System.out.println("reset pressed");
      if (sample.getIcon() == sampleImage2)
      {
         for (int i=0; i<9; i++)
         {
          buttons[i].setEnabled(true);
          buttons[i].setIcon(ic2[i]); //Shift the button icons to new juzzle icons
         }  
      }
      else if (sample.getIcon() == sampleImage3)
      {
         for (int i=0; i<9; i++)
         {
          buttons[i].setEnabled(true);
          buttons[i].setIcon(ic3[i]); //Shift the button icons to new juzzle icons
         }  
      
      } else 
      {
         for (int i=0; i<9; i++)
         {
          buttons[i].setEnabled(true);
          buttons[i].setIcon(ic1[i]); //Shift the button icons to new juzzle icons
         }  
      }
   } //End of reset actionListener
}//end of actionPerformed
   
//Main entry point statements
public static void main(String args[])
{ 
  new Juzzle();
}//End of main entry point method

}//end of class