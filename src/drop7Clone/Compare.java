package drop7Clone;

import java.awt.Color;
import java.util.*;
public class Compare
{
	private int columnNum;
	List<List<BallClass>> ballArray = new ArrayList<List<BallClass>>(8); //2 dim arraylist of balls
	public Compare()
	{
		for(int x = 0; x < ballArray.size(); x++)
			{
				ballArray.add(new ArrayList<BallClass>(7));
				ballArray.get(7).add(new BallClass());
			}
	}
	public Color getBallColor(int xPos, int yPos)
	{
		return null;
		
	}
}