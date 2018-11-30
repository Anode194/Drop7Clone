package drop7Clone;

import java.awt.Color;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Compare
{
	BallClass[][] ballArray;
	BallClass nextBall;
	private int ballsLeft;
	private int level;
	private int score;

	// List<List<BallClass>> ballArray = new ArrayList<List<BallClass>>(8); //2 dim
	// arraylist of balls
	public Compare()
	{
		ballArray = new BallClass[7][7];
		for (BallClass[] b : ballArray)
		{
			for (BallClass bc : b)
			{
				bc = null;
			}
		}
		for (int y = 0; y < 7; y++)
		{
			ballArray[6][y] = new BallClass();
			ballArray[5][y] = new BallClass();
			
			
		}
		popBalls(6,0);
		popBalls(5,6);
		nextBall = new BallClass();
		ballsLeft = 14;
		level =1;
	}

	public boolean isNull(int x, int y)
	{
		boolean b = (ballArray[x][y] == null) ? true : false;
		return b;
	}

	public boolean gameLost() // this determines if the game is still going.
	{
		if ((ballArray[0][0] != null) || (ballArray[1][0] != null) || (ballArray[2][0] != null)
				|| (ballArray[3][0] != null) || (ballArray[4][0] != null) || (ballArray[5][0] != null)
				|| (ballArray[6][0] != null))
		{
			return true;
		} else
		{
			return false;
		}
	}

	public void setNextBallPos(int x, int y) // this sets the next balls position on the stack
	{
		ballArray[x][y] = nextBall;
		nextBall = new BallClass();
		if(ballsLeft > 1)
		{
		ballsLeft--;
		} else
		{
			ballsLeft = 14;
			level++;
		}
	}

	public int setNewBall(BallClass ball, int x, int y)
	{
		ballArray[x][y] = ball;
		return ballArray[x][y].getBallNum();
	}

	public Color getBallColor(int xPos, int yPos)
	{
		return ballArray[xPos][yPos].getColor();
	}

	public int getBallnum(int x, int y) // returns the number of the ball at the position
	{
		return ballArray[x][y].getBallNum();
	}

	public int getNextBallNum()
	{
		return nextBall.getBallNum(); // for showing the next ball num on the gui
	}
	public Color getNextBallCol()
	{
		return nextBall.getColor();
	}

	private void shiftBalls() //shifts all the balls down after they have been popped.
	{
		for(int r =0; r<50; r++)
		{
		for (int y = 1; y < 7; y++)
		{
			for (int x = 0; x < 7; x++)
			{
				if(ballArray[y][x] == null && ballArray[y-1][x]!=null)
				{
					ballArray[y][x] = ballArray[y-1][x];
					ballArray[y-1][x] = null;
					System.out.println(y+" "+x);
					popBalls(y,x);
					if(x ==0)break;
				}
			}
		}
		}
	}

	public void popBalls(int xColumn, int yRow)
	{
		int notNullCounterX = 0;
		int notNullCounterY = 0;

		int compare = ballArray[xColumn][yRow].getBallNum();

		for (int q = 0; q < ballArray[xColumn].length; q++)
		{
			if (ballArray[q][yRow] != null) notNullCounterX++;
		}
		for (int z = 0; z < 7; z++)
		{
			if (ballArray[z][yRow] != null)
			{
				if (ballArray[z][yRow].getBallNum() == notNullCounterX) 
					{
						setScore(ballArray[z][yRow].getPointValue());
						ballArray[z][yRow] = null;
					}
			}
		}
		notNullCounterY = 0;
		int checkRight = yRow;
		int checkLeft = yRow;
		while (ballArray[xColumn][checkRight] != null)
		{
			notNullCounterY++;
			if (checkRight == 6) break;
			checkRight++;
		}
		while (ballArray[xColumn][checkLeft] != null)
		{
			notNullCounterY++;
			if (checkLeft == 0) break;
			checkLeft--;
		}
		if (notNullCounterY != 1 || notNullCounterY != 7 || notNullCounterY != 0)
		{
			notNullCounterY -= 1;
		}
		//System.out.println(notNullCounterY);
		for (int z = 0; z < 7; z++)
		{
			if (ballArray[xColumn][z] != null)
			{
				if (ballArray[xColumn][z].getBallNum() == notNullCounterY) 
				{
					setScore(ballArray[xColumn][z].getPointValue());
					ballArray[xColumn][z] = null;
				}
			}
		}
		shiftBalls();
	}

	public Boolean checkBalls(int x, int y) // checks the ballArray so we can redraw the buttons.
	{
		if (ballArray[x][y] != null)
			return true;
		else return false;
	}
	public int getBallsLeft()
	{
		return ballsLeft;
	}
	public int getLevel()
	{
		return level;
	}
	public void debug() //delete before turning in
	{
		for (int x = 0; x < 7; x++)
		{
			for (int y = 0; y < 7; y++)
			{
				if (ballArray[x][y] == null)
				{
					System.out.print("00");
					// System.out.print(" "+x + " "+ y);
				} else
				{
					// System.out.print("1 ");
					System.out.print("" + x + "" + y);
					// System.out.print(ballArray[x][y].getBallNum()+" ");
				}

			}
			System.out.println(" ");
		}
		for (int x = 0; x < 7; x++)
		{
			for (int y = 0; y < 7; y++)
			{
				if (ballArray[x][y] == null)
				{
					System.out.print("0 ");
				} else
				{
					System.out.print(ballArray[x][y].getBallNum() + " ");
				}

			}
			System.out.println(" ");
		}
	}
	private void setScore(int points)
	{
		score+=points;
	}
	public int getScore()
	{
		return score;
	}
}
