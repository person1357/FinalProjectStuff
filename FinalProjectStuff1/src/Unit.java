public class Unit 
{
	private String name;
	private Boolean collision;
	private Boolean canAttack;
	private Boolean alive;
	private int health;
	private int damage;
	private int speed;
	private int cost;
	private int attackDistance;
	private String weaponType;

	// String weaponType;

	public Unit(String n, int aDistance, int c, int d, int s) {
		name = n;
		collision = false;
		alive = true;
		canAttack = true;
		health = 100;
		damage = d;
		speed = s;
		cost = c;
		attackDistance = aDistance;
		
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
}
