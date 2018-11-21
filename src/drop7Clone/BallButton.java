package drop7Clone;

import javax.swing.JButton;

public class BallButton extends JButton
{
 @Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + xCoord;
		result = prime * result + yCoord;
		return result;
	}
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BallButton other = (BallButton) obj;
		if (xCoord != other.xCoord)
			return false;
		if (yCoord != other.yCoord)
			return false;
		return true;
	}
private int xCoord;
 private int yCoord;
 private boolean HasNumber = false;
 public BallButton(int x, int y)
 {
	 xCoord = x;
	 yCoord = y;
 }
public int getyCoord()
{
	return yCoord;
}
public int getxCoord()
{
	return xCoord;
}
public Boolean getHasNumber()
{
	return HasNumber;
}
public void setHasNumber(Boolean b)
{
	HasNumber = b;
}
}
