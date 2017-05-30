<<<<<<< HEAD
public class Base 
{
	private int health;
	private int location;
	public Base(int loc)
	{
		health = 400;
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
	public int getHealth()
	{
		return health;
	}
	public void setLocatin(int l)
	{
		location = l;
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
=======
public class Base 
{
	private int health;
	private int location;
	public Base(int loc)
	{
		health = 400;
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
	public int getHealth()
	{
		return health;
	}
	public void setLocatin(int l)
	{
		location = l;
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
>>>>>>> branch 'master' of https://github.com/person1357/FinalProjectStuff
