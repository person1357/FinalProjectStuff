public class Base 
{
	private int health;
	public Base()
	{
		health = 100;
	}
	public void setHealth(int value)
	{
		health = value;
	}
	public void reduceHealth(int val)
	{
		health = health - val;
	}
	
}
