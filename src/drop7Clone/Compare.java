package drop7Clone;

import java.awt.Color;
import java.util.*;
public class Compare
{
	private int columnNum;
	BallClass nextBall;
	//	List<List<BallClass>> ballArray = new ArrayList<List<BallClass>>(8); //2 dim arraylist of balls
	BallClass[][] ballArray = new BallClass[7][7];
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
				ballArray[x][6] = new BallClass();
				ballArray[x][5] = new BallClass();
			}
			nextBall = new BallClass();
	}
	public boolean isNull(int x, int y)
	{
		boolean  b = (ballArray[x][y] == null) ? true : false;
		return b;
	}
	
	public boolean gameLost()					//this determines if the game is still going.
	{
		if((ballArray[0][0] != null)||
				(ballArray[1][0] != null)||
				(ballArray[2][0]!=null)||
				(ballArray[3][0]!=null)||
				(ballArray[4][0]!= null)||
				(ballArray[5][0]!= null)||
				(ballArray[6][0] != null)) 
			{return true;} else 
				{
					return false;
				}
	}
	public void setNextBallPos(int x, int y) //this sets the next balls position on the stack
		{
			ballArray[y][x] = nextBall;
			nextBall = new BallClass();
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
		return null; //TODO implement colorSystem
	}
	public int getBallnum(int x , int y) //returns the number of the ball at the position
	{
		return ballArray[x][y].getBallNum();
	}
	public int getNextBallNum()
	{
		return nextBall.getBallNum();
	}

	public void CheckXCoord(int xColumn, int compareNum)
	{
		System.out.println(xColumn+" ");
		for(int x = 0; x < ballArray[xColumn].length;x++)
			{
				if(ballArray[xColumn][x].getBallNum() == compareNum)
					{
						ballArray[xColumn][x] = null;
					}
			}
	}
	public void CheckYCoord(int yColumn)
	{
		
	}
	public int gameTurnBegin(BallClass nextBall)
	{
		nextBall = new BallClass();
		return 0;
	}
	public Boolean checkBalls(int x, int y) //checks the ballArray so we can redraw the buttons.
	{
		if(ballArray[x][y] != null)
		return true;
		else return false;
	}
}
		