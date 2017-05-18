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
	//need this method to let GUI display health value in textArea
	public String toString()
	{
		return Integer.toString(health);
	}
	
}
