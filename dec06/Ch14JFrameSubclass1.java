import javax.swing.*;
import java.awt.*;
/**
 * Write a description of class Ch14JFrameSubclass1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ch14JFrameSubclass1 extends JFrame
{
private static final int FRAME_WIDTH = 400;
private static final int FRAME_HEIGHT = 200;
private static final int FRAME_X_ORIGIN = 150;
private static final int FRAME_Y_ORIGIN = 250;
public Ch14JFrameSubclass1 ( ) {
//set the frame default properties
setTitle ("My First Subclass");

setSize (FRAME_WIDTH, FRAME_HEIGHT);
setLocation (FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
//register 'Exit upon closing' as a default close operation
setDefaultCloseOperation( EXIT_ON_CLOSE );
changeBkColor();
     
}

private void changeBkColor() {
Container contentPane = getContentPane();
contentPane.setBackground(Color.RED);
}
}
