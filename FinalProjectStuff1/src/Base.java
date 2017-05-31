
public class Base 
{
	private int health;
	private int myX;
	public Base(int x)
	{
		health = 400;
		myX = x;
	}
	public void setHealth(int value)
	{
		health = value;
	}
	public void reduceHealth(int val)
	{
		health = health - val;
	}
	public int getHealth()
	{
		return health;
	}
	public void setX(int l)
	{
		myX = l;
	}
	public int getX() {
		return myX;
	}
	//need this method to let GUI display health value in textArea
	public String toString()
	{
		return Integer.toString(health);
	}
	
}

