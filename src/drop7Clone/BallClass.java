package drop7Clone;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class BallClass {
	private int pointValue;
	private int ballNum;
	private Color color;
	// because we are changing the value of color we have to have a color set for
	// all of them
	private boolean isWhite;
	private inputOutput io;

	public BallClass() {

		try {
			io = new inputOutput(null);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Random r = new Random();
		int ballWhiteNum = r.nextInt(50);
		if (ballWhiteNum > 42) {
			isWhite = true;
		}
		int randWhiteBallNum = r.nextInt(30);
		ballNum = (r.nextInt(7) + 1);

		switch (ballNum) {
		case 1:
			pointValue = 49;
			color = io.getColor(0);
			isWhite = (randWhiteBallNum != 15) ? false : true;
			break;

		case 2:
			pointValue = 42;
			color = io.getColor(1);
			isWhite = (randWhiteBallNum != 15) ? false : true;
			break;

		case 3:
			pointValue = 35;
			color = io.getColor(2);
			isWhite = (randWhiteBallNum != 15) ? false : true;
			break;

		case 4:
			pointValue = 28;
			color = io.getColor(3);
			isWhite = (randWhiteBallNum != 15) ? false : true;
			break;

		case 5:
			pointValue = 35;
			color = io.getColor(4);
			isWhite = (randWhiteBallNum != 15) ? false : true;
			break;

		case 6:
			pointValue = 42;
			color = io.getColor(5);
			isWhite = (randWhiteBallNum != 15) ? false : true;
			break;

		case 7:
			pointValue = 49;
			color = io.getColor(6);
			isWhite = (randWhiteBallNum != 15) ? false : true;
			break;
		}
	}

	public BallClass(boolean b) {
		if (b == true) {
			isWhite = true;
		}

		try {
			io = new inputOutput(null);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Random r = new Random();
		ballNum = (r.nextInt(7) + 1);

		switch (ballNum) {
		case 1:
			pointValue = 49;
			color = io.getColor(0);
			break;

		case 2:
			pointValue = 42;
			color = io.getColor(1);
			break;

		case 3:
			pointValue = 35;
			color = io.getColor(2);
			break;

		case 4:
			pointValue = 28;
			color = io.getColor(3);
			break;

		case 5:
			pointValue = 35;
			color = io.getColor(4);
			break;

		case 6:
			pointValue = 42;
			color = io.getColor(5);
			break;

		case 7:
			pointValue = 49;
			color = io.getColor(6);
			break;
		}
	}

	public int getPointValue() {
		return pointValue;
	}

	public int getBallNum() {
		return ballNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BallClass other = (BallClass) obj;
		if (ballNum != other.ballNum)
			return false;
		if (isWhite != other.isWhite)
			return false;
		return true;
	}

	public Color getColor() {
		if (isWhite) {
			return Color.WHITE;
		} else {
			return color;
		}
	}

	public boolean getWhiteStatus() {
		return isWhite;

	}

	public void setWhiteStatus() {
		isWhite = false;
	}

}
