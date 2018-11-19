package drop7Clone;

import java.awt.Color;
import java.util.*;
public class Compare
{
	private int columnNum;

	//	List<List<BallClass>> ballArray = new ArrayList<List<BallClass>>(8); //2 dim arraylist of balls
	BallClass[][] ballArray = new BallClass[7][8];
	public Compare()
	{
			for(BallClass[] b : ballArray)
			{
				for(BallClass bc : b)
					{
						b = null;
					}
			}
			for(int x = 0; x < 7; x++)
			{
				ballArray[0][x] = new BallClass();
				ballArray[1][x] = new BallClass();
			}
	}
	public boolean isNull(int x, int y)
	{
		boolean  b = (ballArray[x][y] == null) ? true : false;
		return b;
	}
	
	public boolean gameLost()					//this determines if the game is still going.
	{
		if((ballArray[7][0] != null)||
				(ballArray[7][1] != null)||
				(ballArray[7][2]!=null)||
				(ballArray[7][3]!=null)||
				(ballArray[7][4]!= null)||
				(ballArray[7][5]!= null)||
				(ballArray[7][6] != null)) 
			{return false;} else 
				{
					return true;
				}
	}
	public void setNextBallPos(BallClass b, int x, int y) //this sets the next balls position on the stack
		{
			ballArray[x][y] = b;
		}
	public BallClass getNextBall()
	{
		return new BallClass(); //for displaying what the next ball number is going to be.
	}
	public int setNewBall(BallClass ball,int x , int y) 
	{
		ballArray[x][y] = ball;
		return ballArray[x][y].getBallNum();
	}
	public Color getBallColor(int xPos, int yPos)
	{
		return null;
	}
	public int getBallPos(int x , int y) //returns the number of the ball at the position
	{
		return ballArray[x][y].getBallNum();
	}
}