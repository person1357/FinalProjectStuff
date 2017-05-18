

public class RunnerClass {
	private static unitArray unitPlayer;
	private static unitArray unitEnemy;
	private int count;
	private int resource;
	
	public static void main(String[] args)
	{
	    guiC game = new guiC();
	   // JFrame f = new JFrame("MLG StickFight");
	  //  game.initFrame(f);
	    //initialize array for units
	    unitPlayer = new unitArray();
	    
	    //initialize int resource
	}
	public static void update() {
		count++;
		resource += 10;
		
	} 
	public static void createUnit(int a) {
		int b = RGen.getResources();
		if (a==1 && b >= 100)
		{
			unit1.makeUnit(1);
			
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
	public static void makeEnemy()
	{
	}
		
}
