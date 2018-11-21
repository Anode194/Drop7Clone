package drop7Clone;

import javax.swing.JButton;

public class BallButton extends JButton
{
 private int xCoord;
 private int yCoord;
 public BallButton(int x, int y)
 {
	 xCoord = x;
	 yCoord = y;
 }
public int getyCoord()
{
	return yCoord;
}
public int getxCoord()
{
	return xCoord;
}
}
