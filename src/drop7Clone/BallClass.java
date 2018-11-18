package drop7Clone;

import java.awt.Color;
import java.util.Random;

public class BallClass
{
private int pointValue;
private	int ballNum;
private Color color;	
public BallClass()
{
	Random r = new Random();
	ballNum = (r.nextInt(7)+1);
	switch(ballNum)
		{
		case 1:
			pointValue = 49;
			color = Color.red;
		case 2:
			pointValue = 42;
			color = Color.green;
		case 3:
			pointValue = 35;
			color = Color.CYAN;
		case 4:
			pointValue = 28;
			color = Color.MAGENTA;
		case 5:
			pointValue = 35;
			color = Color.ORANGE;
		case 6:
			pointValue = 42;
			color = Color.PINK;
		case 7:
			pointValue = 49;
			color = Color.YELLOW;
		}
	}
	public int getPointValue()
	{
		return pointValue;
	}
	public void setPointValue(int pointValue)
	{
		this.pointValue = pointValue;
	}
	public int getBallNum()
	{
		return ballNum;
	}
	public Color getColor()
	{
		return color;
	}
	public void setBallNum(int ballNum2)
	{
		ballNum = ballNum2;
	}
}
