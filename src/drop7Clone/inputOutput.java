package drop7Clone;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;

import javax.swing.JLabel;

public class inputOutput
	{
		private int score = 0;
		private String[] colorCodes = new String[16];
		private Color[] colors = new Color[16];
		private File colorFile;
		private File ScoreFile;
		public inputOutput() throws FileNotFoundException
		{
		colorFile = new File("/Users/davidmendez/code/Eclipse /workspace/Drop7Clone/src/drop7Clone/colors.txt");
		Scanner colorSc = new Scanner(colorFile);
		for(int x = 0; x<16; x++)
			{
				colorCodes[x] = colorSc.nextLine();
				colors[x] = Color.decode(colorCodes[x]);
			}
		}
		public inputOutput(File f) throws FileNotFoundException
		{
	
			
		
			colorFile = f;
			Scanner colorSc = new Scanner(colorFile);
			for(int x = 0; x<16; x++)
				{
					colorCodes[x] = colorSc.nextLine();
					colors[x] = Color.decode(colorCodes[x]);
				}
		}
		
		public Color getColor(int x)
		{
			return colors[x];
		}
		public String[] getColorCode()
		{
			return colorCodes;
		}
		public void setScore(int currentScore)
		{
			score += currentScore;
		}
		
	}
