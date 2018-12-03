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
			ballArray[4][y] = new BallClass();

		}
		popBalls();
		nextBall = new BallClass();
		ballsLeft = 14;
		level = 1;
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
		shiftBalls();
		if (ballsLeft > 1)
		{
			ballsLeft--;
		} else
		{
			ballsLeft = 14;
			level++;
			for (int q = 1; q < 7; q++)
			{
				for (int r = 1; r < 7; r++)
				{
					ballArray[r - 1][q] = ballArray[r][q];
				}
			}
			for (int z = 0; z < 7; z++)
				ballArray[6][y] = new BallClass(true);
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
		if (ballArray[x][y].getWhiteStatus() == false && ballArray[x][y].getCrackedStatus() == false)
		{
			return ballArray[x][y].getBallNum();
		} else return 9898;
	}

	public int getNextBallNum()
	{
		if (nextBall.getWhiteStatus() == false)
		{
			return nextBall.getBallNum(); // for showing the next ball num on the gui

		} else
		{
			return 9999;
		}

	}
	public boolean getCrackedStatus(int x, int y)
	{
		 return ballArray[x][y].getCrackedStatus();
	}

	public Color getNextBallCol()
	{
		return nextBall.getColor();
	}

	private void shiftBalls() // shifts all the balls down after they have been popped.
	{
		for (int r = 0; r < 50; r++)
		{
			for (int y = 1; y < 7; y++)
			{
				for (int x = 0; x < 7; x++)
				{
					if (ballArray[y][x] == null && ballArray[y - 1][x] != null)
					{
						ballArray[y][x] = ballArray[y - 1][x];
						ballArray[y - 1][x] = null;
					}
				}
			}
		}
	}

	public void popBalls()
	{
		for (int x = 0; x < 7; x++)
		{
			for (int y = 0; y < 7; y++)
			{
				if (ballArray[x][y] != null)
				{
					int notNullCounterX = 0;
					int notNullCounterY = 0;

					int compare = ballArray[x][y].getBallNum();

					for (int q = 0; q < ballArray[x].length; q++)
					{
						if (ballArray[q][y] != null) notNullCounterX++;
					}
					for (int z = 0; z < 7; z++)
					{
						if (ballArray[z][y] != null)
						{
							if (ballArray[z][y].getBallNum() == notNullCounterX)
							{
								if (y != 6 )
								{
									 if(ballArray[z][y + 1] != null)
									 {
								
									if (ballArray[z][y + 1].getWhiteStatus())
									{
										ballArray[z][y].setWhiteStatus();
									} else if (ballArray[z][y + 1].getCrackedStatus())
									{
										ballArray[z][y].setCrackedStatus();
									}
									 }
								}
									if (y != 0) { 
										if(ballArray[z][y - 1] != null) {
									
										if (ballArray[z][y - 1].getWhiteStatus())
										{
											ballArray[z][y - 1].setWhiteStatus();
										} else if (ballArray[z][y - 1].getCrackedStatus())
										{
											ballArray[z][y - 1].setCrackedStatus();
										}
									}}
									
								
								
									if(ballArray[z][y].getWhiteStatus() == false && ballArray[z][y].getCrackedStatus() == false)
									{
								setScore(ballArray[z][y].getPointValue());
								ballArray[z][y] = null;
									}
							}
						}
					}
					notNullCounterY = 0;
					int checkRight = y;
					int checkLeft = y;
					while (ballArray[x][checkRight] != null)
					{
						notNullCounterY++;
						if (checkRight == 6) break;
						checkRight++;
					}
					while (ballArray[x][checkLeft] != null)
					{
						notNullCounterY++;
						if (checkLeft == 0) break;
						checkLeft--;
					}
					if (notNullCounterY != 1 || notNullCounterY != 7 || notNullCounterY != 0)
					{
						notNullCounterY -= 1;
					}
					// System.out.println(notNullCounterY);
					for (int z = 0; z < 7; z++)
					{

							if (ballArray[x][z] != null)
							{
								if (ballArray[x][z].getBallNum() == notNullCounterY)
								{
									if(x!=0 && ballArray[x - 1][z] != null)
									{
									if (ballArray[x - 1][z].getWhiteStatus())
									{
										ballArray[x - 1][z].setWhiteStatus();
									} else if (ballArray[x - 1][z].getCrackedStatus())
									{
										ballArray[x - 1][z].setCrackedStatus();
									}
									}
									if(x!=6 && ballArray[x - 1][z] != null)
									{
										if (ballArray[x+1][z].getWhiteStatus())
										{
											ballArray[x+1][z].setWhiteStatus();
										} else if(ballArray[x+1][z].getCrackedStatus())
										{
											ballArray[x+1][z].setCrackedStatus();
										}
									}
									if(ballArray[x][z].getWhiteStatus() == false && ballArray[x][z].getCrackedStatus() == false)
									{
									setScore(ballArray[x][z].getPointValue());
									ballArray[x][z] = null;
									}
								}
							}
					}
					shiftBalls();
				}
			}
		}
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

	public void debug() // delete before turning in
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
		score += points;
	}

	public int getScore()
	{
		return score;
	}
}
