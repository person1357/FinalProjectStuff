

public class RunnerClass {
	private static unitArray unitPlayer;
	private static unitArray unitEnemy;
	private int count;
	}
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
		ResourceGenerator RGen = new ResourceGenerator();
		RGen.addResources(10);
		
	} 
	public static void createUnit(int a) {
		int b = .getResources();
		if (a==1 && b >= 100)
		{
			unit1.makeUnit(1);
			b = resources - 100;
			//implement makeunit
			//subtract resources
		}
		if (a==2 && b >= 130)
		{
			
		}if (a==3 && b >= 170)
		{
			
		}if (a==4 && b >= 250)
		{
			
		}if (a==5 && b >= 270)
		{
			
		}if (a==6 && b >= 300)
		{
			
		}if (a==7 && b >= 450)
		{
			
		}
	}

}
