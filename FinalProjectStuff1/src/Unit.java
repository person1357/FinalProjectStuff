public class Unit 
{
	private String name;
	private Boolean isEnemy;
	private Boolean canAttack;
	private Boolean alive;
	private int health;
	private int damage;
	private int speed;
	private int cost;
	private int attackDistance;
	private String weaponType;

	private int loc;

	// String weaponType;

	public Unit()
	{
		name = "";
		isEnemy = false;
		alive =  true;
		canAttack = true;
		health = 0;
		damage = 0;
		speed = 0;
		cost = 0;
		attackDistance = 0;	
		danger = false;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getName() {
		return name;
	}

	public void setSpeed(int nSpeed) {
		speed = nSpeed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setHealth(int nHealth) {
		health = nHealth;
	}

	public int getHealth() {
		return health;
	}
/*	public void setDanger(boolean dLevel)
	{
		danger = dLevel;
	}
	public boolean getDanger()
	{
		return danger;
	}
	public int updateLoc()
	{*/
		

}
