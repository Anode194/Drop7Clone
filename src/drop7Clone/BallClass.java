package drop7Clone;

import java.awt.Color;
import java.util.Random;

public class BallClass
{
private int pointValue;
private	int ballNum;
private Color color;	
private boolean isWhite;
private boolean isCracked;
public BallClass()
{
	Random r = new Random();
	int randWhiteBallNum = r.nextInt(30);
	ballNum = (r.nextInt(7)+1);
	switch(ballNum)
		{
		case 1:
			pointValue = 49;
			color = Color.red;
			isWhite = (randWhiteBallNum < 15) ? false : true;
		case 2:
			pointValue = 42;
			color = Color.green;
			isWhite = (randWhiteBallNum < 15) ? false : true;
		case 3:
			pointValue = 35;
			color = Color.CYAN;
			isWhite = (randWhiteBallNum < 15) ? false : true;
		case 4:
			pointValue = 28;
			color = Color.MAGENTA;
			isWhite = (randWhiteBallNum < 15) ? false : true;
		case 5:
			pointValue = 35;
			color = Color.ORANGE;
			isWhite = (randWhiteBallNum < 15) ? false : true;
		case 6:
			pointValue = 42;
			color = Color.PINK;
			isWhite = (randWhiteBallNum < 15) ? false : true;
		case 7:
			pointValue = 49;
			color = Color.YELLOW;
			isWhite = (randWhiteBallNum < 15) ? false : true;
			
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
