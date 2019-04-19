import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import java.text.*;
import java.util.*;

public class CountdownTimer extends JLabel implements ActionListener{

    private static final long serialVersionUID = 1L;
    private long count;
    private long timerStart;
    private DateFormat dateFormat;

    javax.swing.Timer timer = new javax.swing.Timer(8000, this);
public CountdownTimer(int minutes, int seconds) 
{
        // suppose to show as in 30 MIN 30 SEC.
        super(" ", JLabel.CENTER);
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MINUTE, minutes);
        cal.set(Calendar.SECOND, seconds);
        count = cal.getTime().getTime();

        dateFormat = new SimpleDateFormat("mm:ss");
        timer.start();
        timerStart = System.currentTimeMillis();
        long elapsedTime = System.currentTimeMillis()-timerStart;
        System.out.println(System.currentTimeMillis());

    }

   public void actionPerformed(ActionEvent e) {
        // suppose to countdown till 00 MIN 00 SEC
        setText(dateFormat.format(count));
        count -= 1000;

        if (dateFormat.format(count).equalsIgnoreCase("00:00")) {
            closeWindow();

        }
    }

    public void closeWindow() 
    {
        System.exit(1);
    }

}
