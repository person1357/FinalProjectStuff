public class Unit {
    private int id;
    private int health;
    private int damage;
    private int cost;
<<<<<<< HEAD
    private int myX;
    private int myY;
    private boolean move;
=======
    private int loc;
    boolean move;
>>>>>>> branch 'master' of https://github.com/person1357/FinalProjectStuff

<<<<<<< HEAD
    public Unit(int i,int h,int d,int c, int x, int y) {
        id = i;
        health = h;
        damage = d;
        cost = c;
        myX = x;
        myY = y;
=======
    public Unit(int i,int h,int d,int c, int location) {
        id = i;
        health = h;
        damage = d;
        cost = c;
        loc = location;
>>>>>>> branch 'master' of https://github.com/person1357/FinalProjectStuff
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
<<<<<<< HEAD
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
=======
    public void setLoc(int location)
    {
        loc = location;
    }
    public int getLoc()
    {
        return loc;
>>>>>>> branch 'master' of https://github.com/person1357/FinalProjectStuff
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


