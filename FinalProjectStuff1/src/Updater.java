

public class Updater {
	private unitArray unitPlayer;
	private unitArray unitEnemy;
	private Base playerBase;
	private Base enemyBase;
	private int count;
	private int resource;
	public Updater()
	{
		count = 0;
	    //initialize array for player and enemy units
	    unitPlayer = new unitArray();
	    unitEnemy = new unitArray();
	    //initialize bases
	    playerBase = new Base(0);
	    enemyBase = new Base(8);
	    //initialize int resource
	    resource = 0;
	}
	public void update() {
		resource += 10;
		count++;
	} 
	public void createUnit(int a) {
		if (a==1 && resource >= 100)
		{
			unitPlayer.makeUnit(1);
			resource = resource - 100;
		}
		else if (a==2 && resource >= 130)
		{
			unitPlayer.makeUnit(2);
			resource = resource - 130;
		}
		else if (a==3 && resource >= 170)
		{
			unitPlayer.makeUnit(3);
			resource = resource - 170;
		}
		else if (a==4 && resource >= 250)
		{
			unitPlayer.makeUnit(4);
			resource = resource - 250;
		}
		else if (a==5 && resource >= 270)
		{
			unitPlayer.makeUnit(5);
			resource = resource - 270;
		}
		else if (a==6 && resource >= 300)
		{
			unitPlayer.makeUnit(6);
			resource = resource - 300;
		}
		else if (a==7 && resource >= 450)
		{
			unitPlayer.makeUnit(7);
			resource = resource - 450;
		}
	}
	public void makeEnemy()
	{
		if(count%180 == 0)
		{
			unitEnemy.makeUnit(7)
		}
		public void makeUnit(int unitID)
	    {

	        if(unitID == 1)
	        {
	            Unit u1 = new Unit(1, 50, 10, 100);
	            info.add(u1);
	        }
	        if(unitID == 2)
	        {
	            Unit u2 = new Unit(2, 70, 20, 130);
	            info.add(u2);
	        }
	        if(unitID == 3)
	        {
	            Unit u3 = new Unit(3, 90, 30, 170);
	            info.add(u3);
	        }
	        if(unitID == 4)
	        {
	            Unit u4 = new Unit(4, 110, 50, 250);
	            info.add(u4);
	        }
	        if(unitID == 5)
	        {
	            Unit u5 = new Unit(5, 130, 60, 270);
	            info.add(u5);
	        }
	        if(unitID == 6)
	        {
	            Unit u6 = new Unit(6, 150, 80, 300);
	            info.add(u6);
	        }
	        if(unitID == 7)
	        {
	            Unit u7 = new Unit(7, 250, 110, 450);
	            info.add(u7);
	        }
	        if(unitID == 8)
	        {
	        	Unit u8 = new Unit(0, )
	        }
	    }
}
	
