public class Unit {
    private int id;
    private int health;
    private int damage;
    private int cost;
    private int myX;
    private int myY;
    private boolean move;

    public Unit(int i,int h,int d,int c, int x, int y) {
        id = i;
        health = h;
        damage = d;
        cost = c;
        myX = x;
        myY = y;
        move = true;
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
    public int getX()
    {
        return myX;
    }
    public int getY()
    {
        return myY;
    }
    public void setY(int y)
    {
    	myY = y;
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
