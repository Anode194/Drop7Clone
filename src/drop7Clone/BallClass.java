package drop7Clone;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;

public class BallClass {
	private int pointValue;
	private int ballNum;
	private Color color;
	private boolean isWhite;
	private boolean isCracked;
	private inputOutput io;
	{

		try {
			io = new inputOutput();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		Random r = new Random();
		int randWhiteBallNum = r.nextInt(30);
		ballNum = (r.nextInt(7) + 1);

		switch (ballNum) {
		case 1:
			pointValue = 49;
			color = io.getColor(0);
			isWhite = (randWhiteBallNum < 15) ? false : true;

		case 2:
			pointValue = 42;
			color = io.getColor(1);
			isWhite = (randWhiteBallNum < 15) ? false : true;

		case 3:
			pointValue = 35;
			color = io.getColor(2);
			isWhite = (randWhiteBallNum < 15) ? false : true;

		case 4:
			pointValue = 28;
			color = io.getColor(3);
			isWhite = (randWhiteBallNum < 15) ? false : true;

		case 5:
			pointValue = 35;
			color = io.getColor(4);
			isWhite = (randWhiteBallNum < 15) ? false : true;

		case 6:
			pointValue = 42;
			color = io.getColor(5);
			isWhite = (randWhiteBallNum < 15) ? false : true;

		case 7:
			pointValue = 49;
			color = io.getColor(6);
			isWhite = (randWhiteBallNum < 15) ? false : true;
		}
	}

	public int getPointValue() {
		return pointValue;
	}

	public void setPointValue(int pointValue) {
		this.pointValue = pointValue;
	}

	public int getBallNum() {
		return ballNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ballNum;
		result = prime * result + (isCracked ? 1231 : 1237);
		result = prime * result + (isWhite ? 1231 : 1237);
		return result;
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
		if (isCracked != other.isCracked)
			return false;
		if (isWhite != other.isWhite)
			return false;
		return true;
	}

	public Color getColor() {
		return color;
	}

	public void setBallNum(int ballNum2) {
		ballNum = ballNum2;
	}
}
