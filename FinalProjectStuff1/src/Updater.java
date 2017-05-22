

public class Updater {
	private unitArray unitPlayer;
	private unitArray unitEnemy;
	private Base playerBase;
	private Base enemyBase;
	private int count;
	private int resource;
	public Updater()
	{
	    //initialize array for units
	    unitPlayer = new unitArray();
	    
	    //initialize int resource
	    
	}
	public void update() {
		resources = 
	} 
	public void createUnit(int a) {
		if (a==1 && b >= 100)
		{
			unitPlayer.makeUnit(1);
			
			//implement makeunit
			//subtract resources
		}
		else if (a==2 && b >= 130)
		{
			
		}
		else if (a==3 && b >= 170)
		{
			
		}
		else if (a==4 && b >= 250)
		{
			
		}
		else if (a==5 && b >= 270)
		{
			
		}
		else if (a==6 && b >= 300)
		{
			
		}
		else if (a==7 && b >= 450)
		{
			
		}
	}
	public void makeEnemy()
	{
	}
	public String checkWin()
	{
		if(enemyBase.getHealth() == 0)
		{
			return "YOU WIN";
			//need to set up a textfield in GUI that displays this message
		}
		else if (playerBase.getHealth() == 0)
		{
			return "YOU LOSE";
		}
		return "GAME IN PROCESS";//this is not very necessary can be an empty string
	}
	
	public void checkUnit()
	{
		for (Unit p : unitPlayer)
		{
			for (Unit e: unitEnemy)
			{
				if(p.getLoc() == e.getLoc())
				{
					p.setHealth(p.getHealth() - e.getDamage());
					e.setHealth(e.getHealth() - p.getDamage());
				}
			}
		}
		
	}
	public void checkAttackPlayerBase()
	{
		for (Unit e: unitEnemy)
		{
			if(e.getLoc() + 1 == 8)//location of enemy base
			{
				playerBase.setHealth(playerBase.getHealth() - e.getDamage());
			}
		}
	}
	
	public void checkAttackEnemyBase()
	{
		for(Unit p: unitPlayer)
		{
			if(p.getLoc() - 1 == 0)//location of player base
			{
				enemyBase.setHealth(enemyBase.getHealth() - p.getDamage());
			}
		}
	}
}
