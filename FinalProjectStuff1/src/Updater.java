import java.util.ArrayList;



public class Updater {
	private ArrayList<Unit> unitPlayer;
	private ArrayList<Unit> unitEnemy;
	private Base playerBase;
	private Base enemyBase;
	private int count;
	private int resource;
	public Updater()
	{
		count = 0;
	    //initialize array for player and enemy units
	    unitPlayer = new ArrayList<Unit>();
	    unitEnemy = new ArrayList<Unit>();
	    //initialize bases
	    playerBase = new Base(0);
	    enemyBase = new Base(8);
	    //initialize int resource
	    resource = 400;
	}
	public void update() {
		removeUnit();
		checkAttackPlayerBase();
		checkAttackEnemyBase();
		checkUnit();
		move();
		resource += 10;
		count++;
	} 
	public void createUnit(int a) {
		if (a==1 && resource >= 100)
		{
			makePlayerUnit(1);
			resource = resource - 100;
		}
		else if (a==2 && resource >= 130)
		{
			makePlayerUnit(2);
			resource = resource - 130;
		}
		else if (a==3 && resource >= 170)
		{
			makePlayerUnit(3);
			resource = resource - 170;
		}
		else if (a==4 && resource >= 250)
		{
			makePlayerUnit(4);
			resource = resource - 250;
		}
		else if (a==5 && resource >= 270)
		{
			makePlayerUnit(5);
			resource = resource - 270;
		}
		else if (a==6 && resource >= 300)
		{
			makePlayerUnit(6);
			resource = resource - 300;
		}
		else if (a==7 && resource >= 450)
		{
			makePlayerUnit(7);
			resource = resource - 450;
		}
	}
	public void makeEnemy()
	{
		if(count%180 == 0)
		{
			makeEnemyUnit(7);
		}
		else if(count%150 == 0)
		{
			makeEnemyUnit(6);
		}
		else if(count%120 == 0)
		{
			makeEnemyUnit(5);
		}
		else if(count%90 == 0)
		{
			makeEnemyUnit(4);
		}
		else if(count%60 == 0)
		{
			makeEnemyUnit(3);
		}
		else if(count%20 == 0)
		{
			makeEnemyUnit(2);
		}
		else if(count%10 == 0)
		{
			makeEnemyUnit(1);
		}
	}
	public void makePlayerUnit(int unitID)
		{
	       if(unitID == 1)
	       {
	          Unit u1 = new Unit(1, 50, 10, 100, 100,100);
	          unitPlayer.add(u1);
	       }
	       else if(unitID == 2)
	       {
	          Unit u2 = new Unit(2, 70, 20, 130, 100, 100);
	          unitPlayer.add(u2);
	       }
	       else if(unitID == 3)
	       {
	          Unit u3 = new Unit(3, 90, 30, 170, 100, 100);
	          unitPlayer.add(u3);
	       }
	       else  if(unitID == 4)
	       {
	          Unit u4 = new Unit(4, 110, 50, 250, 100, 100);
	          unitPlayer.add(u4);
	       }
	       else if(unitID == 5)
	       {
	          Unit u5 = new Unit(5, 130, 60, 270, 100, 100);
	          unitPlayer.add(u5);
	       }
	       else if(unitID == 6)
	       {
	           Unit u6 = new Unit(6, 150, 80, 300, 100, 100);
	           unitPlayer.add(u6);
	       }
	       else if(unitID == 7)
	       {
	           Unit u7 = new Unit(7, 250, 110, 450, 100, 100);
	           unitPlayer.add(u7);
	       }
	    }
	public void makeEnemyUnit(int unitID)
	{
       if(unitID == 1)
       {
           Unit u1 = new Unit(1, 50, 10, 100, 100, 800);
           unitEnemy.add(u1);
       }
       if(unitID == 2)
       {
           Unit u2 = new Unit(2, 70, 20, 130, 100, 800);
           unitEnemy.add(u2);
       }
       if(unitID == 3)
       {
           Unit u3 = new Unit(3, 90, 30, 170, 100, 800);
           unitEnemy.add(u3);
       }
       if(unitID == 4)
       {
           Unit u4 = new Unit(4, 110, 50, 250, 100, 800);
           unitEnemy.add(u4);
       }
       if(unitID == 5)
       {
           Unit u5 = new Unit(5, 130, 60, 270, 100, 800);
           unitEnemy.add(u5);
       }
       if(unitID == 6)
       {
           Unit u6 = new Unit(6, 150, 80, 300, 100, 800);
           unitEnemy.add(u6);
       }
       if(unitID == 7)
       {
           Unit u7 = new Unit(7, 250, 110, 450, 100, 800);
           unitEnemy.add(u7);
       }
    }
	public ArrayList<Integer> getPlayerUnitArray() {
		ArrayList <Integer> a = new ArrayList<Integer>();
		for (Unit p : unitPlayer)
		{
			a.add(p.getID());
		}
		return a;
	}
	public ArrayList<Integer> getEnemyUnitArray() {
		ArrayList <Integer> a = new ArrayList<Integer>();
		for (Unit p : unitEnemy)
		{
			a.add(p.getID());
		}
		return a;
	}
	
	public int checkWin()
	{
		if(enemyBase.getHealth() <= 0)
		{
			return 2;
			//need to set up a textfield in GUI that displays this message
		}
		else if (playerBase.getHealth() <= 0)
		{
			return 1;
		}
		return -1;//this is not very necessary can be an empty string

	}

	public void removeUnit()
	{
		for(Unit p :unitPlayer)
		{
			if(p.getHealth() == 0)
			{
				unitPlayer.remove(p);
			}
		}
		for (Unit e: unitEnemy)
		{
			if (e.getHealth() == 0)
			{
				unitEnemy.remove(e);
			}
		}
	}
	
	public void checkUnit()
	{
		for (Unit p : unitPlayer)
		{	
				for (Unit e: unitEnemy)
				{
					if(p.getY() + 1 == e.getY())
					{
						p.setHealth(p.getHealth() - e.getDamage());
						e.setHealth(e.getHealth() - p.getDamage());
						p.setMove(false);
						e.setMove(false);
					}
					else if(p.getY() + 2 == e.getY())
					{
						e.setMove(false);
					}
				}
		}
		
	}
	public void checkAttackPlayerBase()
	{
		if(playerBase.getHealth() <= 0)
		{
			checkWin();
		}
		else 
		{
			for (Unit e: unitEnemy)
			{
				if(e.getY() - 1 == playerBase.getLocation())//location of enemy base
				{
					playerBase.setHealth(playerBase.getHealth() - e.getDamage());
					e.setMove(false);
				}
				else
				{
					e.setMove(true);
				}
			}
		}
	}
	
	public void checkAttackEnemyBase()
	{
		if(enemyBase.getHealth() <= 0)
		{
			checkWin();
		}
		else 
		{
			for(Unit p: unitPlayer)
			{
				if(p.getY() + 1 == enemyBase.getLocation())//location of player base
				{
					enemyBase.setHealth(enemyBase.getHealth() - p.getDamage());
					p.setMove(false);
				}
				else
				{
					p.setMove(true);
				}
			}
		}
		
	}
	
	public void move()
	{
		for(Unit p : unitPlayer)
		{
			if(p.canMove() == true)
				{
					p.setY(p.getY() + 100);
				}
		}
		for(Unit e : unitEnemy)
		{
			if(e.canMove() == true)
			{
				e.setY(e.getY() - 100);
			}
		}
	}
	
	public int getPlayerHealth()
	{
		return playerBase.getHealth();
	}
	public int getEnemyHealth()
	{
		return enemyBase.getHealth();
	}
	public int getResource()
	{
		return resource;
	}
}

