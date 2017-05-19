public class Base 
{
	private int health;
	private int location;
	public Base(int loc)
	{
		health = 100;
		location = loc;
	}
	public void setHealth(int value)
	{
		health = value;
	}
	public void reduceHealth(int val)
	{
		health = health - val;
	}
	public int getLocation() {
		return location;
	}
	//need this method to let GUI display health value in textArea
	public String toString()
	{
		return Integer.toString(health);
	}
	
}
