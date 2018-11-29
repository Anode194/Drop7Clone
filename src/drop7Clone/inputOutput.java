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
		private String name;
		
		public inputOutput(String name_1) throws FileNotFoundException
		{
		Scanner colorSc = new Scanner(inputOutput.class.getResourceAsStream("colors.txt"));
		for(int x = 0; x<16; x++)
			{
				colorCodes[x] = colorSc.nextLine();
				colors[x] = Color.decode(colorCodes[x]);
			}
		name = name_1;
		}
		public inputOutput(File f,String name_1) throws FileNotFoundException
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
