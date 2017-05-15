public class Unit {
	private int id;
	private int health;
	private int damage;
	private int cost;
	private int loc;

	public Unit() {
		id = -1;
		health = 0;
		damage = 0;
		cost = 0;
	}

	public void setID(int n) {
		id = n;
	}

	public int getID() {
		return id;
	}
	public void setHealth(int nHealth) {
		health = nHealth;
	}

	public int getHealth() {
		return health;
	}
	public void setDamage(int dmg)
	{
		damage = dmg;
	}
	public int getDamage()
	{
		return damage;
	}
	public void setCost(int c)
	{
		cost = c;
	}
	public int getCost()
	{
		return cost;
	}
	public void setLoc(int location)
	{
		loc = location;
	}
	public int getLoc()
	{
		return loc;
	}
}
