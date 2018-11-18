package drop7Clone;
import java.awt.Color;
import java.io.*;
import java.util.Scanner;

public class inputOutput
	{
		private String[] colorCodes = new String[16];
		private Color[] colors = new Color[16];
		private File colorFile;
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
		
		public Color[] getColorArray()
		{
			return colors;
		}
		public String[] getColorCode()
		{
			return colorCodes;
		}
		
	}
