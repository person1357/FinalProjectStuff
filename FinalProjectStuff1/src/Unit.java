public class Unit {
    private int id;
    private int health;
    private int damage;
    private int cost;
    private int loc;
    boolean canMove;

    public Unit(int i,int h,int d,int c, int location) {
        id = i;
        health = h;
        damage = d;
        cost = c;
        loc = location;
        canMove = true;
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
        public boolean canMove()
    {
    	return move;
    }
    public void setMove(boolean m)
    {
    	move = m;
    }
}


