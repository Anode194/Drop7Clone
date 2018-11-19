package drop7Clone;

import java.awt.Color;
import java.util.*;
public class Compare
{
	private int columnNum;
	List balls = new ArrayList<String>();

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
				ballArray[0][0] = new BallClass();
				ballArray[0][1] = new BallClass();
			}
	}
	public Color getBallColor(int xPos, int yPos)
	{
		return null;
		
	}
	public void printme()
	{ 
			for(BallClass[] l : ballArray)
			{
				for(BallClass q : l)
					{
						System.out.println("");
					}
			}
	}
}